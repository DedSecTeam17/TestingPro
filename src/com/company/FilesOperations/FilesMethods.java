package com.company.FilesOperations;

import java.io.File;

public class FilesMethods {
    public String fileExtension(File file)
    {
        String filename= file.getName();
        int ind = filename.indexOf('.');
        String ext = filename.substring(ind+1);
        return ext;
    }
}
