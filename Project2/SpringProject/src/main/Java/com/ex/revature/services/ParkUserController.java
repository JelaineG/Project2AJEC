package com.ex.revature.services;

import com.ex.revature.DAO.ParkUserDAO;
import com.ex.revature.entities.ParkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@Scope("prototype")
public class ParkUserController {

   ParkUserDAO parkUserDAO;
   ParkUser user;

    @RequestMapping("/initUser")
 public String ParkUserHome(){System.out.println("User working");
     return "index.html";
 }


    public void setParkUserDao(ParkUserDAO parkUserDAO) {
        this.parkUserDAO = parkUserDAO;
    }

}
