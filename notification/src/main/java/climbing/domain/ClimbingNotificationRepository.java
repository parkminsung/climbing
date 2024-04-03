package climbing.domain;

import climbing.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "climbingNotifications",
    path = "climbingNotifications"
)
public interface ClimbingNotificationRepository
    extends PagingAndSortingRepository<ClimbingNotification, Long> {}
