package com.company.assignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import java.util.regex.Pattern;

public class FileMatch {
    public List<String> searchFiles(String inputFileName) {
        List<String> resultFileNames=new ArrayList<>();
        File directory = new File("/home/sindhy");
        String[] fileList = directory.list();
        if(fileList==null)
            return resultFileNames;
            for (String fileName : fileList) {

                if (Pattern.matches(inputFileName, fileName)) {
                    File file = new File(fileName);
                    resultFileNames.add(file.getAbsolutePath());
                }
            }

        return resultFileNames;
    }
}
//Time Complexity:O(N) N is the no.of files contained in home directory
//Space Complexity:O(N) we store in list so in worst case it could be all the files
