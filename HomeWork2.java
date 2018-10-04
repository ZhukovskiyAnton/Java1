package ru.geekbrains;

import java.util.Arrays;

/**
 * Домашняя работа № 2.
 * Основные конструкции.
 * Антон Олегович Жуковский.
 * Создан: 2018.10.04
 */

public class HomeWork2 {

    public static void Arr1Out(int[] arr1) {
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else arr1[i] = 1;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
    }


    public static void Arr2Out(int[] arr2) {
        for (int i = 0, j = 1; i < arr2.length; i++, j = j + 3) {
            arr2[i] = j;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println();
    }

    public static void Arr3Out(int[] arr3) {
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6)
                arr3[i] = arr3[i] * 2;
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println();
    }

    public static void Arr4Out(int[] arr4) {
        int min = arr4[0], max = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] < min) { //Выявляем минимум и максимум путем простого сравнения чисел.
                min = arr4[i];
            }
            if (arr4[i] > max) {
                max = arr4[i];
            }
        }
        System.out.println("Значение минимального элемента в массисве -  " + min);
        System.out.println("Значение максимального элемента в массисве -  " + max);
        System.out.println();
    }

    public static void Arr5Out(int n) {
        int[][] arr5 = new int[n][n];
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if ((i == j) || (j==n-i-1)) {
                arr5[i][j] = 1;
            } else {
                arr5[i][j] = 0;
            }
            System.out.printf("%5d", arr5[i][j]);
        }
        System.out.println();
    }
}


    public static void main(String[] args) {

   /*
 	1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 	Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0.
 	*/
      int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
      Arr1Out(arr1);
           /*
	2 Задать пустой целочисленный массив размером 8.
	 Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
 	*/
        int[] arr2 = new int[8];
        Arr2Out(arr2);

         /*
	3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
	 написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
 	*/
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Arr3Out(arr3);


         /*
	4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
 	*/
         //Не мудрствовал лукаво и взял массив из задания №3.
        Arr4Out(arr3);


        /*
	5 * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
	заполнить его диагональные элементы единицами, используя цикл(ы);
 	*/
        Arr5Out(5); // Для простоты, количество строк и столбцов массива задаем здесь.
    }
}

/*
	\	6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
	7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
	8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
* */