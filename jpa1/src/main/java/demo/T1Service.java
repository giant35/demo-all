package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

@Service
public class T1Service {
    @Autowired
    T1Repo t1Repo;
    @PersistenceContext
    EntityManager em;

    @Transactional
    public void test(int id) {
        T1 t1 = t1Repo.getOne(id);
        t1.setName("tt" + new Date());
    }

    @Transactional
    public void test2(int id) {
        T1 t1 = em.find(T1.class, id);
        t1.setName("tt" + new Date());
    }
}
