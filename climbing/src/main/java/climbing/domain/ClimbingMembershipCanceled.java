package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ClimbingMembershipCanceled extends AbstractEvent {

    private Long id;

    public ClimbingMembershipCanceled(ClimbingMembership aggregate) {
        super(aggregate);
    }

    public ClimbingMembershipCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
