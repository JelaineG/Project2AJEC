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

public class VisitorCentersAddresses {
    @Column
    @Id
    //it is a combination of the parkCode concatenated with the Visitor Center id
    private String Address_Id;

    @Column
    //to be made a Foreign Key
    private String parkCode;

    @Column
    private String postalCode;

    @Column
    private String city;

    @Column
    private String stateCode;

    @Column
    private String street;

    @Column
    private String type;

    public VisitorCentersAddresses() {
    }

    public String getAddress_Id() {
        return Address_Id;
    }

    // the Address_Id is set by combining the Visitor Center Id and the parkCode
    public void setAddress_Id(String address_Id) {
        Address_Id=address_Id;
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode=parkCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode=postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city=city;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode=stateCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street=street;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type=type;
    }
}//end of VisitorCenters Class
