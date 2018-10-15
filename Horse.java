package ru.geekbrains.Lesson5;

public class Horse extends Animal{
    private float swimmax;

    public Horse (String name, String type, float runmax, float jumpmax, float swimmax) {
        super(name, type, runmax, jumpmax, swimmax);
    }

}