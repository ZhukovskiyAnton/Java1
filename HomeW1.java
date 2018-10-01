package ru.geekbrains;

public class HomeW1{
    public static float exercise1(float a, float b, float c, float d) {
        float result = a*(b+(c/d));
        return result;
    }
    public static boolean exercise2(int a, int b) {
        int sum = a+b;
        boolean more = sum >= 10;
        boolean less = sum <= 20;
        boolean result;
        if (more && less) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
    public static boolean exercise3(int a) {
        boolean more = a >= 0;
        boolean result;
        if (more) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
    public static String exercise4(String name) {
        String result = "Привет, " + name + "!";
        return result;
    }
    public static void printer(String message) {
        System.out.println("Result of exercise " + message);
    }
    public static void exercise5(int year) {
        if ((year % 4)==0 ) {
            if ((year % 100) !=0 || (year % 400) == 0) {
             printer("5: " + year + " год является високосным");
            } else printer("5: " + year  + " год не является високосным");
            }
            else printer("5: " + year + " год не является високосным");
    }
    public static void main(String[] args) {
       float ex1 = exercise1(4f, 5f, 6f, 7f);
       printer("1: " + ex1);

        boolean ex2 = exercise2(5, 6);
        printer("2: " + ex2);

        boolean ex3 = exercise3(11);
        if (ex3) {
            printer("3: передали положительное число");
        }
        else {
            printer("3: передали отрицательно число");
        }

        String ex4 = exercise4("Иван");
        printer("4: " + ex4);

        exercise5(250);
    }
}

