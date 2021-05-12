package com.company.assignment7.task2;

public class Main {
    public static void main(String[] args){
        Cycle[] cycleArray=new Cycle[3];
        cycleArray[0]=new Unicycle();
        cycleArray[1]=new Bicycle();
        cycleArray[2]=new Tricycle();
        Cycle cycle=new Cycle();
        System.out.println(cycleArray[0].balance(cycle));
        System.out.println(cycleArray[1].balance(cycle));
        System.out.println(cycleArray[2].balance(cycle));
    }
}
