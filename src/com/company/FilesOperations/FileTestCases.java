package com.company.FilesOperations;

import com.company.Categories.FILES;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

@Category(FILES.class)
public class FileTestCases {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();
    private static FilesMethods filesMethods;

    @BeforeClass
    public static void setUp() {
        filesMethods = new FilesMethods();
    }


    @Test
    public void TestFileExtension()
    {
        File f = new File("a.pdf");
        assertEquals(filesMethods.fileExtension(f),"pdf");
    }

    @Test
    public void testTempFolder() throws IOException
    {
        File tempFolder = temporaryFolder.newFolder("temp Folder");
        assertTrue(tempFolder.exists());
    }
}
