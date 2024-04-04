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
    private String mebershipId;
    private String puchaseFreezeDate;

    public ClimbingMembershipStoped(ClimbingMembership aggregate) {
        super(aggregate);
    }

    public ClimbingMembershipStoped() {
        super();
    }
}
//>>> DDD / Domain Event
