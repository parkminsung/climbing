package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class TrainingCourseCanceled extends AbstractEvent {

    private Long id;

    public TrainingCourseCanceled(ClimbingTrainingCourseInfo aggregate) {
        super(aggregate);
    }

    public TrainingCourseCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
