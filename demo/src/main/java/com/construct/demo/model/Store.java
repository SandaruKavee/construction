package com.construct.demo.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Store {
    private String storeID;
    private String location;

    // public Store(String storeID,String location ){
    //     this.storeID=storeID;
    //     this.location=location;


    // }
    public String getStoreID() {
        return storeID;
    }
    public String getLocation() {
        return location;
    }
}
