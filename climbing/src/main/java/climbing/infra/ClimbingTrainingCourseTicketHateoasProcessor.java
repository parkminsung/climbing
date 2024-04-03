package climbing.infra;

import climbing.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ClimbingTrainingCourseTicketHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<ClimbingTrainingCourseTicket>> {

    @Override
    public EntityModel<ClimbingTrainingCourseTicket> process(
        EntityModel<ClimbingTrainingCourseTicket> model
    ) {
        return model;
    }
}
