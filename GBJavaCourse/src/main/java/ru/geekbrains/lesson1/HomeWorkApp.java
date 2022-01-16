package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        /*printfThreeWords();
         *checkSumSign();
         *printColor();
         */
        compareNumbers();

    }

    public static void printfThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.print("_Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -20;
        if (Integer.sum(a, b) >= 0) {
            System.out.print("Сумма положительная");
        } else {
            System.out.print("Cумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 110;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 30;
        int b = 20;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}

