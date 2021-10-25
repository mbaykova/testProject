package lesson_3.lesson_3_2;


/*
Абстрактные классы призваны предоставлять базовый функционал для классов-наследников.
А производные классы уже реализуют этот функционал.
 */
public abstract class Person {

    private String name;

    public String getName() {
        return name;
    }

    public Person(String name){
        this.name = name;
    }

    public abstract void display();


    public static void main(String[] args) {

        Employee sam = new Employee("Sam", "Leman Brothers");
        sam.display();
        Client bob = new Client("Bob", "Leman Brothers");
        bob.display();
    }
}
