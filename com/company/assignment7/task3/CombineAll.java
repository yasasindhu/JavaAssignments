package com.company.assignment7.task3;

public interface CombineAll extends Animal, Human, Bird {

    public default String eat(){
        return "Animal eating";
    }

    public default String sleep(){
        return "Animal sleeping";
    }
    public default String work(){
        return "Human is Working";
    }
    public default  String enjoy(){
        return "Human is enjoying";
    }
    public default String  fly(){
        return "Bird is flying";
    }
    public default String findFood(){
        return "Bird is searching for food";
    }
    String set();
}
