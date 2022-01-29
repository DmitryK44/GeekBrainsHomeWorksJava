package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApps {
    public static int fieldSizeH = 3;
    public static int fieldSizeW = 3;
    public static char[][] field;

    public static char DOT_X = 'X';
    public static char DOT_O = 'O';
    public static char DOT_EMPTY = '_';

    public static Scanner Scanner = new Scanner(System.in);
    public static Random Random = new Random();

    public static void main(String[] args) {
        createfield();
        printfield();
        while (true) {
            myturn();
            printfield();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printfield();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {
        if (field[0][0] == symb && field[0][1] == symb && field[0][2] == symb) return true;
        if (field[1][0] == symb && field[1][1] == symb && field[1][2] == symb) return true;
        if (field[2][0] == symb && field[2][1] == symb && field[2][2] == symb) return true;
        if (field[0][0] == symb && field[1][0] == symb && field[2][0] == symb) return true;
        if (field[0][1] == symb && field[1][1] == symb && field[2][1] == symb) return true;
        if (field[0][2] == symb && field[1][2] == symb && field[2][2] == symb) return true;
        if (field[0][0] == symb && field[1][1] == symb && field[2][2] == symb) return true;
        if (field[2][0] == symb && field[1][1] == symb && field[0][2] == symb) return true;
        return false;
    }


    public static void createfield() {
        field = new char[fieldSizeH][fieldSizeW];
        for (int i = 0; i < fieldSizeH; i++) {
            for (int j = 0; j < fieldSizeW; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printfield() {
        for (int i = 0; i <= fieldSizeW; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < fieldSizeW; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < fieldSizeH; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean validation(int x, int y) {
        if (x < 0 || x >= fieldSizeW || y < 0 || y >= fieldSizeH) return false;
        if (field[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void myturn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = Scanner.nextInt() - 1;
            y = Scanner.nextInt() - 1;
        } while (!validation(x, y));
        field[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = Random.nextInt(fieldSizeW);
            y = Random.nextInt(fieldSizeH);
        } while (!validation(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        field[y][x] = DOT_O;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < fieldSizeW; i++) {
            for (int j = 0; j < fieldSizeH; j++) {
                if (field[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}