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
    ClimbingNotificationRepository climbingNotificationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TrainingCourseCanceled'"
    )
    public void wheneverTrainingCourseCanceled_AlertToUser(
        @Payload TrainingCourseCanceled trainingCourseCanceled
    ) {
        TrainingCourseCanceled event = trainingCourseCanceled;
        System.out.println(
            "\n\n##### listener AlertToUser : " +
            trainingCourseCanceled +
            "\n\n"
        );

        // Sample Logic //
        ClimbingNotification.alertToUser(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TrainingCourseOpened'"
    )
    public void wheneverTrainingCourseOpened_AlertToUser(
        @Payload TrainingCourseOpened trainingCourseOpened
    ) {
        TrainingCourseOpened event = trainingCourseOpened;
        System.out.println(
            "\n\n##### listener AlertToUser : " + trainingCourseOpened + "\n\n"
        );

        // Sample Logic //
        ClimbingNotification.alertToUser(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TrainingCoursePurchased'"
    )
    public void wheneverTrainingCoursePurchased_AlertToUser(
        @Payload TrainingCoursePurchased trainingCoursePurchased
    ) {
        TrainingCoursePurchased event = trainingCoursePurchased;
        System.out.println(
            "\n\n##### listener AlertToUser : " +
            trainingCoursePurchased +
            "\n\n"
        );

        // Sample Logic //
        ClimbingNotification.alertToUser(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TrainingCourseCancled'"
    )
    public void wheneverTrainingCourseCancled_AlertToUser(
        @Payload TrainingCourseCancled trainingCourseCancled
    ) {
        TrainingCourseCancled event = trainingCourseCancled;
        System.out.println(
            "\n\n##### listener AlertToUser : " + trainingCourseCancled + "\n\n"
        );

        // Sample Logic //
        ClimbingNotification.alertToUser(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClimbingMembershipUsed'"
    )
    public void wheneverClimbingMembershipUsed_AlertToUser(
        @Payload ClimbingMembershipUsed climbingMembershipUsed
    ) {
        ClimbingMembershipUsed event = climbingMembershipUsed;
        System.out.println(
            "\n\n##### listener AlertToUser : " +
            climbingMembershipUsed +
            "\n\n"
        );

        // Sample Logic //
        ClimbingNotification.alertToUser(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClimbingMembershipPurchased'"
    )
    public void wheneverClimbingMembershipPurchased_AlertToUser(
        @Payload ClimbingMembershipPurchased climbingMembershipPurchased
    ) {
        ClimbingMembershipPurchased event = climbingMembershipPurchased;
        System.out.println(
            "\n\n##### listener AlertToUser : " +
            climbingMembershipPurchased +
            "\n\n"
        );

        // Sample Logic //
        ClimbingNotification.alertToUser(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClimbingMembershipStoped'"
    )
    public void wheneverClimbingMembershipStoped_AlertToUser(
        @Payload ClimbingMembershipStoped climbingMembershipStoped
    ) {
        ClimbingMembershipStoped event = climbingMembershipStoped;
        System.out.println(
            "\n\n##### listener AlertToUser : " +
            climbingMembershipStoped +
            "\n\n"
        );

        // Sample Logic //
        ClimbingNotification.alertToUser(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClimbingMembershipStoped'"
    )
    public void wheneverClimbingMembershipStoped_AlertToUser(
        @Payload ClimbingMembershipStoped climbingMembershipStoped
    ) {
        ClimbingMembershipStoped event = climbingMembershipStoped;
        System.out.println(
            "\n\n##### listener AlertToUser : " +
            climbingMembershipStoped +
            "\n\n"
        );

        // Sample Logic //
        ClimbingNotification.alertToUser(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClimbingTrainingUsed'"
    )
    public void wheneverClimbingTrainingUsed_AlertToUser(
        @Payload ClimbingTrainingUsed climbingTrainingUsed
    ) {
        ClimbingTrainingUsed event = climbingTrainingUsed;
        System.out.println(
            "\n\n##### listener AlertToUser : " + climbingTrainingUsed + "\n\n"
        );

        // Sample Logic //
        ClimbingNotification.alertToUser(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClimbingTrainingSuspended'"
    )
    public void wheneverClimbingTrainingSuspended_AlertToUser(
        @Payload ClimbingTrainingSuspended climbingTrainingSuspended
    ) {
        ClimbingTrainingSuspended event = climbingTrainingSuspended;
        System.out.println(
            "\n\n##### listener AlertToUser : " +
            climbingTrainingSuspended +
            "\n\n"
        );

        // Sample Logic //
        ClimbingNotification.alertToUser(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
