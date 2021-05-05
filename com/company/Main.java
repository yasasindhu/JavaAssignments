package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");
    Pangram pangram=new Pangram();
    boolean flag=pangram.pangramCheck("abcdefghijkLmnOpqrsTuVwXyZ");
        if ((flag == true)) {
            System.out.println("Is a panagram");
        } else {
            System.out.println("Is not a pangram");
        }
    }

}

