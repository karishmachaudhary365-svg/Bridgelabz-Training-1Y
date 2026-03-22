package com.gla.Inheritance;

public class Device {
    String deviceId;
    String status; // ON / OFF

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }

}
