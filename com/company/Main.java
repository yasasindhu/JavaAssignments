package com.company;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc=new Scanner(System.in);
        //assignment1
        Pangram pangram=new Pangram();
        boolean flag=pangram.pangramCheck("abcdefghijkLmnOpqrsTuVwXyZ");
        if ((flag == true)) {
            System.out.println("Is a panagram");
        } else {
            System.out.println("Is not a pangram");
        }
        //assignment2
        String inputFileName=sc.next();
        FileMatch fileMatch=new FileMatch();
        List<String> resultantFiles=fileMatch.searchFiles(inputFileName);
        for(String files:resultantFiles)
            System.out.println(files);
        /*//assignment3
        Ping ping=new Ping();
        ping.getPingTime("8.8.8.8");*/

        //assignment4

        KYC kyc=new KYC();
        int noOfInputs=sc.nextInt();
        for(int var=0;var<=noOfInputs;var++){
            String signDate=sc.next();
            String currentDate=sc.next();
            List<String> resultantDates=kyc.check(signDate,currentDate);
            for(String Dates:resultantDates)
                System.out.println(Dates);
        }
    }

}

