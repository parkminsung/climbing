package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReminingTrainingCountDecreased extends AbstractEvent {

    private Long id;
    private String membershipId;
    private Long remainingTrainingCount;
    private String status;

    public ReminingTrainingCountDecreased(TrainingRemine aggregate) {
        super(aggregate);
    }

    public ReminingTrainingCountDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
