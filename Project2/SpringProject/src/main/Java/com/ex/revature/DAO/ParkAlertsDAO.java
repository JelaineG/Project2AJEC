package com.ex.revature.DAO;

import com.ex.revature.services.GetAllAlertsFromNPS;
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

   private SessionFactory sessionFactory;
    @Autowired
    public ParkAlertsDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;}

       @Transactional
    public List getAllAlert(String parkCode) {

        GetAllAlertsFromNPS alerts = null;
       Session session = sessionFactory.getCurrentSession();

        String hql = "From ParkAlerts where parkCode = :parkCode";

        Query q = session.createQuery(hql);
       q.setParameter("parkCode", parkCode);

       List alertList = q.list();
        if(!alertList.isEmpty()) {
        alerts = (GetAllAlertsFromNPS)alertList.get(0);     }
        return alertList;
    }
}
