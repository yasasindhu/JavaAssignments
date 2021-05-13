package com.company.assignment9;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        PatternMatch patternMatch=new PatternMatch();
        if(patternMatch.patternCheck(input))
            System.out.println("true");
    }
}
