package com.ex.revature.services;

// @CrossOrigin(origins="http://localhost:4200")

import com.ex.revature.DAO.ParkUserDAO;
import com.ex.revature.entities.ParkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@CrossOrigin(origins="http://localhost:4200")
public class ParkUserController {
    String email;
    String lastName;
    String firstName;
    int id;
    String password;
    String parksVisited;

    ParkUser user = new ParkUser();

    public ParkUserController() {
    }

    private ParkUserDAO parkUserDAO;

    @Autowired
    public void setParkUserDAO(ParkUserDAO parkUserDAO) {
        this.parkUserDAO = parkUserDAO;
    }
    /*---save new user---*/

    @RequestMapping(value = "/saveParkUser", method = RequestMethod.POST)
    public String saveParkUser(HttpServletRequest request, HttpServletResponse response) {
        this.email = request.getParameter("email");
        this.lastName = request.getParameter("lastName");
        this.firstName = request.getParameter("firstName");
        this.password = request.getParameter("password");
        this.parksVisited = request.getParameter("parksVisited");

        System.out.println("The first name is " + this.firstName);

        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.setEmail(this.email);
        user.setPassword(this.password);
        user.setParksVisited(this.parksVisited);

        parkUserDAO.saveParkUser(user);

        System.out.println("hello " + this.lastName + this.email + this.firstName);
        System.out.println("something");
        return "index.html";
    }

    @RequestMapping(value = "/getParkUser", method = RequestMethod.GET)
    public String getParkUser(HttpServletRequest request, HttpServletResponse response) {
        this.email = request.getParameter("email");
        user = parkUserDAO.getByEmail(email);

        System.out.println("Park user to String " + user.toString());

        return "index.html";

  }
}
