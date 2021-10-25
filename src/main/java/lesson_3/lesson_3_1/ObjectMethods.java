package lesson_3.lesson_3_1;

/*
    Методы класса Object
 */
public class ObjectMethods {

    public static void main(String[] args){
        Person tom = new Person("Tom", 20);
        Person bob = new Person("Bob", 24);
        System.out.println(tom.equals(bob)); // false

        Person tom2 = new Person("Tom", 20);
        System.out.println(tom.equals(tom2)); // true

        System.out.println(tom.toString());
        System.out.println(tom.getClass());

    }
}
