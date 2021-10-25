package lesson_3.lesson_3_1;

public class PersonMain {

    public static void main(String[] args) {

        Person kate = new Person("Kate", 32);
        kate.displayName();     // метод public
        kate.displayAge();      // метод имеет модификатор по умолчанию

      // System.out.println(kate.name);      // ! Ошибка, модификатор private
      //  System.out.println(kate.age);       // ! Ошибка, модификатор private
    }
}
