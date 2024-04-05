package climbing.domain;

import climbing.domain.*;
import climbing.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class TrainingCourseOpened extends AbstractEvent {

    private Long id;
    private String trainingCourseId;
    private Date trainingCourseStartTime;
    private Date trainingCourseEndTime;
}
