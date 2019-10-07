package th.in.lordgift.service.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import th.in.lordgift.service.persistence.model.entity.MyUser;

@Repository
public interface MyUserPaging extends PagingAndSortingRepository<MyUser, Long> {

}
