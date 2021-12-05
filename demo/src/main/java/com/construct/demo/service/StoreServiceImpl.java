package com.construct.demo.service;


import java.util.*;

import com.construct.demo.model.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.construct.demo.dao.*;

@Service
public class StoreServiceImpl implements StoreService{

    @Autowired
    private storeRepository sRepository;
    private  List<Store> storeList=new ArrayList<>();


    
    @Override
    public List<Store> getStores(){
        storeList=sRepository.findAll();
        return storeList;
    }
}
