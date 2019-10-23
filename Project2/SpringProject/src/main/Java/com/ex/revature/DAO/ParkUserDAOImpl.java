package com.ex.revature.DAO;

import com.ex.revature.entities.ParkUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.query.Query;
import java.util.List;

@Repository
@Component
@Transactional
public class ParkUserDAOImpl implements ParkUserDAO {

    private SessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    @Transactional
    public ParkUser findByID(int id) {
        return null;
    }
    @Override
    public ParkUser getAllParksUserVisited(String email) {
        ParkUser user = null;
        Session session = sessionFactory.getCurrentSession();

        String hql = "From ParkUser where email = :email";

        Query q = session.createQuery(hql);
        q.setParameter("email", email);

        List users = q.list();

        if(!users.isEmpty()) {
            user = (ParkUser)users.get(0);
        }

        return user;

    }

    @Override
    @Transactional
    public void saveUser(ParkUser user) {
    }

    @Override
    @Transactional
    public void updateUser(ParkUser user) {
    }
    @Override
    @Transactional
    public void deleteUser(ParkUser user) {
    }
}
