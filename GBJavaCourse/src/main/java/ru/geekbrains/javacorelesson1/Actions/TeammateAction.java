package ru.geekbrains.javacorelesson1.Actions;
import ru.geekbrains.javacorelesson1.Barriers.Barrier;

public interface TeammateAction {
    void pass(Barrier barrier);
    ActionState getActionState();
}