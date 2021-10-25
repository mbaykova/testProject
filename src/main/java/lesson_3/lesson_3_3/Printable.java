package lesson_3.lesson_3_3;

public interface Printable {

    void print();


    //Начиная с JDK 8 в интерфейсах доступны статические методы
    static void read(){
        System.out.println("Read printable");
    }
}
