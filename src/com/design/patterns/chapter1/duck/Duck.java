package com.design.patterns.chapter1.duck;

public abstract class Duck {

    public Duck() {

    }

    public void quack() {
        System.out.println("quack");
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    protected abstract void display();
}
