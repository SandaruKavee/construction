package com.construct.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name="store")
public class Store {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="store_id")
    private Integer storeID;
    @Column(name="store_location")
    private String storeLocation;
    @Column(name="store_capacity")
    private String storeCapacity;

    // public Store(String storeID,String location ){
    //     this.storeID=storeID;
    //     this.location=location;


    // }
    public Integer getStoreID() {
        return storeID;
    }
    public String getLocation() {
        return storeLocation;
    }
    public String getCapacity(){
        return storeCapacity;
    }
}
