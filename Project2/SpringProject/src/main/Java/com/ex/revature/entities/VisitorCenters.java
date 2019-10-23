package com.ex.revature.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class VisitorCenters {
    @Column
    @Id
    private String id;

    @Column
    //to be made a Foreign Key
    private String parkCode;

    @Column
    private String facilityName;

    @Column(length=20000)
    private String description;

    @Column(length=20000)
    private String directionsInfo;

    @Column
    private String directionsUrl;

    @Column
    private String operatingHours;

    @Column
    private String url;

    @Column
    private String addresses;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id=id;
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode=parkCode;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName=facilityName;
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



    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours=operatingHours;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url=url;
    }

    public String getDirectionsUrl() {
        return directionsUrl;
    }

    public void setDirectionsUrl(String directionsUrl) {
        this.directionsUrl=directionsUrl;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses=addresses;
    }
}//end of VisitorCenters Class
