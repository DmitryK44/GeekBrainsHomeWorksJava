package ru.geekbrains.lesson6;

public class cat extends animal {

    public static int countCat = 0;
    public static String typeThisClass = "Cat";

    cat(String name, int maxRun, int maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    protected int swim(int distance) {
        return animal.SWIM_NONE;
    }

}