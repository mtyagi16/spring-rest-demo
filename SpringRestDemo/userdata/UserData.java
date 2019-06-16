package com.gfg.spring2.SpringRestDemo.userdata;

import com.gfg.spring2.SpringRestDemo.model.User;

import java.util.HashMap;

public class UserData {

    public static HashMap<Long, User> userDataMap = new HashMap<>();

     static {

         User user0 = new User(0L, "ankur", "singh");
         User user1 = new User(1L, "Ashish", "kataria");
         User user2 = new User(2L, "abhay", "agarwal");
         User user3 = new User(3L, "Anurag", "mishra");


         userDataMap.put(0L,user0);
         userDataMap.put(1L,user1);
         userDataMap.put(2L,user2);
         userDataMap.put(3L,user3);


     }

}
