package lesson_3.lesson_3_1.newPackage;

import lesson_3.lesson_3_1.Employee;
import lesson_3.lesson_3_1.Person;

public class PersonMain {

    public static void main(String[] args) {

        Person kate = new Person("Kate", 32);
        kate.displayName();     // метод public


      //  kate.displayAge();      // Ошибка, модификатор по умолчанию

        //System.out.println(kate.name);      // Ошибка, модификатор по private
        //System.out.println(kate.age);       // Ошибка, модификатор private

    }
}
