package homework;

public class MainClass {

    public static void main(String args[]){
        Person anna = new Person();
        Person ivan = new Person("Иван", 20);
        Person harry = new Person("Гарри", 17);
        Person antony = new Person("Антон", 30);
        Person test = new Person("", 30);
        anna.talk();
        ivan.talk();
        antony.talk();
        test.talk();
        harry.talk();
    }
}
