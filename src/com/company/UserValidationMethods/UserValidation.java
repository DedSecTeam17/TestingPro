package com.company.UserValidationMethods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    //#region Fields Regex Checks
    public boolean checkPassword(String text) {
        String theRegex = "[A-Za-z0-9]{6,}";
        return checkRegex(theRegex,text);
    }
    public boolean checkEmail(String text) {
        String theRegex = "[A-Za-z0-9.-_]+@[A-Za-z]+\\.[A-Za-z]{2,3}";
        return checkRegex(theRegex,text);
    }
    public boolean checkuserName(String text) {
        String theRegex = "\\w{6,15}\\w";
        return checkRegex(theRegex,text);
    }
    //checks for numbers only with no spaces
    public boolean isNumberOnly(String text) {
        String theRegex = "[0-9]+$";
        return checkRegex(theRegex,text);
    }
    public boolean isPhonNumber(String text) {
        String theRegex = "[0-9]+$";
        if (text.length()==10){
            return checkRegex(theRegex,text);
        }else {
            return  false;
        }


    }
    //checks for letters only with or without spaces
    public boolean isLettersOnly(String text) {
        String theRegex = "[A-Za-z\\s]+$";
        return checkRegex(theRegex,text);
    }
    boolean checkGender(String text)
    {
        if(text.equalsIgnoreCase("male") || text.equalsIgnoreCase("female"))
            return true;
        return false;
    }
    private boolean checkRegex(String theRegex, String text)
    {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher match = checkRegex.matcher(text);

        while (match.find()) {
            if (match.group().length() != 0 && match.start() == 0)
                return true;
        }

        return false;
    }
}
