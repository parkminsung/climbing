package climbing.domain;

import climbing.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "trainingRemines",
    path = "trainingRemines"
)
public interface TrainingRemineRepository
    extends PagingAndSortingRepository<TrainingRemine, Long> {}
