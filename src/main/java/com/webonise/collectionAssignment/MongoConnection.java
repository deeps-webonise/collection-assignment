package com.webonise.collectionAssignment;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

import java.util.List;

/**
 * Created by webonise on 15/9/16.
 */
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


    public void print(List<UserInfo> ref)
    {

        for(UserInfo userIt : ref)
        {
            System.out.print("UserName: " + userIt.getUserName());
            System.out.print( " Name: " +  userIt.getName());
            System.out.print( " Email: " + userIt.getEmail());
            System.out.println(" Age: " + userIt.getAge());

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MongoConnection)) return false;

        MongoConnection that= (MongoConnection) o;

        if (!mongoClient.equals(that.mongoClient)) return false;
        if (!db.equals(that.db)) return false;
        if (!coll.equals(that.coll)) return false;
        return cursor.equals(that.cursor);

    }

    @Override
    public int hashCode() {
        int result = mongoClient.hashCode();
        result = 31 * result + db.hashCode();
        result = 31 * result + coll.hashCode();
        result = 31 * result + cursor.hashCode();
        return result;
    }
}
