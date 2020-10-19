package com.Rachma.Modul2.Polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subclass = new Y();

        superClass.getValue("Tidur");
        subclass.getValue("Makan");
    }
}
