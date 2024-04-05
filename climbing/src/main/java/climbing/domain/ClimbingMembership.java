package climbing.domain;

import climbing.ClimbingApplication;
import climbing.domain.ClimbingMembershipPurchased;
import climbing.domain.ClimbingMembershipStoped;
import climbing.domain.ClimbingMembershipUsed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ClimbingMembership_table")
@Data
//<<< DDD / Aggregate Root
public class ClimbingMembership {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String membershipId;

    private Date purchaseDate;

    private Date purchaseFreezeDate;

    private Date membershipUseDate;

    @PostPersist
    public void onPostPersist() {
        ClimbingMembershipStoped climbingMembershipStoped = new ClimbingMembershipStoped(
            this
        );
        climbingMembershipStoped.publishAfterCommit();

        ClimbingMembershipPurchased climbingMembershipPurchased = new ClimbingMembershipPurchased(
            this
        );
        climbingMembershipPurchased.publishAfterCommit();

        ClimbingMembershipUsed climbingMembershipUsed = new ClimbingMembershipUsed(
            this
        );
        climbingMembershipUsed.publishAfterCommit();
    }

    public static ClimbingMembershipRepository repository() {
        ClimbingMembershipRepository climbingMembershipRepository = ClimbingApplication.applicationContext.getBean(
            ClimbingMembershipRepository.class
        );
        return climbingMembershipRepository;
    }
}
//>>> DDD / Aggregate Root
