package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class LoginUser {


    public List<User> getAllUsers()
    {
        List<User> users=new ArrayList<>();
        users.add(new User("mohamed","1337"));
        users.add(new User("mohamed","1449"));
        return  users;
    }

    @Test
    public  void  Test()
    {
        assertTrue(checkUser(new User("mohamed","1337")));
    }

    public  boolean  checkUser(User testInput)
    {

        for (User user:getAllUsers())
        {
            if (user.getUserName().equals(testInput.getUserName()) && user.getPassword().equals(testInput.getPassword()))
            {
                return  true;
            }
        }
        return false;

    }
}
