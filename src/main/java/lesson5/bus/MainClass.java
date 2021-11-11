package lesson5.bus;

import homework.Person;

/*
Создать класс Bus который содержит
Поля для хранения:
    Количества мест в нем
    Массива пассажиров - Person
    Количества пассажиров, находящихся в нем
Методы
    Конструктор с параметром для первого поля
    Для входа и выхода одного пассажира
    Для входа и выхода нескольких пассажиров сразу
        Пассажиры без имени не могут войти
    go() - который запускает автобус, если в нем кто-то сидит и показывает со сколькими пассажирами он выехал

Создать объекты	чтобы использовать весь этот функционал	в методе
main

 */
public class MainClass {

    public static void main(String[] args){
        Bus bus = new Bus(5);
        Person anna = new Person();
        Person ivan = new Person("Иван", 20);
        Person harry = new Person("Гарри", 17);
        Person antony = new Person("Антон", 30);
        Person petr = new Person("Петя", 30);
        Person ron = new Person("Рон", 18);
        Person hermione = new Person("Гермиона", 18);
        Person test = new Person("", 30);
        bus.changeCountPassengers(new Person[]{ivan, anna}, new Person[]{ivan});
        bus.changeCountPassengers(new Person[]{harry, hermione, ron, antony, petr, ivan}, new Person[]{});
        bus.deletePassenger(ivan);
        bus.go();

        AdvancedBus advancedBus = new AdvancedBus(5, 10, 1);
        advancedBus.setCondition(true);
        advancedBus.changeCountPassengers(new Person[]{harry, hermione, ron, antony, petr, ivan}, new Person[]{});
        System.out.println(advancedBus.calculateMaxDistance());
    }
}
