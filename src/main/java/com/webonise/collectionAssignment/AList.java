package com.webonise.collectionAssignment;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

import java.util.Collections;
import java.util.List;

/**
 * Created by webonise on 19/9/16.
 */
public class AList implements ICollectionMenu {
    public void useCollectionToDisplayData() {
        try {
            List<UserInfo> userInfo = new java.util.ArrayList<UserInfo>();
            UserInfo info;
            MongoConnection mongoConnection = new MongoConnection();
            DBCursor cursor = mongoConnection.connection();
            while (cursor.hasNext()) {
                info = new UserInfo();
                BasicDBObject basicDBObject;
                basicDBObject = (BasicDBObject) cursor.next();
                info.setUserName(basicDBObject.getString("username"));
                info.setName(basicDBObject.getString("name"));
                info.setEmail(basicDBObject.getString("email"));
                info.setAge(basicDBObject.getDouble("age"));

                userInfo.add(info);

            }

            Collections.sort(userInfo, new UserComparator());
            mongoConnection.print(userInfo);

            if (!userInfo.isEmpty())
                System.out.println("Size : " + userInfo.size());
            else
                System.out.println("No Elements found");



        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }






    }

