package com.webonise.collectionassignment;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by webonise on 19/9/16.
 */
public class HashMapCollection implements ICollectionMenu {
    public void useCollectionToDisplayData(){
        try {
            Map<Double,String> userInfoMap = new HashMap<>();
            MongoConnection mongoConnection = new MongoConnection();
            DBCursor cursor = mongoConnection.connection();

            while (cursor.hasNext()) {
                BasicDBObject basicDBObject;
                basicDBObject = (BasicDBObject) cursor.next();
                double age = basicDBObject.getDouble("age");
                String name = basicDBObject.getString("username");
                userInfoMap.put(age,name);
            }
            String val=(String)userInfoMap.get(22.0);
            System.out.println("Value :"+ val);

            if ((!userInfoMap.isEmpty())) {
                System.out.println("Size : " + userInfoMap.size());
            } else {
                System.out.println("No Elements found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
