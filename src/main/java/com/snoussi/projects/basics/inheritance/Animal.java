package com.snoussi.projects.basics.inheritance;

import com.snoussi.projects.basics.interfaces.AnimalBehaviour;
import com.snoussi.projects.basics.interfaces.AnimalCharacteristics;

public abstract class Animal implements AnimalBehaviour, AnimalCharacteristics {

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public String bestFood() {
        return null;
    }
}
