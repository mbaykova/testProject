package homework;

/*
    1. Создать класс Person, который содержит
    Поля:  String fullName,  int age
    Два конструктора Person() и Person(fullName, age)
    Метод talk, который выводит в консоль
    Ничего,	если имя и возраст не заданы
    "Привет	я {имя} и мне {возраст} лет" , если имя и возраст заданы
    В методе main создать объекты и вызвать для них метод talk

    2. Преобразовать класс Person
    Добавить поле - int id, у первого созданного объекта оно равно 0, затем у каждого нового объекта увеличивается на 1
    Реализовать метод count, который выводит количество созданных объектов
    В метод talk добавить условие: если id == 2, то выводить:
    "Привет	я, {имя}, избранный!"

 */
public class Person {
    private String fullName;
    private int age;
    private int id;
    private static int countObject = 0;

    public Person(){
        countObject++;
        count();
    }

    public Person(String fullName, int age){
        this.age = age;
        this.fullName = fullName;
        this.id = countObject++;
        count();
    }

    public void talk(){
        if (fullName!=null && !fullName.equals("") && age!=0){
            if (id == 2){
                System.out.printf("Привет! я, {%s}, избранный!%n", fullName);
            }else {
                System.out.printf("Привет! я {%s} и мне {%s} лет%n", fullName, age);
            }
        }

    }

    public boolean isHaveName(){
        return fullName!=null && !fullName.equals("");
    }

    public static void count(){
        System.out.printf("Создано %s объектов%n", countObject);
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public String toString(){
        return fullName;
    }

}
