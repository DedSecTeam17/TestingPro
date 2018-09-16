package com.company;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class TestCasesClass {

    @Rule
    public TestName testName = new TestName();

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

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
    @Test
    public void testTempFolder() throws IOException
    {
        File tempFolder = temporaryFolder.newFolder("temp Folder");
        assertTrue(tempFolder.exists());
    }

}