package ru.geekbrains.javacorelesson1;
import ru.geekbrains.javacorelesson1.Barriers.Barrier;
public class Course {
    private Barrier[] barriers;

    public Course(Barrier[] barriers) {
        this.barriers = barriers;
    }
    public void doIt(Team team) {
    for (Barrier barrier : barriers) {
        System.out.println("Try to complete our barrier course : " + barrier.getBarrierName());
        team.overcamebarrier(barrier);
    }
}
}
