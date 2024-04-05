package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ClimbingMembershipStoped extends AbstractEvent {

    private Long id;
    private String membershipId;
    private Date puchaseFreezeDate;

    public ClimbingMembershipStoped(ClimbingMembership aggregate) {
        super(aggregate);
    }

    public ClimbingMembershipStoped() {
        super();
    }
}
//>>> DDD / Domain Event
