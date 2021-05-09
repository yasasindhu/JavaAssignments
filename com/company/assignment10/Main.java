package com.company.assignment10;

public class Main {
    public static void main(String args[]){
       SList<String> s1=new SList<String>();
       System.out.println(s1);
       SListIterator<String> slitr=s1.iterator();
       slitr.insert("Hi");
        slitr.insert("Hello");
        slitr.insert("there");
        System.out.println(s1);
        SListIterator<String> slitr2=s1.iterator();
        slitr2.remove();
        slitr2.remove();
        slitr2.remove();
        slitr2.insert("I am");
        slitr2.insert("Sindhu");
        System.out.println(s1);


    }



}
