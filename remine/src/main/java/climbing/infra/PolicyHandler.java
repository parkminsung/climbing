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
    MembershipRemineRepository membershipRemineRepository;

    @Autowired
    TrainingRemineRepository trainingRemineRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClimbingMembershipPurchased'"
    )
    public void wheneverClimbingMembershipPurchased_UpdateStatus(
        @Payload ClimbingMembershipPurchased climbingMembershipPurchased
    ) {
        ClimbingMembershipPurchased event = climbingMembershipPurchased;
        System.out.println(
            "\n\n##### listener UpdateStatus : " +
            climbingMembershipPurchased +
            "\n\n"
        );

        // Sample Logic //
        MembershipRemine.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClimbingMembershipCanceled'"
    )
    public void wheneverClimbingMembershipCanceled_UpdateStatus(
        @Payload ClimbingMembershipCanceled climbingMembershipCanceled
    ) {
        ClimbingMembershipCanceled event = climbingMembershipCanceled;
        System.out.println(
            "\n\n##### listener UpdateStatus : " +
            climbingMembershipCanceled +
            "\n\n"
        );

        // Sample Logic //
        MembershipRemine.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClimbingMembershipSuspended'"
    )
    public void wheneverClimbingMembershipSuspended_UpdateStatus(
        @Payload ClimbingMembershipSuspended climbingMembershipSuspended
    ) {
        ClimbingMembershipSuspended event = climbingMembershipSuspended;
        System.out.println(
            "\n\n##### listener UpdateStatus : " +
            climbingMembershipSuspended +
            "\n\n"
        );

        // Sample Logic //
        MembershipRemine.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TrainingCoursePurchased'"
    )
    public void wheneverTrainingCoursePurchased_UpdateStatus(
        @Payload TrainingCoursePurchased trainingCoursePurchased
    ) {
        TrainingCoursePurchased event = trainingCoursePurchased;
        System.out.println(
            "\n\n##### listener UpdateStatus : " +
            trainingCoursePurchased +
            "\n\n"
        );

        // Sample Logic //
        TrainingRemine.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TrainingCourseCancled'"
    )
    public void wheneverTrainingCourseCancled_UpdateStatus(
        @Payload TrainingCourseCancled trainingCourseCancled
    ) {
        TrainingCourseCancled event = trainingCourseCancled;
        System.out.println(
            "\n\n##### listener UpdateStatus : " +
            trainingCourseCancled +
            "\n\n"
        );

        // Sample Logic //
        TrainingRemine.updateStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
