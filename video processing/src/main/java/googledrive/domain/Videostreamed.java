package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Videostreamed extends AbstractEvent {

    private Long id;

    public Videostreamed(Video aggregate) {
        super(aggregate);
    }

    public Videostreamed() {
        super();
    }
}
//>>> DDD / Domain Event
