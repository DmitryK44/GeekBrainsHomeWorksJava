package ru.geekbrains.javacorelesson1.Actions;
import ru.geekbrains.javacorelesson1.Barriers.Barrier;
import ru.geekbrains.javacorelesson1.Barriers.Pool;

public class SwimAction implements TeammateAction {
    private int maxDistance;
    private ActionState actionState;

    public SwimAction(int maxDistance) {
        this.maxDistance = maxDistance;
        actionState = ActionState.NONE;
    }

    @Override
    public void pass(Barrier barrier) {
        if (barrier instanceof Pool) {
            Pool pool = (Pool) barrier;
            if (pool.getDistance() <= maxDistance) {
                System.out.println("Success.");
                actionState = ActionState.VICTORY;
            } else {
                System.out.println("He couldn't. Max distance is : " + maxDistance);
                actionState = ActionState.DEFEAT;
            }
        }
    }

    @Override
    public ActionState getActionState() {
        return actionState;
    }
}