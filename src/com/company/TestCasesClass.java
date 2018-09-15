package com.company;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.*;

public class TestCasesClass {

    @Rule
    public TestName testName = new TestName();

    @Test
    public void testMethodName()
    {
        assertEquals("testMethodName",testName.getMethodName());
    }

}