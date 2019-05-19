package com.snoussi.projects.basics.inheritance;

public class Dog extends Animal {

    @Override
    public String bestFood() {
        return "Meat";
    }

    @Override
    public String makeNoise() {
        return "Bark";
    }
}
