package climbing.infra;

import climbing.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ClimbingMembershipHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ClimbingMembership>> {

    @Override
    public EntityModel<ClimbingMembership> process(
        EntityModel<ClimbingMembership> model
    ) {
        return model;
    }
}
