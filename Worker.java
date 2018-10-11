package ru.geekbrains.Lesson4;

// 1. Создать класс "Сотрудник" с полями: ФИО,зарплата, возраст;
public class Worker {
    private static final int currentYear = 2018;

    private String name;
    private int pay;
    private int birthYear;

    Worker (int birthYear) {
        this.birthYear = birthYear;
    }

    // 2. Конструктор класса должен заполнять эти поля при создании объекта;
        Worker(String name, int pay, int birthYear) {
        this(birthYear);
        this.pay = pay;
        this.name = name;
    }

    // 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    String getName() {
        return this.name;
    }
    int getPay() {
        return this.pay;
    }
    int getAge() {
        return currentYear - birthYear;
    }
    // 4. Вывести в консоль при помощи методов из пункта 3 ФИО и возраст.
    // 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    // 7. ** Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату сотрудников, вывести результаты работы в консоль.
    // 8. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер

    // 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
        void increasePay() {
            if (this.getAge() > 45)
                this.pay = this.pay + 5000;
        }
}
