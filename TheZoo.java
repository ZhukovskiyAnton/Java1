package ru.geekbrains.Lesson5;

/**
 * Домашняя работа № 5.
 * Игра "ООП. Зоопарк.".
 * Антон Олегович Жуковский.
 * Создан: 2018.10.15
 */

public class TheZoo {
    public static void main(String[] args) {
        Dog d = new Dog("Muhtar", "Dog", 500, 0.5f, 10);
        Horse h = new Horse ("Spirit", "Horse", 1500, 3, 100);
        Bird b = new Bird ("Kesha", "Bird", 2, 5, 0.2f, 0);
        Cat c = new Cat ("Vasya", "Cat", 200, 2, 0);

        Animal[] zoo = {d, h, b, c};

        for (int i = 0; i < zoo.length; i++) {

            System.out.println(zoo[i].run(300));
            System.out.println(zoo[i].jump(2.2f));
            System.out.println(zoo[i].swim(5));
            System.out.println();
        }
    }
}

/*
1. Создать классы Собака, Лошадь, Птица и Кот с наследованием
от класса Животное.

2. Животные могут выполнять действия: бежать, плыть,
перепрыгивать препятствие. В качестве параметра каждому методу
передается величина, означающая или длину препятствия (для бега и плавания),
или высоту (для прыжков).

3. У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

4. При попытке животного выполнить одно из этих действий, оно должно
сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')

5. * Добавить животным разброс в ограничениях. То есть у одной собаки
ограничение на бег может быть 400 м., у другой 600 м.
*/