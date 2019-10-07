package th.in.lordgift.service.persistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import th.in.lordgift.service.persistence.model.entity.MyUser;
import th.in.lordgift.service.persistence.repository.PersistenceRepository;
import th.in.lordgift.service.persistence.repository.QueryRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ServiceManager {

    private final PersistenceRepository persistence;
    private final QueryRepository query;

    @Autowired
    public ServiceManager(PersistenceRepository persistence, QueryRepository query) {
        this.persistence = persistence;
        this.query = query;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public MyUser addMyUser(MyUser myUser) {
        myUser.setLastUpdated(LocalDateTime.now());
        return persistence.addMyUser(myUser);
    }

    public List<MyUser> queryMyUser() {
        return query.queryMyUser();
    }
}
