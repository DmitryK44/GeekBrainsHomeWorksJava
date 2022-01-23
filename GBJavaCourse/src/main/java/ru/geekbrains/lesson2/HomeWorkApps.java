package ru.geekbrains.lesson2;

public class HomeWorkApps {
    public static void main(String[] args) {
        System.out.println("Result of 1st part homework2 is");
        System.out.println("" + summwithin10and20(8, 7));
        System.out.println("Result of 2nd part homework2 is");
        ispositiveornot(10);
        System.out.println("Result of 3rd part homework2 is");
        System.out.println("" + isfalseortrue(-29));
        System.out.println("Result of 4th part homework2 is");
        StringCount(10,"Have a nice day");
    }

    public static boolean summwithin10and20(int a, int b) {
        return ((a + b) >= 10) && ((a + b) <= 20);
    }

    public static void ispositiveornot(int c) {
        if (c >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isfalseortrue(int d) {
        if (d >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void StringCount(int e, String f) {
        for (int g = 1; g <= e; g++) {
            System.out.println(g + "-"+ f);
        }
    }
}