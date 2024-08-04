package com.pratyush.java_project.DBRepository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.pratyush.java_project.Informations;

public interface DBRepo extends MongoRepository<Informations , ObjectId>{

}
