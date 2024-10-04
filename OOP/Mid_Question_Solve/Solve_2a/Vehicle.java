package Solve_2a;

public class Vehicle {

    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();

        car.setSpeed(50);
        bus.setSpeed(80);

        car.setPassenger(10);
        bus.setPassenger(40);

        if(car.getSpeed()> bus.getSpeed()){
            System.out.println("car is faster");
        }
        else if(car.getSpeed()<bus.getSpeed()){
            System.out.println("Bus is faster");
        }
        else{
            System.out.println("I am noob");
        }
    }
    
}
