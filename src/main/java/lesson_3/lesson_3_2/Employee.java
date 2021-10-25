package lesson_3.lesson_3_2;


public class Employee extends Person {

    private String bank;

    public Employee(String name, String company) {
        super(name);
        this.bank = company;
    }

    public void display(){
        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }

}
