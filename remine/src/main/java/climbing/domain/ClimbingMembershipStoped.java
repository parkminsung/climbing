package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ClimbingMembershipStoped extends AbstractEvent {

    private Long id;
    private String membershipId;
    private String puchaseFreezeDate;
}
