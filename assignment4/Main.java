package com.company.assignment4;
import com.company.assignment1.FileMatch;
import com.company.assignment2.Pangram;
import com.company.assignment4.KYC;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc=new Scanner(System.in);
        KYC kyc=new KYC();
        int noOfInputs=sc.nextInt();
        for(int var=0;var<noOfInputs;var++){
            String signDate=sc.next();
            String currentDate=sc.next();
            List<String> resultantDates=kyc.check(signDate,currentDate);
            for(String Dates:resultantDates) {
                System.out.println(Dates);
            }
        }
    }

}

