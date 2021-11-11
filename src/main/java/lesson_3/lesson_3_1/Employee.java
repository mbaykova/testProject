package lesson_3.lesson_3_1;

/*
класс Employee добавляет поле company,
которое хранит место работы сотрудника, а также метод work.
 */
public class Employee extends Person{

    private String company;


    /*
    Если в базовом классе определены конструкторы,
    то в конструкторе производного классы необходимо вызвать один из конструкторов
    базового класса с помощью ключевого слова super.
     */
    public Employee(String name, int age, String company) {
        super(name, age);
        this.company=company;
    }

    public void work(){
        System.out.printf("%s works in %s \n", getName(), company);
    }


    @Override
    public void displayName() {
        super.displayName();
        System.out.println("Employee name = " + getName() + "company = "+ company);
    }

    public static void main(String[] args) {
        Employee sam = new Employee("Sam", 25,"Microsoft");
        sam.displayName();  // Sam
        sam.work();     // Sam works in Microsoft

    }


}
