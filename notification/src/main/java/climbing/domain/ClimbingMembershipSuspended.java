package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ClimbingMembershipSuspended extends AbstractEvent {

    private Long id;
}
