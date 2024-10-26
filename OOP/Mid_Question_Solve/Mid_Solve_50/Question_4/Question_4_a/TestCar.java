public class TestCar {
    public static void main(String[] args) {

        ElectricCar obj1 = new ElectricCar();

        obj1.start();
        obj1.stop();

        obj1.chargeBattery();
        obj1.enableAutoPilot();
    }
}
