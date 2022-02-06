package ru.geekbrains.lesson6;

public class dog extends animal {

    public static int countDog = 0;
    public static String typeThisClass = "Dog";

    dog(String name, int maxRun, int maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countDog;
    }



}