package com.company.UserValidationMethods;

import com.company.Categories.USER_VALIDATION;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static junit.framework.TestCase.*;
@Category(USER_VALIDATION.class)
public class TestCases {


    private static UserValidation userValidation;

    @BeforeClass
    public static   void  setUp()
    {
        userValidation=new UserValidation();
    }


    @Test
    public  void  TestUserName()
    {
        assertTrue(userValidation.checkuserName("mohammedElamin"));

    }

    @Test
    public  void  TestPassword()
    {
        assertTrue(userValidation.checkPassword("mohammed1337"));

    }

    @Test
    public  void  TestEmail()
    {
        assertTrue(userValidation.checkEmail("mohamed@gmail.com"));

    }

    @Test
    public  void  TestNumbers()
    {
        assertTrue(userValidation.isNumberOnly("123444"));

    }

    @Test
    public  void  TestLetter()
    {
        assertTrue(userValidation.isLettersOnly("abcd"));

    }

    @Test
    public  void  TestPhoneNumber()
    {
        assertTrue(userValidation.isPhonNumber("0902649933"));
    }

    @Test
    public  void  TestGender()
    {
        assertTrue(userValidation.checkGender("male"));
    }

    @AfterClass
    public static void  tearDown()
    {
        userValidation=null;

    }
}
