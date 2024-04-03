package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class TrainingCourseCancled extends AbstractEvent {

    private Long id;

    public TrainingCourseCancled(ClimbingTrainingCourseTicket aggregate) {
        super(aggregate);
    }

    public TrainingCourseCancled() {
        super();
    }
}
//>>> DDD / Domain Event
