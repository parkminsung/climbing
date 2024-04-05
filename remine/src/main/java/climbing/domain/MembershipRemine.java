package climbing.domain;

import climbing.RemineApplication;
import climbing.domain.ClimbingMembershipUsed;
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

    @PostPersist
    public void onPostPersist() {
        ClimbingMembershipUsed climbingMembershipUsed = new ClimbingMembershipUsed(
            this
        );
        climbingMembershipUsed.publishAfterCommit();
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
        MembershipRemine membershipRemine = repository().findByMembershipId(climbingMembershipPurchased.getMembershipId());
        if (membershipRemine != null) {
            membershipRemine.setStatus("PURCHASE");
            repository().save(membershipRemine);
        }
        // repository().findByMembershipId(climbingMembershipPurchased.getMembershipId()).ifPresent(
        //     membershipRemine->{
        //         membershipRemine.setStatus("PURCHASE");
        //     }
        // );

        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipPurchased.get???()).ifPresent(membershipRemine->{
            
            membershipRemine // do something
            repository().save(membershipRemine);


         });
        private void ifPresent(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ifPresent'");
    }

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

        MembershipRemine membershipRemine = repository().findByMembershipId(climbingMembershipStoped.getMembershipId());
        if (membershipRemine != null) {
            membershipRemine.setStatus("STOP");
            repository().save(membershipRemine);
        }


        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipStoped.get???()).ifPresent(membershipRemine->{
            
            membershipRemine // do something
            repository().save(membershipRemine);


         });
        */

    }
    //>>> Clean Arch / Port Method

    public static void decreaseRemainingMembershipCount(
        ClimbingMembershipUsed climbingMembershipUsed
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        MembershipRemine membershipRemine = new MembershipRemine();
        repository().save(membershipRemine);

        */

        MembershipRemine membershipRemine = repository().findByMembershipId(climbingMembershipUsed.getMembershipId());
        if (membershipRemine != null && climbingMembershipUsed != null && climbingMembershipUsed.getRemainingMembershipCount() != 0) {
            membershipRemine.setRemainingMembershipCount(climbingMembershipUsed.getRemainingMembershipCount() - 1);
            repository().save(membershipRemine);
        }


        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipStoped.get???()).ifPresent(membershipRemine->{
            
            membershipRemine // do something
            repository().save(membershipRemine);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
