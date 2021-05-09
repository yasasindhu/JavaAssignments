package com.company.assignment7.task5;

public class Nested {
    public static void main(String args[]){
      First first=new First(5);
      First.Second f1=new First.Second(6);
    }
    public static class First{
        int num1;
        First(int num1){
            this.num1=num1;
            System.out.println(num1);
        }
        public static class Second extends First{


            Second(int num1) {
                super(num1);
            }
        }
    }

}
