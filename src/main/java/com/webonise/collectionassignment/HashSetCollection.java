package com.webonise.collectionassignment;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by webonise on 19/9/16.
 */
public class HashSetCollection implements ICollectionMenu {
    @Override
    public void useCollectionToDisplayData() {
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

            Iterator<String> itr = hashSet.iterator();
            while (itr.hasNext())
                System.out.println(itr.next());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
