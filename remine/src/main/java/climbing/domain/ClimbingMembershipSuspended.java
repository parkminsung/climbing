package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ClimbingMembershipSuspended extends AbstractEvent {

    private Long id;
    private String mebershipId;
    private String remainingMembershipCount;
    private String status;

    public ClimbingMembershipSuspended(MembershipRemine aggregate) {
        super(aggregate);
    }

    public ClimbingMembershipSuspended() {
        super();
    }
}
//>>> DDD / Domain Event
