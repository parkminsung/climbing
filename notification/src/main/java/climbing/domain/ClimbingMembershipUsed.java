package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ClimbingMembershipUsed extends AbstractEvent {

    private Long id;
}
