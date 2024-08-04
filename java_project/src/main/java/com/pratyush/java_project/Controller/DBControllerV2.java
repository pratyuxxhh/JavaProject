package com.pratyush.java_project.Controller;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
import org.springframework.web.bind.annotation.PutMapping;


// in this file i have learned about the Response entity  and the HTTP status code and apply them here.

@RestController
@RequestMapping("/infov2")
public class DBControllerV2 {

    @Autowired
    private DBServices dbservices;

    @PostMapping
    public ResponseEntity<?> postMethodName(@RequestBody Informations entity) {
        // TODO: process POST request
        dbservices.saveAll(entity);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<?> getMethodName() {
        Optional<List<Informations>> list = Optional.of(dbservices.findAll());
        if (list.isPresent()) {
            return new ResponseEntity<>(list, HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> postMethodName(@PathVariable ObjectId id) {
        // TODO: process POST request
        Optional<Informations> info = dbservices.getID(id);

        if (info.isPresent()) {
            return new ResponseEntity<>(info, HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteID(@PathVariable ObjectId id) {
        dbservices.deleteeID(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
