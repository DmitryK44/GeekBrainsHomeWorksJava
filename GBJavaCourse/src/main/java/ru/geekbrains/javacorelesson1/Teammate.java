package ru.geekbrains.javacorelesson1;
import ru.geekbrains.javacorelesson1.Actions.ActionState;
import ru.geekbrains.javacorelesson1.Actions.TeammateAction;
import ru.geekbrains.javacorelesson1.Barriers.Barrier;

public record Teammate(String name, TeammateAction[] teammateActions) {

    public String getName() {
        return name;
    }

    public void overcamebarrier(Barrier barrier) {
        System.out.println(getName() + " tries to complete " + barrier.getBarrierName());
        for (TeammateAction action : teammateActions) {
            action.pass(barrier);
        }
    }

    public boolean isWinner() {
        for (TeammateAction action : teammateActions) {
            if (action.getActionState() == ActionState.NONE || action.getActionState() == ActionState.DEFEAT) {
                return false;
            }
        }
        return true;
    }
}
