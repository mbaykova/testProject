package lesson_3.lesson_3_3;


/*
 класс Book реализует интерфейс Printable.
 Если класс применяет интерфейс, то он должен реализовать все методы интерфейса, в данном случае print
 В методе main мы можем создать объект класса Book и вызвать его метод print.
 Если класс не реализует какие-то методы интерфейса, то такой класс должен быть определен как абстрактный,
  а его неабстрактные классы-наследники затем должны будут реализовать эти методы.
 */
public class Book implements Printable {
    String name;
    String author;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }

}
