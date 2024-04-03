package climbing.domain;

import climbing.TrainingCourseApplication;
import climbing.domain.TrainingCourseCanceled;
import climbing.domain.TrainingCourseOpened;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ClimbingTrainingCourseInfo_table")
@Data
//<<< DDD / Aggregate Root
public class ClimbingTrainingCourseInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String trainingCourseId;

    private String trainingCourseStartTime;

    private String trainingCourseEndTime;

    @PostPersist
    public void onPostPersist() {
        TrainingCourseOpened trainingCourseOpened = new TrainingCourseOpened(
            this
        );
        trainingCourseOpened.publishAfterCommit();

        TrainingCourseCanceled trainingCourseCanceled = new TrainingCourseCanceled(
            this
        );
        trainingCourseCanceled.publishAfterCommit();
    }

    public static ClimbingTrainingCourseInfoRepository repository() {
        ClimbingTrainingCourseInfoRepository climbingTrainingCourseInfoRepository = TrainingCourseApplication.applicationContext.getBean(
            ClimbingTrainingCourseInfoRepository.class
        );
        return climbingTrainingCourseInfoRepository;
    }
}
//>>> DDD / Aggregate Root
