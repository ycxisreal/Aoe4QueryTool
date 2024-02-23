package com.ycx.aoe4querytool.controller;

import com.ycx.aoe4querytool.entity.User;
import com.ycx.aoe4querytool.mapper.UserMapper;
import com.ycx.aoe4querytool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class BasicUserController {
    @Autowired
    UserMapper userMapper;
    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/ShowAllUsers")
    public ArrayList<User> show()
    {
        return userService.show();
    }
    @GetMapping("/queryId/ycx/{name}")
    public int queryId_ycx(@PathVariable String name){
        return userService.GetIdByName(name,true);
    }
    @GetMapping("/queryId/{name}")
    public int queryId(@PathVariable String name){
        return userService.GetIdByName(name,false);
    }
}
