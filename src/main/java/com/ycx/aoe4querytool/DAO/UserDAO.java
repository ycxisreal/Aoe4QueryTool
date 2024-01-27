package com.ycx.aoe4querytool.DAO;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ycx.aoe4querytool.entity.User;
import com.ycx.aoe4querytool.mapper.UserMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import static com.ycx.aoe4querytool.utils.HttpTools.convertInputStreamToString;

@Repository
public class UserDAO {
    private UserMapper userMapper;
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public int GetIdByName(String name)
    {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://aoe4world.com/api/v0/players/search?query="+name+"&exact=true");
        try {
            HttpResponse response = httpClient.execute(httpGet);

            // 读取响应内容
            InputStream inputStream = response.getEntity().getContent();
            String jsonResponse = convertInputStreamToString(inputStream);

            //解析
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonResponse);

            // 获取 JSON 中的属性
            JsonNode players = jsonNode.get("players");
            if(players==null||players.size()==0)
                return -1;
            else
            {
                int id = players.get(0).get("profile_id").asInt();
                userMapper.addNewUser(name,id);
                return id;
            }

        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public ArrayList<User> show (){
        return userMapper.show();
    }
}
