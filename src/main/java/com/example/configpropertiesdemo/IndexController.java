package com.example.configpropertiesdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @Autowired
    private AppProperties appProperties;


    @GetMapping("/config")

    public Map<String,String> getAppDetails(){

        Map<String,String> appDetails = new HashMap<>();
        appDetails.put("name" , appProperties.getName());

        if (appProperties.getName().equals("ConfigurationPropertiesDemoApp-DEVELOPMENT"))
             appDetails.replace("name", "234238947239479327409327409327493274932749832");
        else
             appDetails.replace("name", "asabdsa asds adjsa dasbdasd as dasjkd sabdasnda sdasjd sjdw j wee wqe");


        appDetails.put("description",appProperties.getDescription());
        appDetails.put("Upload", appProperties.getUploadDir());
        return appDetails;
    }
    @GetMapping("/post")
    public Map<String,String> setAppDetails() {
        Map<String, String> appDetails = new HashMap<>();
        appDetails.replace("name", "asdsakjdbsakjdbasjbdjkasbdjkasbdas");
//        appDetails.get("name", appProperties.getName());
        appDetails.get("description");
        appDetails.get("Upload");
        return appDetails;
    }
}
