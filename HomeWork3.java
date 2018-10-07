package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;

/**
 * Домашняя работа № 3.
 * Игра "Крестики-нолики".
 * Антон Олегович Жуковский.
 * Создан: 2018.10.08
 */

public class HomeWork3 {
    private static final char HUMAN_DOT = 'X';
    private static final char AI_DOT = 'O';
    private static final char EMPTY_DOT = '_';
    private static final char YES = 'y';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static int fieldSizeY;
    private static int fieldSizeX;
    private static char[][] field;

    private static void initField() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = EMPTY_DOT;
            }
        }
    }

    private static void printField() {
        System.out.println("  1 2 3 X"); // Небольшой апгрейд для более приятного визуального восприятия
        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print((y + 1) + "|");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("Y");
        System.out.println();
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.print("Please enter coordinates X and Y (1 to 3) separated by space: ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isEmptyCell(x, y) || !isValidCell(x, y));
        field[y][x] = HUMAN_DOT;
    }


    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == EMPTY_DOT;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = AI_DOT;
    }

    private static boolean isFieldFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isEmptyCell(x, y))
                    return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char c) {
        boolean winD1 = true;
        boolean winD2 = true;

        for (int i = 0; i < fieldSizeX - 1; i++) {
            //проверка по диагоналям
            if (winD1 && field[i][i] == c && field[i + 1][i + 1] == c) {
                winD1 = true;
            }
            else {
                winD1 = false;
            }

            if (winD2 && field[i][fieldSizeX - i - 1] == c && field[i + 1][fieldSizeX - i - 2] == c) {
                winD2 = true;
            }
            else {
                winD2 = false;
            }
        }
        if (winD1 || winD2)
            return true;

        for (int y = 0; y < fieldSizeX; y++) {
            boolean winH = true;
            boolean winV = true;

            for (int x = 0; x < fieldSizeX - 1; x++) {
                // проверка по горизонтали

                if (winH && (field[y][x] == c && field[y][x + 1] == c)) {
                    winH = true;
                }
                else {
                    winH = false;
                }
                // проверка по вертикали
                if (winV && (field[x][y] == c && field[x + 1][y] == c)) {
                    winV = true;
                }
                else {
                    winV = false;
                }
            }

            if (winH || winV)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        while (true) {
            initField();
            printField();
            while (true) {

                humanTurn();
                printField();
                if (checkWin(HUMAN_DOT)) {
                    System.out.println("Player wins!");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("Draw!");
                    break;
                }
                aiTurn();
                printField();
                if (checkWin(AI_DOT)) {
                    System.out.println("Computer wins!");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("Draw!");
                    break;
                }
            }

            System.out.print("Play again? - Press (y): ");
            if (SCANNER.next().charAt(0) != YES) break; //Этот метод загуглил, т.к. Int не подходит для ответа YES.
        }
    }
}