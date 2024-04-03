package climbing.domain;

import climbing.domain.*;
import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "climbingTrainingCourseTickets",
    path = "climbingTrainingCourseTickets"
)
public interface ClimbingTrainingCourseTicketRepository
    extends PagingAndSortingRepository<ClimbingTrainingCourseTicket, Long> {}
