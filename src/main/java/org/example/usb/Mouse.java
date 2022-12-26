package org.example.usb;

public class Mouse implements IUsb{
    @Override
    public void doPlugin() {
        System.out.println("mouse do plugin");
    }
}
