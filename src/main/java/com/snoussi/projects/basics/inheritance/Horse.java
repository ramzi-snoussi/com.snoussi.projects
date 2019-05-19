package com.snoussi.projects.basics.inheritance;

public class Horse extends Animal {
    @Override
    public String makeNoise() {
        return "Heh Heh Heh";
    }

    @Override
    public String bestFood() {
        return "Grass";
    }
}
