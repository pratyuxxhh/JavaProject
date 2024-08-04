package com.pratyush.java_project.Services;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.pratyush.java_project.Informations;
import com.pratyush.java_project.DBRepository.DBRepo;

@Component
public class DBServices {

    @Autowired
    private DBRepo dbrepo;

    public void saveAll(Informations entity) {
        dbrepo.save(entity);
    }
    public List<Informations> findAll(){
        
        return dbrepo.findAll();
    }
    public Optional<Informations> getID(ObjectId id) {
        return dbrepo.findById(id);
    }
    
    public void deleteeID(ObjectId id){
        dbrepo.deleteById(id);
       
    }


}
