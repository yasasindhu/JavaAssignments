package com.company.assignment7.task1;

public class Main {
    public static void main(String[] args){
        Rodent[] rodentArray=new Rodent[3];
        rodentArray[0]=new Mouse();
        rodentArray[1]=new Gerbil();
        rodentArray[2]=new Hamster();
        System.out.println(rodentArray[0].run());
        System.out.println(rodentArray[1].run());
        System.out.println(rodentArray[2].run());
    }
}
