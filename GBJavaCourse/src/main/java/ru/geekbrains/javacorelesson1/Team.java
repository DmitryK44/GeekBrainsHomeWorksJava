package ru.geekbrains.javacorelesson1;
import ru.geekbrains.javacorelesson1.Barriers.Barrier;
public class Team {
    private final String title;

    private final Teammate[] teammates;

    public Team(String title, Teammate[] teammates) {
        this.title = title;
        this.teammates = teammates;
    }
    public void infoaboutplayers() {
        System.out.println("Our Best Team : ");
        for (Teammate teammate : teammates) {
            System.out.println(teammate.getName());
        }
    }

    public void overcamebarrier(Barrier barrier) {
        for (Teammate teammate : teammates) {
            teammate.overcamebarrier(barrier);
        }
    }

}