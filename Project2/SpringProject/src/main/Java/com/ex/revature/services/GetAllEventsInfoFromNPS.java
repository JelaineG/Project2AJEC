package com.ex.revature.services;

import com.ex.revature.entities.VisitorCenters;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
public class GetAllEventsInfoFromNPS {

//    public GetAllNationalParksInfoFromNPS() throws IOException, JSONException {
//
//    }//end of no arg constructor for GetAllNationalParksInfoFromNPS Class
    @RequestMapping("/initMethodForEvents")
    public String initMethod() throws IOException, JSONException{

        System.out.println("Hello World! E v e nts!");

        String url="https://developer.nps.gov/api/v1/events?limit=100&api_key=3vvdfEW8e5IXlZ5GPH6ewkGA4TC8ioJABEwnbrEF";
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

        jsonObject=new JSONObject(response.toString());

        JSONArray jsonArray=jsonObject.getJSONArray("data");
        ArrayList<VisitorCenters> visitorCentersList = new ArrayList<>();
        VisitorCenters visitorCenters;
        //NationalParksDAO nationalParksDAO;
        String directionsUrl;
        for (int i = 0; i < jsonArray.length(); i++) {
            jsonObject2=jsonArray.getJSONObject(i);
            visitorCenters=new VisitorCenters();
            //visitorCentersDAO = new VisitorCentersDAO();

            visitorCenters.setFacilityName(jsonObject2.get("name").toString());
            visitorCenters.setParkCode(jsonObject2.get("parkCode").toString());
            visitorCenters.setDescription(jsonObject2.get("description").toString());
            visitorCenters.setDirectionsInfo(jsonObject2.get("directionsInfo").toString());
            visitorCenters.setId(jsonObject2.get("id").toString());
            visitorCenters.setUrl(jsonObject2.get("url").toString());
            visitorCenters.setDirectionsUrl(jsonObject2.get("directionsUrl").toString());


            visitorCentersList.add(visitorCenters);

            //visitorCentersDAO.persistPark(visitorCenters);

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
