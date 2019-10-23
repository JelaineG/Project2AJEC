package com.ex.revature.services;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.w3c.dom.ls.LSOutput;

@Controller
public class TestController {

    @RequestMapping("/justPrintSomething")
    public String justPrintSomething(){
        System.out.println("Just print something");

        return "index.html";
    }

}
