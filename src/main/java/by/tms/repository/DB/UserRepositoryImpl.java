package by.tms.repository.DB;

import by.tms.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*@Repository
@Transactional*/
/*public class UserRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public User findUserById(int id) {
        return entityManager.find(User.class, id);
    }

    public void saveUser(User user) {
        entityManager.persist(user);
    }

    public User findUser(User user) {
        String query = "select User from User u where u.name = :name and u.age = :age";
        return (User) entityManager.createQuery(query)
                .setParameter("name", user.getName())
                .setParameter("age", user.getAge())
                .getSingleResult();
    }
}*/
