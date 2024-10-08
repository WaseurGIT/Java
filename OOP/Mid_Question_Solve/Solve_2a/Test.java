import Solve_2a.Bus;
import Solve_2a.Car;

public class Test {
    public static void main(String[] args) {

        Car car = new Car(60, 40);
        Bus bus = new Bus(75, 45);

        if (car.getSpeed() > bus.getSpeed()) {
            System.out.println("The car is faster than the bus");
        } else if (bus.getSpeed() > car.getSpeed()) {
            System.out.println("The bus is faster than the car");
        } else {
            System.out.println("Both car and bus has same speed");
        }
    }
}
