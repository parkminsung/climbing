package climbing.infra;

import climbing.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ClimbingTrainingCourseInfoHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<ClimbingTrainingCourseInfo>> {

    @Override
    public EntityModel<ClimbingTrainingCourseInfo> process(
        EntityModel<ClimbingTrainingCourseInfo> model
    ) {
        return model;
    }
}
