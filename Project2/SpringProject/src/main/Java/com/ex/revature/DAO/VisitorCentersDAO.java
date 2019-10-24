package com.ex.revature.DAO;

import com.ex.revature.entities.NationalParks;
import com.ex.revature.entities.VisitorCenters;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class VisitorCentersDAO {
    private VisitorCenters visitorCenters;

    private static SessionFactory sessionFactory;

    public VisitorCentersDAO(){

    }
    @Autowired
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void persistVisitorCenter(VisitorCenters visitorCenters){
    this.visitorCenters = visitorCenters;
    //this.sessionFactory =
    System.out.println("the code is " + visitorCenters.getParkCode());
    // this is the contextual session
    // this session is being managed by the TxManager
    Session session = this.sessionFactory.getCurrentSession();

//
    session.save(this.visitorCenters);

    }




}//end of VisitorCentersDAO
