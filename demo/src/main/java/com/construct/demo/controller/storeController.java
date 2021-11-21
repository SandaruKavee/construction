package com.construct.demo.controller;

import java.util.*;

import com.construct.demo.model.Store;
import com.construct.demo.service.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.http.HttpMethod;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class storeController {

    @Autowired
    private StoreService storeService;

    @Value("${app.name: Default Construction}")
    private String appName;
    @GetMapping("/app-name")
    private String getName(){
        return appName;
    }
    //@RequestMapping(value="/name",method= RequestMethod.GET)
    @GetMapping(value="/name")
    private Map<String,String> getStoreName(){
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");

        return map;
    }

    @GetMapping(value="/name/{id}")
    private String getName(@PathVariable Long id){
        return id.toString();
    }

    @PostMapping(value="/login")
    private Map<String,String> login(@RequestBody Map<String,String> body){
        HashMap<String,String> map = new HashMap<>();
        map.put("id", "He ne");
        System.out.println(body.get("username"));
        return map;
    }
    @PostMapping(value="/register")
    private Store register(@RequestBody Store store){
        HashMap<String,String> map= new HashMap<>();
     
        map.put("storeID",store.getStoreID());
        return store;
    }
    @GetMapping(value="/stores")
    private List<Store> getStores(){
        return storeService.getStores();
    }
 

}
