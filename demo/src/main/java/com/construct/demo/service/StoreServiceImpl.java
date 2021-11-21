package com.construct.demo.service;


import java.util.*;

import com.construct.demo.model.Store;

import org.springframework.stereotype.Service;


@Service
public class StoreServiceImpl implements StoreService{

    private static List<Store> storeList=new ArrayList<>();
    public List<Store> getStores(){
        return storeList;
    }
}
