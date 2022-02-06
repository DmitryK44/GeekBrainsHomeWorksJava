package ru.geekbrains.lesson6;

public abstract class animal {
    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;

    private String type;
    protected String name;
    private float maxRun;
    private float maxSwim;

    public static int countanimals = 0;

    animal(String type, String name, int maxRun, int maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        ++countanimals;
    }

    String getName() {
        return this.name;
    }

    String getType() {
        return this.type;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxSwim() {
        return this.maxSwim;
    }

    protected boolean run(int distance) {
        return (distance <= maxRun);
    }

    protected int swim(int distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL;
    }

}