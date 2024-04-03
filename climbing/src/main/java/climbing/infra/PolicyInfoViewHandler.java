package climbing.infra;

import climbing.config.kafka.KafkaProcessor;
import climbing.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyInfoViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private PolicyInfoRepository policyInfoRepository;
    //>>> DDD / CQRS
}
