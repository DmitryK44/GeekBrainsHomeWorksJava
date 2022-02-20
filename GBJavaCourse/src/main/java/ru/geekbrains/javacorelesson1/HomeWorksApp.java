package ru.geekbrains.javacorelesson1;
import ru.geekbrains.javacorelesson1.Actions.TeammateAction;
import ru.geekbrains.javacorelesson1.Actions.RunAction;
import ru.geekbrains.javacorelesson1.Actions.SwimAction;
import ru.geekbrains.javacorelesson1.Barriers.Barrier;
import ru.geekbrains.javacorelesson1.Barriers.Pool;
import ru.geekbrains.javacorelesson1.Barriers.Race;


import java.util.Random;

public class HomeWorksApp {
        private static final int POOL_DISTANCE = 100;
        private static final int RACETRACK_DISTANCE = 100;

        public static void main(String[] args) {
            Course course = new Course(makeBarriers());
            Teammate[] teammates = makeTeammates();
            Team team = new Team("Loosers", teammates);
            System.out.println("---------------------------");
            team.infoaboutplayers();
            System.out.println("---------------------------");
            course.doIt(team);

        }

        public static Barrier[] makeBarriers() {
            return new Barrier[]{
                    new Pool(POOL_DISTANCE),
                    new Race(RACETRACK_DISTANCE),
            };
        }

        public static Teammate[] makeTeammates() {
            return new Teammate[] {
                    new Teammate("Alex", new TeammateAction[] { getSwimAction(), getRunAction() }),
                    new Teammate("Tom", new TeammateAction[] { getRunAction(),getSwimAction() }),
                    new Teammate("Sam", new TeammateAction[] { getRunAction(),getSwimAction() }),
                    new Teammate("Oleg", new TeammateAction[] { getSwimAction(),getRunAction() }),
            };
        }


        public static TeammateAction getSwimAction() {
            Random random = new Random();
            SwimAction swimAction = new SwimAction(random.nextInt(POOL_DISTANCE + 43));
            return swimAction;
        }


        public static TeammateAction getRunAction() {
            Random random = new Random();
            RunAction runAction = new RunAction(random.nextInt(RACETRACK_DISTANCE + 46));
            return runAction;
        }
    }
