package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class TrainingCourseCanceled extends AbstractEvent {

    private Long id;
    private String trainingCourseId;
    private String trainingCourseStartTime;
    private String trainingCourseEndTime;
}
