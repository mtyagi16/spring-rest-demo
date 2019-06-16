package com.gfg.spring2.SpringRestDemo.usercontroller;


import com.gfg.spring2.SpringRestDemo.model.User;
import com.gfg.spring2.SpringRestDemo.userdata.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.gfg.spring2.SpringRestDemo.userdata.UserData.userDataMap;

@RestController

public class UserController {


    @GetMapping("/users")
    public List<User> getAllUsers(){

        ArrayList<User> userList = new ArrayList<User>();



        for (Map.Entry<Long, User> entry : UserData.userDataMap.entrySet()){

            userList.add(entry.getValue());
        }

        return userList;

    }

    @PostMapping("/user")

    public Boolean createUser(@RequestBody User user){

        Long id = user.getId();
        if (userDataMap.containsKey(id)){
            return false;

        }
        else{

            userDataMap.put(id,user);



        return true;}
    }


    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable Long id){

        if (userDataMap.containsKey(id)){
            userDataMap.remove(id);
            return true;

        }

        else{
            return false;

        }




    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        Long id=user.getId();


        if (userDataMap.containsKey(id)){
            userDataMap.put(id,user);
            return user;


        }
        else{
            return null;
        }
    }





}
