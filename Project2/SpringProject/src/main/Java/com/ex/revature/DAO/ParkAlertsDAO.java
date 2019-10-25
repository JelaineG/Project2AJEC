package com.ex.revature.DAO;

import com.ex.revature.entities.ParkAlerts;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class ParkAlertsDAO {
    private ParkAlerts parkAlerts;

   private static SessionFactory sessionFactory;

    public ParkAlertsDAO(){
    }
    @Autowired
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
   @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;}


    public ParkAlerts getByParkCode(String parkCode) {
        ParkAlerts parkAlerts = null;
        Session session = sessionFactory.getCurrentSession();

        String hql = "From ParkAlerts where parkCode = :parkCode";
        Query q = session.createQuery(hql);
        q.setParameter("parkCode", parkCode);

        List alerts = q.list();
        parkAlerts = (ParkAlerts) alerts.get(0);

        return parkAlerts;
    }
}
