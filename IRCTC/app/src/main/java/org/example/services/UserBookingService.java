package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;
import org.example.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;


public class UserBookingService {

    private User user;

    private List<User> userList;

    private ObjectMapper objectMapper=new ObjectMapper();

    private static final String USER_PATH="../localDb/users.json";

    public UserBookingService(User user) throws IOException {
        this.user=user;
        File users=new File(USER_PATH);
        userList=objectMapper.readValue(users, new TypeReference<List<User>>() {
        });
    }

    public boolean loginUser(){
        Optional<User> foundUser=userList.stream().filter(user1 -> {return  user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(),user1.getHashPassword()); }).findFirst();
        return foundUser.isPresent();
    }
}
