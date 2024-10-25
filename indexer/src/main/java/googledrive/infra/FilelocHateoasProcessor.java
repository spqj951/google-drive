package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FilelocHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Fileloc>> {

    @Override
    public EntityModel<Fileloc> process(EntityModel<Fileloc> model) {
        return model;
    }
}
