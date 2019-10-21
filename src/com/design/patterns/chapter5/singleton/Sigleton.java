package com.design.patterns.chapter5.singleton;

public class Sigleton {

    private static Sigleton uniqueInstance;
    private Sigleton() {

    }

    public static Sigleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Sigleton();
        }

        return uniqueInstance;
    }
}
