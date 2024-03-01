package com.directi.training.lsp.exercise;

import com.directi.training.lsp.exercise.refactored.DuckInterface;

public class ElectronicDuck implements DuckInterface
{

    private boolean _on = false;

    @Override
    public void quack()
    {
        System.out.println("I'm an Electronic Duck and I Quack...");
    }

    @Override
    public void swim()
    {
        System.out.println("I'm an Electronic Duck and I Swim...");
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
