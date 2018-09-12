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
        audi.accelerate(30);

        // System.out.println() calls toString() method by default
        System.out.println(ferrari);
        System.out.println(audi);

        int speed1 = ferrari.getSpeed();
        int speed2 = audi.getSpeed();

        int difference = speed1 - speed2;
        System.out.println("difference = " + difference);

    }
}
