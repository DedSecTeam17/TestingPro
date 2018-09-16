package com.company;


public class SingletonClass {

    private static SingletonClass instance ;
    public static SingletonClass getinstance()
    {
        if (instance ==null)
            instance = new SingletonClass();
        return instance;
    }
    private SingletonClass() {}





}
