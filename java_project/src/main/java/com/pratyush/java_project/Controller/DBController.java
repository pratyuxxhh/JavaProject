package com.pratyush.java_project.Controller;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratyush.java_project.Informations;
import com.pratyush.java_project.Services.DBServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

// In this file , I have learned how to integreate MONGODB  with spring boot and enter some data in it .


@RestController
@RequestMapping("/info")
public class DBController {

    @Autowired
    private DBServices dbservices;

    @PostMapping
    public boolean postMethodName(@RequestBody Informations entity) {
        //TODO: process POST request
        dbservices.saveAll(entity);
        return true;
    }
    @GetMapping
    public List<Informations> getMethodName() {
        return dbservices.findAll();
    }
    @GetMapping("{id}")
    public Optional<Informations> postMethodName(@PathVariable ObjectId id) {
        //TODO: process POST request
        
        return dbservices.getID(id);
    }
    @DeleteMapping("{id}")
    public boolean deleteID(@PathVariable ObjectId id){
        dbservices.deleteeID(id);
        return true;
    }
    
}
