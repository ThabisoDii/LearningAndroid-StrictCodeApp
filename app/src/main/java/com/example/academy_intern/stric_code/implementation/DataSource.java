package com.example.academy_intern.stric_code.implementation;

import com.example.academy_intern.stric_code.functionality.Validation;
import com.example.academy_intern.stric_code.interfaces.IUser;
import com.example.academy_intern.stric_code.models.User;

import java.util.ArrayList;

public class DataSource implements IUser {

    public  static ArrayList<User> listUsers = new ArrayList<> ();
    static User onlineUser = null;

    public DataSource(){

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
    public User onlineUser(String email,String password){


        onlineUser = Validation.validateCreditals(email,password);


        return onlineUser;
    }

    public String display(){
        String output = "Currently logged in "+onlineUser.getName()+"\n\n";

        //init();
        for(int x = 0;x < listUsers.size();x++){
            output += listUsers.get(x).getName()+" "+listUsers.get(x).getSurname()+" "+ listUsers.get(x).getRole() + "\n";
        }

        return output;
    }
}
