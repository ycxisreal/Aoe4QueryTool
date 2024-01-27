package com.ycx.aoe4querytool.service;

import com.ycx.aoe4querytool.DAO.UserDAO;
import com.ycx.aoe4querytool.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    private UserDAO userDAO;
    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    public ArrayList<User> show()
    {
        return userDAO.show();
    }
    public int GetIdByName(String name){
        return userDAO.GetIdByName(name);
    }
}
