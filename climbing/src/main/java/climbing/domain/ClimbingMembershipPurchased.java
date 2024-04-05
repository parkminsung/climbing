package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ClimbingMembershipPurchased extends AbstractEvent {

    private Long id;
    private String membershipId;
    private Date purchaseDate;

    public ClimbingMembershipPurchased(ClimbingMembership aggregate) {
        super(aggregate);
    }

    public ClimbingMembershipPurchased() {
        super();
    }
}
//>>> DDD / Domain Event
