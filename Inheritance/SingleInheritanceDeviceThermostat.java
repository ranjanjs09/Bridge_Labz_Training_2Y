/**
 * SingleInheritanceDeviceThermostat.java
 * Demonstrates single inheritance with Device superclass and Thermostat subclass.
 */

class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SingleInheritanceDeviceThermostat {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T1001", "On", 22.5);
        thermostat.displayStatus();
    }
}
