package org.example.services;

import org.example.entities.User;


public class UserBookingService {

    private User user;

    private static final String USER_PATH="../localDb/users.json";

    public UserBookingService(User user){
        this.user=user;
    }
}
