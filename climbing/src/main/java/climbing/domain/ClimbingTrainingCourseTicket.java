package climbing.domain;

import climbing.ClimbingApplication;
import climbing.domain.TrainingCourseCancled;
import climbing.domain.TrainingCoursePurchased;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ClimbingTrainingCourseTicket_table")
@Data
//<<< DDD / Aggregate Root
public class ClimbingTrainingCourseTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String trainingCourseId;

    private Date trainingCourseStartTime;

    private Date trainingCourseEndTime;

    private String membershipId;

    @PostPersist
    public void onPostPersist() {
        TrainingCoursePurchased trainingCoursePurchased = new TrainingCoursePurchased(
            this
        );
        trainingCoursePurchased.publishAfterCommit();

        TrainingCourseCancled trainingCourseCancled = new TrainingCourseCancled(
            this
        );
        trainingCourseCancled.publishAfterCommit();
    }

    public static ClimbingTrainingCourseTicketRepository repository() {
        ClimbingTrainingCourseTicketRepository climbingTrainingCourseTicketRepository = ClimbingApplication.applicationContext.getBean(
            ClimbingTrainingCourseTicketRepository.class
        );
        return climbingTrainingCourseTicketRepository;
    }

    //<<< Clean Arch / Port Method
    public static void notifyTrainingCourseOpend(
        TrainingCourseOpened trainingCourseOpened
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingTrainingCourseTicket climbingTrainingCourseTicket = new ClimbingTrainingCourseTicket();
        repository().save(climbingTrainingCourseTicket);

        */

        /** Example 2:  finding and process
        
        repository().findById(trainingCourseOpened.get???()).ifPresent(climbingTrainingCourseTicket->{
            
            climbingTrainingCourseTicket // do something
            repository().save(climbingTrainingCourseTicket);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void notifyTrainingCourseCanceled(
        TrainingCourseCanceled trainingCourseCanceled
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingTrainingCourseTicket climbingTrainingCourseTicket = new ClimbingTrainingCourseTicket();
        repository().save(climbingTrainingCourseTicket);

        */

        /** Example 2:  finding and process
        
        repository().findById(trainingCourseCanceled.get???()).ifPresent(climbingTrainingCourseTicket->{
            
            climbingTrainingCourseTicket // do something
            repository().save(climbingTrainingCourseTicket);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
