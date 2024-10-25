package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "filelocs", path = "filelocs")
public interface FilelocRepository
    extends PagingAndSortingRepository<Fileloc, Long> {}
