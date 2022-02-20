package ru.geekbrains.javacorelesson1.Barriers;

public abstract class Barrier {
    private int distance;
    public Barrier(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public String getBarrierName() {
        return this.getClass().getSimpleName();
    }
}
