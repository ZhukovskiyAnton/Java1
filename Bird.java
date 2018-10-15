package ru.geekbrains.Lesson5;

public class Bird extends Animal{

    private int height;


    public Bird (String name, String type, int height, float runmax, float jumpmax, float swimmax) {
        super(name, type, runmax, jumpmax, swimmax);
        this.height = height;
    }


    public void fly() {
        System.out.println(name + " летает на высоте: " + height);
    }


}