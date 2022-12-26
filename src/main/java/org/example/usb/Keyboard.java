package org.example.usb;

public class Keyboard implements IUsb{
    @Override
    public void doPlugin() {
        System.out.println("Keyboard do plugin");
    }
}
