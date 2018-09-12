package tech.bts.exercises.classes.cars;

public class Car {

    // Fields / Properties

    String model;
    int speed;

    // Constructor

    public Car (String model){
        this.model = model;
        this.speed = 0;

    }

    // Methods / functions

    public void PrintStatus (){
        System.out.println(this.model + " is driving at "+ this.speed + " km/h");

    }


}
