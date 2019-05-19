package com.snoussi.projects.basics.inheritance;

public class Cat extends Animal {

    @Override
    public String bestFood() {
        return "Fish";
    }

    @Override
    public String makeNoise() {
        return "Miaw";
    }
}
