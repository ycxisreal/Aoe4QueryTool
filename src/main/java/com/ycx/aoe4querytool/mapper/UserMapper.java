package com.ycx.aoe4querytool.mapper;

import com.ycx.aoe4querytool.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
@Mapper
public interface UserMapper {
    @Select("select * from users")
    ArrayList<User> show();
    @Insert("insert IGNORE into users VALUES (#{arg0}, #{arg1})")
    void addNewUser(String name,int id);
}
