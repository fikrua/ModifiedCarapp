package com.company;

public class Car extends Vhicle {
    private String speed;
    private String color;
    private String model;

    public Car() {
        System.out.println("this car has no paramtaer");

    }

    public Car( String color, String model,String speed) {
        this.speed = speed;
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public void setSpeed(String speed) {
        this.speed = speed;
    }


    public String getSpeed() {
        return speed;
    }
    public void  isStarting(){
        System.out.println("the " +this.getColor() +" "+this.getModel()+" is starting");

    }
    public void accelerating(){
        System.out.println("the "  + this.getColor() +" "+this.getModel()+" is accelerating");
    }
    public void emmissionTest(){
        System.out.println("the " + this.getColor() +" "+this.getModel()+" stopped to have its emissions checked ");
    }
    public void isPassedTest(){
        System.out.println("the " + this.getColor() +" "+this.getModel()+" passes its emission test     ");
    }
    public void pasedIt(){
        System.out.println("the " + this.getColor() +" "+this.getModel()+" just passed the red Porsche     ");
    }
   public void speeding(){
       System.out.println("the " + this.getColor() +" "+this.getModel()+" is going "+ this.speed );

   }



}
