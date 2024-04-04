package climbing.domain;

import climbing.RemineApplication;
import climbing.domain.ClimbingTrainingSuspended;
import climbing.domain.ClimbingTrainingUsed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TrainingRemine_table")
@Data
//<<< DDD / Aggregate Root
public class TrainingRemine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String membershipId;

    private String remainingTrainingCount;

    private String status;

    @PostPersist
    public void onPostPersist() {
        ClimbingTrainingUsed climbingTrainingUsed = new ClimbingTrainingUsed(
            this
        );
        climbingTrainingUsed.publishAfterCommit();

        ClimbingTrainingSuspended climbingTrainingSuspended = new ClimbingTrainingSuspended(
            this
        );
        climbingTrainingSuspended.publishAfterCommit();
    }

    public static TrainingRemineRepository repository() {
        TrainingRemineRepository trainingRemineRepository = RemineApplication.applicationContext.getBean(
            TrainingRemineRepository.class
        );
        return trainingRemineRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateStatus(
        TrainingCoursePurchased trainingCoursePurchased
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        TrainingRemine trainingRemine = new TrainingRemine();
        repository().save(trainingRemine);

        */

        TrainingRemine trainingRemine = repository().findByMembershipId(trainingCoursePurchased.getMembershipId());
        if (trainingRemine != null) {
            trainingRemine.setStatus("PURCHASE");
            repository().save(trainingRemine);
        }

        /** Example 2:  finding and process
        
        repository().findById(trainingCoursePurchased.get???()).ifPresent(trainingRemine->{
            
            trainingRemine // do something
            repository().save(trainingRemine);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(
        TrainingCourseCancled trainingCourseCancled
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        TrainingRemine trainingRemine = new TrainingRemine();
        repository().save(trainingRemine);

        */

        TrainingRemine trainingRemine = repository().findByMembershipId(trainingCourseCancled.getMembershipId());
        if (trainingRemine != null) {
            trainingRemine.setStatus("CANCLE");
            repository().save(trainingRemine);
        }

        /** Example 2:  finding and process
        
        repository().findById(trainingCourseCancled.get???()).ifPresent(trainingRemine->{
            
            trainingRemine // do something
            repository().save(trainingRemine);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
