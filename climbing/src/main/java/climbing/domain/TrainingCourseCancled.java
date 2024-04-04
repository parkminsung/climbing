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
    private String trainingCourseId;
    private String trainingCourseStartTime;
    private String trainingCourseEndTime;
    private String membershipId;

    public TrainingCourseCancled(ClimbingTrainingCourseTicket aggregate) {
        super(aggregate);
    }

    public TrainingCourseCancled() {
        super();
    }
}
//>>> DDD / Domain Event
