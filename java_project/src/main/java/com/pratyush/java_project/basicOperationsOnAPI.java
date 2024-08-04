package com.pratyush.java_project;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *   IN this file I learned basic operations and annotations on classes and functions 
 *   use of @RestController , @GetMapping , @PostMapping , @PathVariable , @RequestBody , @DeleteMapping
 */

@RestController
@RequestMapping("operations")
public class basicOperationsOnAPI {
    ArrayList<Integer> lst = new ArrayList<>();
    
    @GetMapping("path")
    public ArrayList<Integer> hello() {
        return lst;
    }
    @PostMapping("path")
    public String hello(@RequestBody ArrayList<Integer> entity) {
        //TODO: process POST request
        lst = entity ;
        return "teri maa ki chu";
    }
    @GetMapping("path/{index}")
    public int hello(@PathVariable int index) {
        return lst.get(index);
    }
    

}
