package com.ex.revature.services;

import com.ex.revature.DAO.GetNationalParksFromDBDAO;
import com.ex.revature.DAO.NationalParksDAO;
import com.ex.revature.entities.NationalParks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class GetNationalParkFromDB {
    String parkCode;
    NationalParks nationalParks;

    @Autowired
    private GetNationalParksFromDBDAO getNationalParksFromDBDAO;

//    @Autowired
//    public void setGetNationalParkFromDB(GetNationalParksFromDBDAO getNationalParksFromDBDAO) {
//        this.getNationalParksFromDBDAO = getNationalParksFromDBDAO;
//    }



    @RequestMapping("/getNationalPark")
    public String getNationalPark(HttpServletRequest request, HttpServletResponse response){
        this.parkCode = request.getParameter("parkCode");

        System.out.println("The park code is " + this.parkCode);

        nationalParks = getNationalParksFromDBDAO.getByParkCode(parkCode);

        System.out.println("National Parks to String " + nationalParks.toString());

        return "index.html";

    }//end of getNationalPark method

}//end of GetNationalParkFromDB Class
