package com.pratyush.java_project;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


@Document("mycollections")
@Getter
@Setter
public class Informations {

    @Id
    private ObjectId id;
    private String name;
    private int roll;
    
}
