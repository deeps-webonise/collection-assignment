package com.webonise.collectionAssignment;

import java.util.Comparator;

/**
 * Created by webonise on 15/9/16.
 */

public class UserComparator implements Comparator<UserInfo> {


    @Override
    public int compare(UserInfo ageCompare1, UserInfo ageCompare2 ) {
        if(ageCompare1.getAge() > ageCompare2.getAge()){
            return 1;
        } else {
            return -1;
        }

    }


}
