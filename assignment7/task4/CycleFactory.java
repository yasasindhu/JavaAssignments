package com.company.assignment7.task4;

public class CycleFactory {
    public Cycle getCycle(String cycleType){
        if(cycleType==null)
            return null;
        if(cycleType.equalsIgnoreCase("UNICYCLE")){
            Cycle unicycle=new Unicycle();
            return unicycle;

        } else if(cycleType.equalsIgnoreCase("BICYCLE")){
           Cycle bicycle= new Bicycle();
           return bicycle;
        } else if(cycleType.equalsIgnoreCase("TRICYCLE")){
            Cycle tricycle= new Tricycle();
            return tricycle;
        }

        return null;
    }




}