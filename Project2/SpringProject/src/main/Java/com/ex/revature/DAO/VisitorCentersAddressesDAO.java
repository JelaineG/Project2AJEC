package com.ex.revature.DAO;

import com.ex.revature.entities.VisitorCentersAddresses;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class VisitorCentersAddressesDAO {
    private VisitorCentersAddresses visitorCentersAddresses;

    private static SessionFactory sessionFactory;

    public VisitorCentersAddressesDAO(){

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
    public void persistVisitorCenterAddresses(VisitorCentersAddresses visitorCentersAddresses){
    this.visitorCentersAddresses=visitorCentersAddresses;

    // this is the contextual session
    // this session is being managed by the TxManager
    Session session = this.sessionFactory.getCurrentSession();

//
    session.save(this.visitorCentersAddresses);

    }




}//end of VisitorCentersDAO
