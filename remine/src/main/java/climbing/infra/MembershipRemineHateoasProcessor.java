package climbing.infra;

import climbing.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MembershipRemineHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MembershipRemine>> {

    @Override
    public EntityModel<MembershipRemine> process(
        EntityModel<MembershipRemine> model
    ) {
        return model;
    }
}
