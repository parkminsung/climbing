package climbing.infra;

import climbing.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "pricePolicies",
    path = "pricePolicies"
)
public interface PricePolicyRepository
    extends PagingAndSortingRepository<PricePolicy, Long> {}
