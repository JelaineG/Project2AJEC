package com.ex.revature.services;

import com.ex.revature.DAO.NationalParksDAO;
import com.ex.revature.entities.NationalParks;
import org.hibernate.SessionFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

//@Component("getAllNationalParksInfoFromNPS")
@Controller
public class GetAllNationalParksInfoFromNPS {

    private NationalParksDAO nationalParksDAO;

    @Autowired
    public void setNationalParksDAO(NationalParksDAO nationalParksDAO) {
        this.nationalParksDAO = nationalParksDAO;
    }


    @RequestMapping("/initMethod")
    public String initMethod() throws IOException, JSONException{

        System.out.println("Hello World!");

        String url="https://developer.nps.gov/api/v1/parks?parkCode=&stateCode=&limit=200&fields=&sort=&api_key=3vvdfEW8e5IXlZ5GPH6ewkGA4TC8ioJABEwnbrEF";
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
        }//end of while loop

        input.close();

        JSONObject jsonObject =null;
        JSONObject jsonObject2 = null;

        jsonObject=new JSONObject(response.toString());

        JSONArray jsonArray=jsonObject.getJSONArray("data");
        ArrayList<NationalParks> nationalParksList = new ArrayList<>();
        NationalParks nationalParks;

        String directionsUrl;
        for (int i = 0; i < jsonArray.length(); i++) {//jsonArray.length()
            jsonObject2=jsonArray.getJSONObject(i);
            nationalParks=new NationalParks();

            nationalParks.setFullName(jsonObject2.get("fullName").toString());
            nationalParks.setDesignation(jsonObject2.get("designation").toString());
            nationalParks.setDescription(jsonObject2.get("description").toString());
            nationalParks.setDirectionsInfo(jsonObject2.get("directionsInfo").toString());
            nationalParks.setWeatherInfo(jsonObject2.get("weatherInfo").toString());
            nationalParks.setStates(jsonObject2.get("states").toString());
            nationalParks.setDirectionsUrl(jsonObject2.get("directionsUrl").toString());
            nationalParks.setParkCode(jsonObject2.get("parkCode").toString());

            nationalParksList.add(nationalParks);

            nationalParksDAO.persistPark(nationalParks);

            System.out.println(nationalParks.getFullName());

            System.out.println(nationalParks.getDesignation());

            System.out.println(nationalParks.getDescription());

            System.out.println(nationalParks.getDirectionsInfo());

            System.out.println(nationalParks.getWeatherInfo());

            System.out.println(nationalParks.getStates());
            System.out.println(nationalParks.getDirectionsUrl());
            System.out.println(nationalParks.getParkCode());


    }// end of for loop


    return "index.html";


    }//end of initMethod for GetAllNationalParksInfoFromNPS Class


}// end of GetAllNationalParksInfo Class
