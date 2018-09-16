package com.company.varityOperations;

import com.company.Categories.VAR;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;

import static org.junit.Assert.*;
@Category(VAR.class)
public class TestCasesClass {

    @Rule
    public TestName testName = new TestName();



    @Test
    public void testMethodName()
    {
        assertEquals("testMethodName",testName.getMethodName());
    }
    @Test
    public void singletonTest()
    {
        SingletonClass m= SingletonClass.getinstance();
        assertSame(m,SingletonClass.getinstance());
    }


}