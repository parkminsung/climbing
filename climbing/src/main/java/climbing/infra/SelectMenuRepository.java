package climbing.infra;

import climbing.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "selectMenus",
    path = "selectMenus"
)
public interface SelectMenuRepository
    extends PagingAndSortingRepository<SelectMenu, Long> {}
