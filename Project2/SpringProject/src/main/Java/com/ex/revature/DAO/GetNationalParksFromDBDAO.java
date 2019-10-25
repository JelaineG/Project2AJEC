package com.ex.revature.DAO;

import com.ex.revature.entities.NationalParks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class GetNationalParksFromDBDAO {
    private NationalParks nationalParks;
    private String parkCode;

    private static SessionFactory sessionFactory;

    //private Session session;

    public GetNationalParksFromDBDAO(){

    }//end of no arg constructor for GetNationaParksFromDBDAO

    @Autowired
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public NationalParks getByParkCode(String parkCode) {
        NationalParks nationalParks = null;

        // this is the contextual session
        // this session is being managed by the TxManager
        Session session = sessionFactory.getCurrentSession();

        String hql = "From NationalParks where parkCode = :x";


        Query SQLquery = session.createQuery(hql);
        SQLquery.setParameter("x", parkCode);

        List parks = SQLquery.list();

        nationalParks = (NationalParks)parks.get(0);

        System.out.println("Got your park " + nationalParks.toString());

        return nationalParks;


    }



}//end of NationalParksDAO
