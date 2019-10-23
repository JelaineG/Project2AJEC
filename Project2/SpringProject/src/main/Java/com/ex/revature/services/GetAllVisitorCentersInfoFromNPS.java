package com.ex.revature.services;

import com.ex.revature.DAO.VisitorCentersDAO;
import com.ex.revature.DAO.VisitorCentersAddressesDAO;
import com.ex.revature.entities.VisitorCenters;
import com.ex.revature.entities.VisitorCentersAddresses;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

//@Component("getAllNationalParksInfoFromNPS")
@Controller
public class GetAllVisitorCentersInfoFromNPS {

    private VisitorCentersDAO visitorCentersDAO;
    private VisitorCentersAddressesDAO visitorCentersAddressesDAO;
    ArrayList<String> parkCodeList = new ArrayList<>();

    @Autowired
    public void setVisitorCentersDAO(VisitorCentersDAO visitorCentersDAO) {
        this.visitorCentersDAO = visitorCentersDAO;
    }

    @Autowired
    public void setVisitorCentersAddressesDAO(VisitorCentersAddressesDAO visitorCentersAddressesDAO){
        this.visitorCentersAddressesDAO=visitorCentersAddressesDAO;
    }

//    public GetAllNationalParksInfoFromNPS() throws IOException, JSONException {
//
//    }//end of no arg constructor for GetAllNationalParksInfoFromNPS Class
    @RequestMapping("/initMethodForVisitorCenters")
    public String initMethod() throws IOException, JSONException{

        System.out.println("Hello World! Visitor Centers...");

        String url="https://developer.nps.gov/api/v1/visitorcenters?limit=300&fields=contacts&fields=addresses&api_key=3vvdfEW8e5IXlZ5GPH6ewkGA4TC8ioJABEwnbrEF";
        StringBuffer response=null;
        HttpURLConnection connection=null;

        URL object=new URL(url);

        connection=(HttpURLConnection) (object.openConnection());
        int responseCode=connection.getResponseCode();

        BufferedReader input=new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        response=new StringBuffer();
        while ((inputLine=input.readLine()) != null) {
            response.append(inputLine);
        }
        input.close();

        JSONObject jsonObject =null;
        JSONObject jsonObject2 = null;
        JSONObject jsonObjectAddress1 = null;
        JSONObject jsonObjectAddress2= null;

        jsonObject=new JSONObject(response.toString());

        JSONArray jsonArray=jsonObject.getJSONArray("data");
        ArrayList<VisitorCenters> visitorCentersList = new ArrayList<>();
        VisitorCenters visitorCenters;
        VisitorCentersAddresses visitorCentersAddress1;
        VisitorCentersAddresses visitorCentersAddress2;

        JSONArray jsonArrayAddress;

        String directionsUrl;
        String AddressID;
        for (int i = 0; i < jsonArray.length(); i++) {
            jsonObject2=jsonArray.getJSONObject(i);

            visitorCenters=new VisitorCenters();
            visitorCentersAddress1=new VisitorCentersAddresses();
            visitorCentersAddress2=new VisitorCentersAddresses();


            visitorCenters.setFacilityName(jsonObject2.get("name").toString());
            visitorCenters.setParkCode(jsonObject2.get("parkCode").toString());

            // need to create a list of parkCode
            parkCodeList.add(jsonObject2.get("parkCode").toString());

            visitorCenters.setDescription(jsonObject2.get("description").toString());
            visitorCenters.setDirectionsInfo(jsonObject2.get("directionsInfo").toString());
            visitorCenters.setId(jsonObject2.get("id").toString());
            visitorCenters.setUrl(jsonObject2.get("url").toString());
            visitorCenters.setDirectionsUrl(jsonObject2.get("directionsUrl").toString());

            visitorCentersList.add(visitorCenters);

            visitorCentersDAO.persistVisitorCenter(visitorCenters);

            jsonArrayAddress=jsonObject2.getJSONArray("addresses");
            jsonObjectAddress1=jsonArrayAddress.getJSONObject(0);
            if (jsonArrayAddress.length() > 1) {
                jsonObjectAddress2=jsonArrayAddress.getJSONObject(1);
            }
            //Creates id for visitor center physcial address by concatenating the letter P with the parkCode and the
            //visitor center ID

            if (jsonObjectAddress1.get("type").toString().startsWith("P")) {
                AddressID="P" + visitorCenters.getParkCode().concat(visitorCenters.getId());
            } else {
                AddressID="M" + visitorCenters.getParkCode().concat(visitorCenters.getId());
            }
            visitorCentersAddress1.setAddress_Id(AddressID);

            if (jsonArrayAddress.length() > 1) {
                if (jsonObjectAddress2.get("type").toString().startsWith("P")) {
                    AddressID="P" + visitorCenters.getParkCode().concat(visitorCenters.getId());
                } else {
                    AddressID="M" + visitorCenters.getParkCode().concat(visitorCenters.getId());
                }//end of inner if statement
                visitorCentersAddress2.setAddress_Id(AddressID);
            }//end of outer if statement

            visitorCentersAddress1.setPostalCode(jsonObjectAddress1.get("postalCode").toString());
            visitorCentersAddress1.setCity(jsonObjectAddress1.get("city").toString());
            visitorCentersAddress1.setStateCode(jsonObjectAddress1.get("stateCode").toString());
            visitorCentersAddress1.setStreet(jsonObjectAddress1.get("line1").toString());
            visitorCentersAddress1.setType(jsonObjectAddress1.get("type").toString());
            visitorCentersAddress1.setParkCode(parkCodeList.get(i));

            if (jsonArrayAddress.length() > 1) {
                visitorCentersAddress2.setPostalCode(jsonObjectAddress2.get("postalCode").toString());
                visitorCentersAddress2.setCity(jsonObjectAddress2.get("city").toString());
                visitorCentersAddress2.setStateCode(jsonObjectAddress2.get("stateCode").toString());
                visitorCentersAddress2.setStreet(jsonObjectAddress2.get("line1").toString());
                visitorCentersAddress2.setType(jsonObjectAddress2.get("type").toString());
                visitorCentersAddress2.setParkCode(parkCodeList.get(i));

                visitorCentersAddressesDAO.persistVisitorCenterAddresses(visitorCentersAddress2);
            }
            visitorCentersAddressesDAO.persistVisitorCenterAddresses(visitorCentersAddress1);


            System.out.println(visitorCenters.getFacilityName());

            System.out.println(visitorCenters.getParkCode());

            System.out.println(visitorCenters.getId());

            System.out.println(visitorCenters.getDescription());

            System.out.println(visitorCenters.getDirectionsInfo());

            System.out.println(visitorCenters.getDirectionsUrl());

            System.out.println(visitorCenters.getUrl());


    }// end of for loop


    return "index.html";


    }//end of initMethod for GetAllNationalParksInfoFromNPS Class


}// end of GetAllNationalParksInfo Class
