package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodsClass {

    public  static  void main(String a[])
    {





    }



    private  int checkSumOfArrayNumbers(List<Integer> integers)
    {
        int sum=0;
        for (Integer integer:integers)
        {
            sum+=integer;

        }
        return  sum;
    }
    private  boolean checkIfTowNumbersAreCompatible(int num1,int num2)
    {
        return Math.floorMod(num1, num2) == 0;
    }
    
    private static   void  Log(String message)
    {
        System.out.println(message);
    }


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
        if (text.length()==9){
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


    public  boolean isBinary(String pattren)
    {
        String theRegex="[01]+";

        return  pattren.matches(theRegex);
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

    public int gcd(int firstNum, int secondNum)
    {
        if (secondNum==0)
            return firstNum;
        else
            return gcd(secondNum,firstNum%secondNum);

    }

    public boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }

    public int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }


    public boolean isEven(int n) {
        return n % 2 == 0;
    }



}
