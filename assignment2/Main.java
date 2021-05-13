package com.company.assignment2;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        //assignment1
        Pangram pangram = new Pangram();
        String str=sc.next();
        boolean flag = pangram.pangramCheck(str);
        if ((flag == true)) {
            System.out.println("Is a panagram");
        } else {
            System.out.println("Is not a pangram");
        }
    }
}
