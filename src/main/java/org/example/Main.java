package org.example;

import org.example.usb.IUsb;
import org.example.user.IUserInfo;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ServiceLoader<IUsb> loader = ServiceLoader.load(IUsb.class);
//
        for (IUsb imp : loader) {
            imp.doPlugin();
            System.out.println("-----");
        }

        ServiceLoader<IUserInfo> userInfoLoader = ServiceLoader.load(IUserInfo.class);
        System.out.println(userInfoLoader.iterator().next().isLogin());
    }
}