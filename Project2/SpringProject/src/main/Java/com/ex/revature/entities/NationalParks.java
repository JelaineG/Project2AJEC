//package com.ex.revature.entities;
//
//import javax.persistence.*;
//import java.net.URL;
//
//@Entity
//@Table
//public class NationalParks {
//    @Id
//    @Column(name="ParkID", columnDefinition = "serial primary key")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String fullName;
//    private String designation;
//    private String description;
//    private String directionsInfo;
//    private String weatherInfo;
//    private String states;
//    private String directionsUrl;
//    private String parkCode;
//
//    public String getParkCode() {
//        return parkCode;
//    }
//
//    public void setParkCode(String parkCode) {
//        this.parkCode=parkCode;
//    }
//
//    public NationalParks(){
//
//    }// end of non arg constructor for NationalParks Class
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id=id;
//    }
//
//    public String getDirectionsUrl() {
//        return directionsUrl;
//    }
//
//    public void setDirectionsUrl(String directionsUrl) {
//        this.directionsUrl=directionsUrl;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName=fullName;
//    }
//
//    public String getDesignation() {
//        return designation;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation=designation;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description=description;
//    }
//
//    public String getDirectionsInfo() {
//        return directionsInfo;
//    }
//
//    public void setDirectionsInfo(String directionsInfo) {
//        this.directionsInfo=directionsInfo;
//    }
//
//    public String getWeatherInfo() {
//        return weatherInfo;
//    }
//
//    public void setWeatherInfo(String weatherInfo) {
//        this.weatherInfo=weatherInfo;
//    }
//
//    public String getStates() {
//        return states;
//    }
//
//    public void setStates(String states) {
//        this.states=states;
//    }
//}//end of National Parks Class
