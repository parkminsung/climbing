package climbing.domain;

import climbing.NotificationApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ClimbingNotification_table")
@Data
//<<< DDD / Aggregate Root
public class ClimbingNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String membershipId;

    private String message;

    public static ClimbingNotificationRepository repository() {
        ClimbingNotificationRepository climbingNotificationRepository = NotificationApplication.applicationContext.getBean(
            ClimbingNotificationRepository.class
        );
        return climbingNotificationRepository;
    }

    //<<< Clean Arch / Port Method
    public static void alertToUser(
        TrainingCourseCanceled trainingCourseCanceled
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingNotification climbingNotification = new ClimbingNotification();
        repository().save(climbingNotification);

        */

        /** Example 2:  finding and process
        
        repository().findById(trainingCourseCanceled.get???()).ifPresent(climbingNotification->{
            
            climbingNotification // do something
            repository().save(climbingNotification);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(TrainingCourseOpened trainingCourseOpened) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingNotification climbingNotification = new ClimbingNotification();
        repository().save(climbingNotification);

        */

        /** Example 2:  finding and process
        
        repository().findById(trainingCourseOpened.get???()).ifPresent(climbingNotification->{
            
            climbingNotification // do something
            repository().save(climbingNotification);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(
        TrainingCoursePurchased trainingCoursePurchased
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingNotification climbingNotification = new ClimbingNotification();
        repository().save(climbingNotification);

        */

        /** Example 2:  finding and process
        
        repository().findById(trainingCoursePurchased.get???()).ifPresent(climbingNotification->{
            
            climbingNotification // do something
            repository().save(climbingNotification);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(
        TrainingCourseCancled trainingCourseCancled
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingNotification climbingNotification = new ClimbingNotification();
        repository().save(climbingNotification);

        */

        /** Example 2:  finding and process
        
        repository().findById(trainingCourseCancled.get???()).ifPresent(climbingNotification->{
            
            climbingNotification // do something
            repository().save(climbingNotification);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(
        ClimbingMembershipUsed climbingMembershipUsed
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingNotification climbingNotification = new ClimbingNotification();
        repository().save(climbingNotification);

        */

        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipUsed.get???()).ifPresent(climbingNotification->{
            
            climbingNotification // do something
            repository().save(climbingNotification);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(
        ClimbingMembershipSuspended climbingMembershipSuspended
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingNotification climbingNotification = new ClimbingNotification();
        repository().save(climbingNotification);

        */

        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipSuspended.get???()).ifPresent(climbingNotification->{
            
            climbingNotification // do something
            repository().save(climbingNotification);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(
        ClimbingMembershipPurchased climbingMembershipPurchased
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingNotification climbingNotification = new ClimbingNotification();
        repository().save(climbingNotification);

        */

        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipPurchased.get???()).ifPresent(climbingNotification->{
            
            climbingNotification // do something
            repository().save(climbingNotification);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(
        ClimbingMembershipStoped climbingMembershipStoped
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingNotification climbingNotification = new ClimbingNotification();
        repository().save(climbingNotification);

        */

        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipStoped.get???()).ifPresent(climbingNotification->{
            
            climbingNotification // do something
            repository().save(climbingNotification);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(
        ClimbingMembershipStoped climbingMembershipStoped
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingNotification climbingNotification = new ClimbingNotification();
        repository().save(climbingNotification);

        */

        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipStoped.get???()).ifPresent(climbingNotification->{
            
            climbingNotification // do something
            repository().save(climbingNotification);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(ClimbingTrainingUsed climbingTrainingUsed) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingNotification climbingNotification = new ClimbingNotification();
        repository().save(climbingNotification);

        */

        /** Example 2:  finding and process
        
        repository().findById(climbingTrainingUsed.get???()).ifPresent(climbingNotification->{
            
            climbingNotification // do something
            repository().save(climbingNotification);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertToUser(
        ClimbingTrainingSuspended climbingTrainingSuspended
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ClimbingNotification climbingNotification = new ClimbingNotification();
        repository().save(climbingNotification);

        */

        /** Example 2:  finding and process
        
        repository().findById(climbingTrainingSuspended.get???()).ifPresent(climbingNotification->{
            
            climbingNotification // do something
            repository().save(climbingNotification);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
