package climbing.domain;

import climbing.RemineApplication;
import climbing.domain.RemainingMembershipCountDecreased;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MembershipRemine_table")
@Data
//<<< DDD / Aggregate Root
public class MembershipRemine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String membershipId;

    private Long remainingMembershipCount;

    private String status;

    @PostUpdate
    public void onPostUpdate() {
        RemainingMembershipCountDecreased remainingMembershipCountDecreased = new RemainingMembershipCountDecreased(
            this
        );
        remainingMembershipCountDecreased.publishAfterCommit();
    }

    public static MembershipRemineRepository repository() {
        MembershipRemineRepository membershipRemineRepository = RemineApplication.applicationContext.getBean(
            MembershipRemineRepository.class
        );
        return membershipRemineRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateStatus(
        ClimbingMembershipPurchased climbingMembershipPurchased
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        MembershipRemine membershipRemine = new MembershipRemine();
        repository().save(membershipRemine);

        */

        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipPurchased.get???()).ifPresent(membershipRemine->{
            
            membershipRemine // do something
            repository().save(membershipRemine);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(
        ClimbingMembershipStoped climbingMembershipStoped
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        MembershipRemine membershipRemine = new MembershipRemine();
        repository().save(membershipRemine);

        */

        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipStoped.get???()).ifPresent(membershipRemine->{
            
            membershipRemine // do something
            repository().save(membershipRemine);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void decreaseRemainingMembershipCount(
        ClimbingMembershipUsed climbingMembershipUsed
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        MembershipRemine membershipRemine = new MembershipRemine();
        repository().save(membershipRemine);

        RemainingMembershipCountDecreased remainingMembershipCountDecreased = new RemainingMembershipCountDecreased(membershipRemine);
        remainingMembershipCountDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipUsed.get???()).ifPresent(membershipRemine->{
            
            membershipRemine // do something
            repository().save(membershipRemine);

            RemainingMembershipCountDecreased remainingMembershipCountDecreased = new RemainingMembershipCountDecreased(membershipRemine);
            remainingMembershipCountDecreased.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
