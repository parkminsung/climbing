package climbing.domain;

import climbing.ClimbingApplication;
import climbing.domain.ClimbingMembershipPurchased;
import climbing.domain.ClimbingMembershipStoped;
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

    private String mebershipId;

    private String purchaseDate;

    private String purchaseFreezeDate;

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
    }

    public static ClimbingMembershipRepository repository() {
        ClimbingMembershipRepository climbingMembershipRepository = ClimbingApplication.applicationContext.getBean(
            ClimbingMembershipRepository.class
        );
        return climbingMembershipRepository;
    }
}
//>>> DDD / Aggregate Root
