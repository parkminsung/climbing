package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RemainingMembershipCountDecreased extends AbstractEvent {

    private Long id;
    private String membershipId;
    private Long remainingMembershipCount;
    private String status;

    public RemainingMembershipCountDecreased(MembershipRemine aggregate) {
        super(aggregate);
    }

    public RemainingMembershipCountDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
