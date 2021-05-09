package com.company.assignment7.task4;

public class FactoryDemo {
    public static void main(String[] args) {
        CycleFactory cycleFactory = new CycleFactory();


        Cycle cycle = cycleFactory.getCycle("UNICYCLE");

      cycle.ride();

        Cycle cycle1 = cycleFactory.getCycle("BICYCLE");

       cycle1.ride();
        Cycle cycle2 = cycleFactory.getCycle("TRICYCLE");

       cycle2.ride();
    }

}
