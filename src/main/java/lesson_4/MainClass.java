package lesson_4;

public class MainClass {


    public static void main(String args[]){
        Cat cat = new Cat();
        cat.info();

        Cat cat2 = new Cat("Мурзик", "Рыжий", 5000);
        cat2.info();


        Cat2 cat3 = new Cat2();
        cat3.info();

        Cat2 cat4 = new Cat2("Мурзик", "Рыжий", 5000);
        cat4.info();
    }
}
