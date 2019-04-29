package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        Car car1 = new Car("red","Porsche","50 Mph");
        Car car2 = new Car("blue","Jetta","50 Mph");


        car1.isStarting();
        car2.isStarting();
        car1.accelerating();
        car2.accelerating();
        car1.emmissionTest();
        car2.emmissionTest();
        car1.isPassedTest();
        car2.isPassedTest();
        car1.speeding();
        car2.speeding();

    }
}
