package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class TrainingCoursePurchased extends AbstractEvent {

    private Long id;
    private String trainingCourseId;
    private Date trainingCourseStartTime;
    private Date trainingCourseEndTime;
    private String membershipId;

    public TrainingCoursePurchased(ClimbingTrainingCourseTicket aggregate) {
        super(aggregate);
    }

    public TrainingCoursePurchased() {
        super();
    }
}
//>>> DDD / Domain Event
