package com.company.NumbersOperations;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Numbers {

    public  static  void  main(String a[])
    {

        for (Integer x:new Numbers().getFactors(8))
        {
            Log(String.valueOf(x));
        }

    }



    public   int checkSumOfArrayNumbers(List<Integer> integers)
    {
        int sum=0;
        for (Integer integer:integers)
        {
            sum+=integer;

        }
        return  sum;
    }
    public  boolean checkIfTowNumbersAreCompatible(int num1,int num2)
    {
        return Math.floorMod(num1, num2) == 0;
    }

    public static   void  Log(String message)
    {
        System.out.println(message);
    }







    public  boolean isBinary(String pattren)
    {
        String theRegex="[01]+";

        return  pattren.matches(theRegex);
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
    public int sqrt(int n)
    {
        return (int)Math.sqrt(n);
    }
    public int power(int n1,int n2)
    {
        return (int)Math.pow(n1,n2);
    }
    public double circleRadius(int r)
    {
        double radius = (3.14)*Math.pow(r,2);
        return radius;
    }
    public String fileExtension(File file)
    {
        String filename= file.getName();
        int ind = filename.indexOf('.');
        String ext = filename.substring(ind+1);
        return ext;
    }
    public boolean isPositive(int num)
    {
        return num>0;
    }
    public boolean stringMatch(String message,String pattern)
    {
        return message.contains(pattern);
    }
    public boolean isDistinct(int[] arr)
    {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] == arr[j])
                    return false;
            }
        }
        return true;
    }
    public String convert24Hoursto12Hours(String time)
    {
        DateFormat inputFormat = new SimpleDateFormat("HH:mm:ss");
        DateFormat outputFormat = new SimpleDateFormat("hh:mm:ss aa");

        Date date = null;
        String output = "";

        try {
            date = inputFormat.parse(time);
            output = outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return output;


    }
    public ArrayList<Integer> getFactors(int num)
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        // Skip two if the number is odd
        int incrementer = num % 2 == 0 ? 1 : 2;
        for (int i = 1; i <= Math.sqrt(num); i += incrementer) {
            // If there is no remainder, then the number is a factor.
            if (num % i == 0) {
                factors.add(i);
                // Skip duplicates
                if (i != num / i) {
                    factors.add(num / i);
                }
            }
        }
        // Sort the list of factors
        Collections.sort(factors);
        return factors;
    }
}
