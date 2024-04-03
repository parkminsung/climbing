package climbing.infra;

import climbing.config.kafka.KafkaProcessor;
import climbing.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    ClimbingMembershipRepository climbingMembershipRepository;

    @Autowired
    ClimbingTrainingCourseTicketRepository climbingTrainingCourseTicketRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TrainingCourseOpened'"
    )
    public void wheneverTrainingCourseOpened_NotifyTrainingCourseOpend(
        @Payload TrainingCourseOpened trainingCourseOpened
    ) {
        TrainingCourseOpened event = trainingCourseOpened;
        System.out.println(
            "\n\n##### listener NotifyTrainingCourseOpend : " +
            trainingCourseOpened +
            "\n\n"
        );

        // Sample Logic //
        ClimbingTrainingCourseTicket.notifyTrainingCourseOpend(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TrainingCourseCanceled'"
    )
    public void wheneverTrainingCourseCanceled_NotifyTrainingCourseCanceled(
        @Payload TrainingCourseCanceled trainingCourseCanceled
    ) {
        TrainingCourseCanceled event = trainingCourseCanceled;
        System.out.println(
            "\n\n##### listener NotifyTrainingCourseCanceled : " +
            trainingCourseCanceled +
            "\n\n"
        );

        // Sample Logic //
        ClimbingTrainingCourseTicket.notifyTrainingCourseCanceled(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
