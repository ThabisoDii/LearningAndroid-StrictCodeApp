package com.example.academy_intern.stric_code.functionality;

import com.example.academy_intern.stric_code.implementation.DataSource;
import com.example.academy_intern.stric_code.models.User;

import java.util.ArrayList;

public class Validation {

    public static User validateCreditals(String email,String password){
        User user = null;

        ArrayList<User> listUsers = DataSource.listUsers;

        for(int x = 0;x < listUsers.size();x++){
            String validEmail = listUsers.get(x).getEmail();
            String validPassword = listUsers.get(x).getPassword();

            if(email.equalsIgnoreCase(validEmail) && password.equals(validPassword)){
                user = listUsers.get(x);
            }
        }

        return user;
    }



}
