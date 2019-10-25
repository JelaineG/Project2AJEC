package com.ex.revature.DAO;

import com.ex.revature.entities.ParkUser;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

    @Repository
    @Transactional
    public class ParkUserDAO {
        private static SessionFactory sessionFactory;
        private ParkUser user;

        public ParkUserDAO() {
        }//end of no arg constructor

        @Autowired
        public static SessionFactory getSessionFactory() {
            return sessionFactory;
        }
        @Autowired
        public void setSessionFactory(SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
        }


        @Transactional
        public void saveParkUser(ParkUser user) {
            this.user = user;
            Session session = this.sessionFactory.getCurrentSession();
            System.out.println("data saved");
            session.save(this.user);
        }

        @Transactional
        public ParkUser getByEmail(String email) {
            ParkUser parkUser = null;
            Session session = sessionFactory.getCurrentSession();
            String hql = "From ParkUser where email = :email";
            Query q = session.createQuery(hql);
            q.setParameter("email", email);
            List users = q.list();
             user = (ParkUser) users.get(0);
             System.out.println("Got your user " + user.toString());
             return user;
        }
}
