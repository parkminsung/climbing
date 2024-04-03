package climbing.domain;

import climbing.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "membershipRemines",
    path = "membershipRemines"
)
public interface MembershipRemineRepository
    extends PagingAndSortingRepository<MembershipRemine, Long> {}
