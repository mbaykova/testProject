package lesson_3.lesson_3_1;

public class Person {

    private String name;
    private int age;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age < 0){
           System.out.println("Возраст должен быть больше 0");
           System.exit(0);
        }
        this.age = age;
    }
    public void displayName(){
        System.out.printf("Name: %s \n", name);
    }
    void displayAge(){
        System.out.printf("Age: %d \n", age);
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Person))
            return false;

        Person p = (Person)obj;
        return this.name.equals(p.name) && (this.age == ((Person) obj).age);
    }

}
