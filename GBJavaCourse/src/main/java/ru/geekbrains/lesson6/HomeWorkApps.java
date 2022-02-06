package ru.geekbrains.lesson6;

public class HomeWorkApps {

    public static void main(String[] args) {

        String tempWinEvent = " and wins";
        String tempLossEvent = " and fails";
        String eventName;
        String eventResult;

        dog dog1 = new dog("Goga", 500, 10);
        dog dog2 = new dog("Max", 450, 8);
        cat cat1 = new cat("Oleg", 200, 0);
        cat cat2 = new cat("Stepan", 180, 0);

        animal[] animals = { dog1, dog2, cat1, cat2 };

        int runLength = 200;
        int swimLength = 9;
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " can ";

            eventName = "run " + animals[i].getMaxRun() + " m. He is trying to run ";
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "swim " + animals[i].getMaxSwim() + " m. He is trying to swim ";
            eventResult = (swimResult == animal.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == animal.SWIM_NONE)
                eventResult = " and fails. Cats cant swim.";
            result(nameString, eventName, swimLength, eventResult);
        }
        System.out.println("--------------------------------------------------------------");

        System.out.println("Total count of animals is " + animal.countanimals + " which includes cats : " + cat.countCat + " and dogs : " + dog.countDog);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " m" + resultEvent);
    }
}