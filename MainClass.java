package ru.geekbrains.Lesson4;

import java.util.Arrays;

/**
 * Домашняя работа № 4.
 * ООП. "Сотрудник".
 * Антон Олегович Жуковский.
 * Создан: 2018.10.11
 */

// 1. Создать класс "Сотрудник" с полями: ФИО,зарплата, возраст;
// 2. Конструктор класса должен заполнять эти поля при создании объекта;
// 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
// 4. Вывести в консоль при помощи методов из пункта 3 ФИО и возраст.
// 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
// 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
// 7. ** Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату сотрудников, вывести результаты работы в консоль.
// 8. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер


public class MainClass {
    public static void main(String[] args) {
        Worker w1 = new Worker("Ivanov Ivan Ivanovich", 48000, 1970);
        Worker w2 = new Worker("Petrov Petr Petrovich", 37000, 1981);
        Worker w3 = new Worker("Sidorov Sidor Sidorovich", 28000, 1990);
        Worker w4 = new Worker("Semenov Semen Semenovich", 46000, 1972);
        Worker w5 = new Worker("Antonov Anton Antonovich", 32000, 1976);
        System.out.println("Ф.И.О. сотрудника: " + w1.getName());
        System.out.println("Возраст сотрудника: " + w1.getAge());
        System.out.println("Ф.И.О. сотрудника: " + w2.getName());
        System.out.println("Возраст сотрудника: " + w2.getAge());
        System.out.println();

        Worker  workerArr[] = new Worker[]{
                new Worker("Ivanov Ivan Ivanovich", 48000, 1970),
                new Worker("Petrov Petr Petrovich", 37000, 1981),
                new Worker("Sidorov Sidor Sidorovich", 28000, 1990),
                new Worker("Semenov Semen Semenovich", 46000, 1972),
                new Worker("Antonov Anton Antonovich", 32000, 1976),

        };
        for (int i = 0; i < workerArr.length; i++) {
            if (workerArr[i].getAge()>40) {
                System.out.print(Arrays.asList(workerArr[i].getName()));
                System.out.print(" зарплата: " + workerArr[i].getPay() + " возраст: ");
                System.out.print(workerArr[i].getAge());
                System.out.println();
            }

            if (workerArr[i].getAge()>45) {
                workerArr[i].increasePay();
            }

        }

    }
}



