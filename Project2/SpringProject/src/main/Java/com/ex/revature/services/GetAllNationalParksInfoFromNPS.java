//package com.ex.revature.services;
//
//import com.ex.revature.entities.NationalParks;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//
////@Component("getAllNationalParksInfoFromNPS")
//@Controller
//public class GetAllNationalParksInfoFromNPS {
//
////    public GetAllNationalParksInfoFromNPS() throws IOException, JSONException {
////
////    }//end of no arg constructor for GetAllNationalParksInfoFromNPS Class
//    @RequestMapping("/initMethod")
//    public void initMethod() throws IOException, JSONException{
//        System.out.println("Hello World!");
//
//        String url="https://developer.nps.gov/api/v1/parks?parkCode=&stateCode=&limit=200&fields=&sort=&api_key=3vvdfEW8e5IXlZ5GPH6ewkGA4TC8ioJABEwnbrEF";
//        StringBuffer response=null;
//        HttpURLConnection connection=null;
//
//        URL object=new URL(url);
//
//        connection=(HttpURLConnection) (object.openConnection());
//        int responseCode=connection.getResponseCode();
//
//        BufferedReader input=new BufferedReader(new InputStreamReader(connection.getInputStream()));
//        String inputLine;
//        response=new StringBuffer();
//        while ((inputLine=input.readLine()) != null) {
//            response.append(inputLine);
//        }
//        input.close();
//
//        JSONObject jsonObject =null;
//        JSONObject jsonObject2 = null;
//
//        jsonObject=new JSONObject(response.toString());
//
//        JSONArray jsonArray=jsonObject.getJSONArray("data");
//        ArrayList<NationalParks> nationalParksList = new ArrayList<>();
//        NationalParks nationalParks;
//        String directionsUrl;
//        for (int i = 0; i < jsonArray.length(); i++) {
//            jsonObject2=jsonArray.getJSONObject(i);
//            nationalParks=new NationalParks();
//
//            nationalParks.setFullName(jsonObject2.get("fullName").toString());
//            nationalParks.setDesignation(jsonObject2.get("designation").toString());
//            nationalParks.setDescription(jsonObject2.get("description").toString());
//            nationalParks.setDirectionsInfo(jsonObject2.get("directionsInfo").toString());
//            nationalParks.setWeatherInfo(jsonObject2.get("weatherInfo").toString());
//            nationalParks.setStates(jsonObject2.get("states").toString());
//            //directionsUrl=jsonObject2.get("directionsUrl");
//            nationalParks.setDirectionsUrl(jsonObject2.get("directionsUrl").toString());
//            nationalParks.setParkCode(jsonObject2.get("parkCode").toString());
//
//            nationalParksList.add(nationalParks);
//
//
//            System.out.println(nationalParks.getFullName());
//
//            System.out.println(nationalParks.getDesignation());
//
//            System.out.println(nationalParks.getDescription());
//
//            System.out.println(nationalParks.getDirectionsInfo());
//
//            System.out.println(nationalParks.getWeatherInfo());
//
//            System.out.println(nationalParks.getStates());
//            System.out.println(nationalParks.getDirectionsUrl());
//            System.out.println(nationalParks.getParkCode());
//    }// end of for loop
//
//
//    //return "index.html";
//
//
//    }//end of initMethod for GetAllNationalParksInfoFromNPS Class
//
//
//}// end of GetAllNationalParksInfo Class
