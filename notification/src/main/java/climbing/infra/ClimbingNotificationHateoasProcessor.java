package climbing.infra;

import climbing.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ClimbingNotificationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ClimbingNotification>> {

    @Override
    public EntityModel<ClimbingNotification> process(
        EntityModel<ClimbingNotification> model
    ) {
        return model;
    }
}
