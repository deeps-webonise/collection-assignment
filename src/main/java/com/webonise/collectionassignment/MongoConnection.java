package com.webonise.collectionassignment;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

import java.util.List;

public class MongoConnection {

    MongoClient mongoClient;
    DB db;
    DBCollection coll;
    DBCursor cursor;

    DBCursor connection() {
        mongoClient = new MongoClient("localhost", 27017);

        // Now connect to your databases
        db = mongoClient.getDB("test");
        System.out.println("Connect to database successfully");

        coll = db.getCollection("users");
        System.out.println("Collections users selected successfully");

        cursor = coll.find();
        return cursor;
    }


    public void print(List<UserInfo> ref) {
        for (UserInfo userIt : ref) {
            System.out.print("UserName: " + userIt.getUserName());
            System.out.print(" Name: " + userIt.getName());
            System.out.print(" Email: " + userIt.getEmail());
            System.out.println(" Age: " + userIt.getAge());
        }
    }
}
