package com.ex.revature.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.net.URL;

@Entity
@Table

public class NationalParks {
    @Column
    @Id
    private String parkCode;

    @Column
    private String fullName;

    @Column
    private String designation;

    @Column(length=20000)
    private String description;

    @Column(length=20000)
    private String directionsInfo;

    @Column(length=20000)
    private String weatherInfo;

    @Column
    private String states;

    @Column
    private String directionsUrl;

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode=parkCode;
    }

    public NationalParks(){

    }// end of non arg constructor for NationalParks Class

    public String getDirectionsUrl() {
        return directionsUrl;
    }

    public void setDirectionsUrl(String directionsUrl) {
        this.directionsUrl=directionsUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName=fullName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation=designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public String getDirectionsInfo() {
        return directionsInfo;
    }

    public void setDirectionsInfo(String directionsInfo) {
        this.directionsInfo=directionsInfo;
    }

    public String getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(String weatherInfo) {
        this.weatherInfo=weatherInfo;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states=states;
    }
}//end of National Parks Class
