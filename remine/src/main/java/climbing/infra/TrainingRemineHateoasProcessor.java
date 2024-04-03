package climbing.infra;

import climbing.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class TrainingRemineHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TrainingRemine>> {

    @Override
    public EntityModel<TrainingRemine> process(
        EntityModel<TrainingRemine> model
    ) {
        return model;
    }
}
