package com.construct.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.construct.demo.model.Store;
@Repository
public interface storeRepository extends JpaRepository<Store,Long> {

     
    
}
