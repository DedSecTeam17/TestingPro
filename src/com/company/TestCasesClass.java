package com.company;

import static org.junit.Assert.*;

public class TestCasesClass {

<<<<<<< HEAD
    public static void main (String a[])
    {

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
=======




>>>>>>> a01dcf396c48870b74dff001e06d7833260bf4dd
}