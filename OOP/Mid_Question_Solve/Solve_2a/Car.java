package Solve_2a;

public class Car extends Vehicle {
    public Car(int speed, int no_of_passenger) {
        super(speed, no_of_passenger);

        System.out.println("The car speed: " + speed);
        System.out.println("The number of passenger of car: " + no_of_passenger);
    }

}
