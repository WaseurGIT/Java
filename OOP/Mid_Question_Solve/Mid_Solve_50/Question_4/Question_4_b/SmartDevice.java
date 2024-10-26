public class SmartDevice implements KitchenAppliance, EntertainmentAppliance {

    public int temperature;
    public int volume;
    public boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Device is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Device is off");
    }

    public void setTemperature(int temperature) {
        if (isOn) {
            this.temperature = temperature;
            System.out.println("Temperature is: " + temperature);
        } else {
            System.out.println("can not set the temperature");
        }
    }

    public void adjustVolume(int volume) {
        if (isOn) {
            this.volume = volume;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Can not set the volume");
        }
    }

    public static void main(String[] args) {
        SmartDevice obj1 = new SmartDevice();

        obj1.turnOn();
        obj1.setTemperature(25);
        obj1.adjustVolume(13);
        obj1.turnOff();
    }
}
