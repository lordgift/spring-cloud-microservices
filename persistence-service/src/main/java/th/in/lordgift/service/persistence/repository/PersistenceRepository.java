package th.in.lordgift.service.persistence.repository;

import org.springframework.stereotype.Repository;
import th.in.lordgift.service.persistence.model.entity.MyUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PersistenceRepository {

    @PersistenceContext
    EntityManager entityManager;

    public MyUser addMyUser(MyUser myUser) {
        entityManager.persist(myUser);
        return myUser;
    }

}
