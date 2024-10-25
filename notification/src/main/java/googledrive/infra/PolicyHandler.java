package googledrive.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import googledrive.config.kafka.KafkaProcessor;
import googledrive.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotiRepository notiRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Videostreamed'"
    )
    public void wheneverVideostreamed_VideoStreamUrl(
        @Payload Videostreamed videostreamed
    ) {
        Videostreamed event = videostreamed;
        System.out.println(
            "\n\n##### listener VideoStreamUrl : " + videostreamed + "\n\n"
        );

        // REST Request Sample

        // notiService.getNoti(/** mapping value needed */);

        // Sample Logic //
        Noti.videoStreamUrl(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Indexed'"
    )
    public void wheneverIndexed_IndexNoti(@Payload Indexed indexed) {
        Indexed event = indexed;
        System.out.println(
            "\n\n##### listener IndexNoti : " + indexed + "\n\n"
        );

        // Sample Logic //
        Noti.indexNoti(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
