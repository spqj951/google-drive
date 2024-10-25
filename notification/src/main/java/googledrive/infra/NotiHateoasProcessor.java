package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class NotiHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Noti>> {

    @Override
    public EntityModel<Noti> process(EntityModel<Noti> model) {
        return model;
    }
}
