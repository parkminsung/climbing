package climbing.domain;

import climbing.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "climbingTrainingCourseInfos",
    path = "climbingTrainingCourseInfos"
)
public interface ClimbingTrainingCourseInfoRepository
    extends PagingAndSortingRepository<ClimbingTrainingCourseInfo, Long> {}
