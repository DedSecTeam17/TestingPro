package com.company.Paramatrized;

import com.company.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UserLoginParameterized {
    private User input;
    private boolean expectedOutput;

    public UserLoginParameterized(User input,boolean expectedOutput)
    {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection addUsers()
    {
        return Arrays.asList(new Object[][]{
                {new User("mohamed","1337"),true}
                ,
                {new User("mohamed","1337"),true}
                ,
                {new User("mohamed","1337"),true}
        });
    }


    @Test
    public void loginTest()
    {
        LoginUser loginUser = new LoginUser();
        assertEquals(loginUser.checkUser(input),expectedOutput);
    }

}
