package com.ex.revature.services;

import com.ex.revature.entities.ParkAlerts;
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

//@Component("getAllAlertsFromNPS")
@Controller
public class ParkAlertsController {

    //    public GetAllNationalParksInfoFromNPS() throws IOException, JSONException {
//
//    }//end of no arg constructor for GetAllNationalParksInfoFromNPS Class
    @RequestMapping("/initAlert")
    public void ParkAlert() throws IOException, JSONException{
        System.out.println("Hello World!");

        String url="https://developer.nps.gov/api/v1/alerts?limit=100&api_key=3vvdfEW8e5IXlZ5GPH6ewkGA4TC8ioJABEwnbrEF";
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
        ArrayList<ParkAlerts> alertsList = new ArrayList<>();
        ParkAlerts alerts;
        for (int i = 0; i < jsonArray.length(); i++) {
            jsonObject2=jsonArray.getJSONObject(i);
            alerts =new ParkAlerts();

           alerts.setTitle(jsonObject2.get("title").toString());
            alerts.setCategory(jsonObject2.get("category").toString());
            alerts.setDescription(jsonObject2.get("description").toString());
            alerts.setParkCode(jsonObject2.get("parkCode").toString());
            //directionsUrl=jsonObject2.get("directionsUrl");
           alertsList.add(alerts);


            System.out.println(alerts.getTitle());

            System.out.println(alerts.getCategory());

            System.out.println(alerts.getDescription());

            System.out.println(alerts.getParkCode());

        }// end of for loop


        //return "index.html";


    }//end of initMethod for GetAllNationalParksInfoFromNPS Class


}// end of GetAllNationalParksInfo Class
