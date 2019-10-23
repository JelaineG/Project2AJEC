package com.ex.revature.entities;

import org.springframework.stereotype.Component;
import javax.persistence.*;

@Component
@Entity
@Table(name = "ParkAlerts")
public class ParkAlerts {
    @Column
    private String title;
    @Column
    private String Category;
    @Column
    private String description;
    @Id
    @Column
    private String parkCode;

       public ParkAlerts(){

    }// end of non arg constructor for NationalParks Class

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode=parkCode;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}//end of National Parks Class
