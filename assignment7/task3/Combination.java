package com.company.assignment7.task3;

public class Combination extends Concrete implements CombineAll {

    public String eat(){
        return "Animals eating";
    }
    @Override
    public String sleep(){
        return "Animals sleeping";
    }
    @Override
    public String work(){
        return "Humans is Working";
    }

   @Override
    public String enjoy(){
        return "Humans is enjoying";
    }
    @Override
    public String  fly(){
        return "Birds is flying";
    }
    @Override
    public String findFood(){
        return "Birds is searching for food";
    }
    public String set(){
        return "combined all of them";
    }
}
