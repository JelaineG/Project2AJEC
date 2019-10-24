package com.ex.revature.DAO;

import com.ex.revature.entities.NationalParks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class NationalParksDAO {
    private NationalParks nationalParks;

    private static SessionFactory sessionFactory;

    public NationalParksDAO(){

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
    public void persistPark(NationalParks nationalParks){
    this.nationalParks = nationalParks;

    System.out.println("the code is " + nationalParks.getParkCode());

    // this is the contextual session
    // this session is being managed by the TxManager
    Session session = this.sessionFactory.getCurrentSession();

//
    session.save(this.nationalParks);

}




}//end of NationalParksDAO
