package com.company.assignment6;

public class Main {
    public static void main(String args[]){
        //task-2
        ConstructorOverloadingExample example=new ConstructorOverloadingExample(1,"sindhu","IT");
        System.out.println(example.getId());
        System.out.println(example.getName());
        System.out.println(example.getDepartment());
        ConstructorOverloadingExample example1=new ConstructorOverloadingExample(2,"pooja");
        System.out.println(example1.getId());
        System.out.println(example1.getName());
        //as department is not initialized in example2 instance it gives null value
        System.out.println(example1.getDepartment());
        //task-3
        Robot[] robotArray=new Robot[2];
        System.out.println(robotArray[0]);
        //task-4
        robotArray[0]=new Robot("sending first input to robot constructor");
        robotArray[1]=new Robot("sending second input to robot constructor");
    }
}
