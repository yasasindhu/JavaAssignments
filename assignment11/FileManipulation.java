package com.company.assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileManipulation {
    public void characterCount(String inputFileName) throws FileNotFoundException {
        File directory = new File("/home/sindhy/Documents");
        String[] fileList = directory.list();
        if (fileList == null)
            return;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (String fileName : fileList) {

            if (Pattern.matches(inputFileName, fileName)) {

                File file2 = new File(fileName);
                Scanner sc = new Scanner(file2.getAbsoluteFile());
                System.out.println(file2.getAbsoluteFile());
                while (sc.hasNextLine()) {
                    //take it in line by line
                    String line = sc.nextLine();
                    //cycle through each character in the line
                    for (int i = 0; i < line.length(); i++) {
                        if (hashMap.containsKey(line.charAt(i)))
                            hashMap.put(line.charAt(i), hashMap.get(line.charAt(i)) + 1);
                        else
                            hashMap.put(line.charAt(i), 1);
                    }
                }
                try {
                    FileWriter fw=new FileWriter("result.txt");
                    Iterator hmIterator = hashMap.entrySet().iterator();
                    while (hmIterator.hasNext()) {
                        Map.Entry mapElement = (Map.Entry) hmIterator.next();
                        int count = ((int) mapElement.getValue());
                        fw.write(mapElement.getKey()+" : "+count);
                        fw.write("\n");
                    }
                    fw.close();
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        }
    }
}

