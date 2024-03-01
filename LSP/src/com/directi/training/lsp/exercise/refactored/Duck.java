package com.directi.training.lsp.exercise;

import com.directi.training.lsp.exercise.refactored.DuckInterface;

public class Duck implements DuckInterface
{
    @Override
    public void quack()
    {
        System.out.println("I'm a Duck and I Quack...");
    }

    @Override
    public void swim()
    {
        System.out.println("I'm a Duck and I Swim...");
    }
}
