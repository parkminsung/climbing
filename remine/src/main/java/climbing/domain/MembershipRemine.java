package climbing.domain;

import climbing.RemineApplication;
import climbing.domain.ClimbingMembershipSuspended;
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

    private String mebershipId;

    private String remainingMembershipCount;

    private String status;

    @PostPersist
    public void onPostPersist() {
        ClimbingMembershipUsed climbingMembershipUsed = new ClimbingMembershipUsed(
            this
        );
        climbingMembershipUsed.publishAfterCommit();

        ClimbingMembershipSuspended climbingMembershipSuspended = new ClimbingMembershipSuspended(
            this
        );
        climbingMembershipSuspended.publishAfterCommit();
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
        MembershipRemine membershipRemine = repository().findByMembershipId(climbingMembershipPurchased.getMebershipId());
        if (membershipRemine != null) {
            membershipRemine.setStatus("PURCHASE");
        }
        // repository().findByMembershipId(climbingMembershipPurchased.getMebershipId()).ifPresent(
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

        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipStoped.get???()).ifPresent(membershipRemine->{
            
            membershipRemine // do something
            repository().save(membershipRemine);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(
        ClimbingMembershipSuspended climbingMembershipSuspended
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        MembershipRemine membershipRemine = new MembershipRemine();
        repository().save(membershipRemine);

        */

        /** Example 2:  finding and process
        
        repository().findById(climbingMembershipSuspended.get???()).ifPresent(membershipRemine->{
            
            membershipRemine // do something
            repository().save(membershipRemine);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
