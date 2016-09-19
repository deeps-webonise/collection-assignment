package com.webonise.collectionAssignment;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by webonise on 19/9/16.
 */
public class CollectionMenu implements ICollectionMenu {
    public void ArrList() {
        try {
            List<UserInfo> userInfo = new ArrayList<UserInfo>();
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

    public void HMap(){
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

            if (!userInfoMap.isEmpty())
                System.out.println("Size : " + userInfoMap.size());
            else
                System.out.println("No Elements found");


        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public void HSet() {
        try {
            Set<String> hashSet = new HashSet<>();
            MongoConnection mongoConnection = new MongoConnection();
            DBCursor cursor = mongoConnection.connection();

            while (cursor.hasNext()) {
                BasicDBObject basicDBObject;
                basicDBObject = (BasicDBObject) cursor.next();
                String name = basicDBObject.getString("name");
                hashSet.add(name);
            }

            Iterator<String> itr=hashSet.iterator();
            while(itr.hasNext())
                System.out.println(itr.next());


        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }


    }

