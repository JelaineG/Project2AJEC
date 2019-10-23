package com.ex.revature.entities;

import org.springframework.stereotype.Component;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@Entity
@Table(name = "ParkUser")
public class ParkUser {
    @Id
   private int id;
   @Column(name = "Email")
  private String email;

  @Column(name = "Password")
    private String password;

    @Column(name = "First_Name")
   private String firstName;

   @Column(name = "Last_Name")
   private String lastName;

    @Column(name = "parksVisited")
    private String parksVisited;


   public ParkUser(){}

   public ParkUser(int id, String email, String password, String firstName, String lastName, String parksVisited) {

      this.id = id;
       this.email = email;
       this.password = password;
      this.firstName = firstName;
       this.firstName =lastName;
       this.parksVisited = parksVisited;

   }

   public int getId() {
       return id;
  }

  public void setId(int id) {
       this.id = id;
  }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

  public String getPassword() {
    return password;
 }

  public void setPassword(String password) {
   this.password = password;
  }
  public String getFirstName() {
      return firstName;
   }

  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
        }

       public String getParksVisited() {
        return parksVisited;
    }

    public void setParksVisited(String parksVisited) {
        this.parksVisited = parksVisited;
    }
}
