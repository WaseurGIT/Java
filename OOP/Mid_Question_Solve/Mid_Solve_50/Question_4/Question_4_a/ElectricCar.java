public class ElectricCar extends Vehicle implements Electric, Autonomous {

    public void chargeBattery() {
        System.out.println("Electric cars battery has been charged.");
    }

    public void enableAutoPilot() {
        System.out.println("All the electric car is auto, has no feelings!");
    }

}