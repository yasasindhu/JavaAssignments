package com.company.assignment1;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.util.Scanner;


public class Main<resultantFiles, files> {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        String inputFileName = sc.next();
        FileMatch fileMatch = new FileMatch();
        List<String> resultantFiles = fileMatch.searchFiles(inputFileName);
        for (String files : resultantFiles)
            System.out.println(files);

    }
}
