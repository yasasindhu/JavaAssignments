package com.company.assignment3;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        String input_str = sc.next();
        Ping ping = new Ping();
        ping.getPingTime(input_str);
    }
}
