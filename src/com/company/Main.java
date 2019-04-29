package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<Car>();
        boolean done  = false;
        while(!done){
        System.out.println("enter the car color");
        String colores = scan.nextLine();
        System.out.println("enter the model ");
        String mod = scan.nextLine();
        System.out.println("enter the speed ");
        String speed = scan.nextLine();

        Car car = new Car(colores,mod,speed);
       cars.add(car);
            System.out.println("do you continue y/n");
            String yes = scan.nextLine();
            if(yes.equalsIgnoreCase("y"))
                done =false;
            else
                done = true;
        }
        for(Car c:cars) {


        c.isStarting();
        c.accelerating();
        c.emmissionTest();
        c.isPassedTest();
        c.speeding();
        }


    }
}
