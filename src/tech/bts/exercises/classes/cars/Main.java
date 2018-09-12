package tech.bts.exercises.classes.cars;

public class Main {
    public static void main(String[] args) {

        /*Car ferrari = new Car();
        ferrari.model = "Ferrari GTO";
        ferrari.speed = 200;

        Car audi = new Car();
        audi.model = "Audi Q3";
        audi.speed = 150;

        Car temp;
        temp = ferrari;
        ferrari = audi;
        audi = temp;

        System.out.println(ferrari.model + " is driving at "+ ferrari.speed + " km/h");
        System.out.println(audi.model + " is driving at "+ audi.speed + " km/h");*/

        Car ferrari = new Car("Ferrari GT0");
        Car audi = new Car("Audi A8");

        ferrari.accelerate(100);
        ferrari.accelerate(50);
        ferrari.accelerate(50);
        ferrari.accelerate(99);
        ferrari.accelerate(50);


        ferrari.printStatus();
        audi.printStatus();



    }
}
