package Solve_2a;

public class Bus extends Vehicle {
    public Bus(int speed, int no_of_passenger) {
        super(speed, no_of_passenger);

        System.out.println("The bus speed: " + speed);
        System.out.println("The number of passenger of bus: " + no_of_passenger);
    }

}