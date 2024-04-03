package climbing.domain;

import climbing.ClimbingApplication;
import climbing.domain.ClimbingMembershipCanceled;
import climbing.domain.ClimbingMembershipPurchased;
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

    private String puchaseCancelDate;

    @PostPersist
    public void onPostPersist() {
        ClimbingMembershipCanceled climbingMembershipCanceled = new ClimbingMembershipCanceled(
            this
        );
        climbingMembershipCanceled.publishAfterCommit();

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
