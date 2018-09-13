package com.example.academy_intern.stric_code.implementation;

import com.example.academy_intern.stric_code.interfaces.IUser;
import com.example.academy_intern.stric_code.models.User;

import java.util.ArrayList;

public class DataSource implements IUser {

    public  ArrayList<User> listUsers = new ArrayList<> ();

    public DataSource(){
        init();
    }


    public  void init(){

        listUsers.add( new User ("Siphelele", "Myeni",
                "mdo@gmail.com", "123", "Back End"));

        listUsers.add( new User ("Hulisani", "Tshisikule",
                "hulisani@gmail.com", "234", "front End"));

        listUsers.add( new User ("Neani", "Mikosi",
                "nei@gmail.com", "123", "Front End"));

        listUsers.add( new User ("Thabiso", "Diphare",
                "thabiso@gmail.com", "123", "Back End"));
        listUsers.add( new User ("Tsakane", "Mokemane",
                "tsakane@gmail.com", "526", "Back End"));

    }

    public ArrayList<User> getAllUsers(){

        return listUsers;
    }
    public User isloggedIn(String email, String password){

        User user = null;

        for(int x = 0;x < listUsers.size();x++){
            String validEmail = listUsers.get(x).getEmail();
            String validPassword = listUsers.get(x).getPassword();

            if(email.equalsIgnoreCase(validEmail) && password.equals(validPassword)){
                user = listUsers.get(x);
            }
        }

        return user;
    }

    public String display(){
        String output = "";
        //init();
        for(int x = 0;x < listUsers.size();x++){
            output += listUsers.get(x).getName()+" "+listUsers.get(x).getSurname()+" "+ listUsers.get(x).getRole() + "\n";
        }

        return output;
    }
}
