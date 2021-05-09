package com.company;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.GregorianCalendar;

public class Ping {
    public void getPingTime(String ipAddress) throws IOException {
        InetAddress inet = InetAddress.getByName(ipAddress);
        long finish;
        long start = new GregorianCalendar().getTimeInMillis();
        if(inet.isReachable(5000)){
            finish=new GregorianCalendar().getTimeInMillis();
            System.out.println("Ping time :"+(finish-start));
        }
        else{
            System.out.println("Ping not reachable");
        }
    }
}
