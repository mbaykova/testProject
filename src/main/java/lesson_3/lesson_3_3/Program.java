package lesson_3.lesson_3_3;

public class Program {


    public static void main(String[] args) {
        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
        printable.print();      //  Java. Complete Reference (H. Shildt)
        printable = new Journal("Foreign Policy");
        printable.print();      // Foreign Policy

        //Ошибка - мы не можем напрямую создавать объекты интерфейсов
//        Printable pr = new Printable();
//        pr.print();
//
    }

}
