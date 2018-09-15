package com.company;


import java.util.ArrayList;

import java.io.File;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodsClass {

    private static MethodsClass instance ;
    public static MethodsClass getinstance()
    {
        if (instance ==null)
            instance = new MethodsClass();
        return instance;
    }
    private MethodsClass() {}





}
