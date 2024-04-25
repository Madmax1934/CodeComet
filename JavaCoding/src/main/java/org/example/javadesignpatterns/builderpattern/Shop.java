package org.example.javadesignpatterns.builderpattern;

public class Shop {
    public static void main(String[] args) {
        Phone phone = new Phone("Android",256,"Qualcomm",6.0,5000);
        Phone ph = new PhoneBuilder().setOs("Android")
                                     .setRam(256)
                .setProcessor("Qualcomm")
                .setScreensize(6)
                .setBattery(5000)
                .getPhone();
        System.out.println(ph);
    }
}
