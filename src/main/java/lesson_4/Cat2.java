package lesson_4;

public class Cat2 {
    private double weight = 3000.0;;
    private String name;
    private String color;

    {
        System.out.println("Блок инициализации");
        name = "Безымянная";
        color = "Черный";
    }

    public Cat2() {
        System.out.println("Конструктор без параметров");
    }

    public Cat2(String name, String color, double weight)    {
        System.out.println("Конструктор с параметрами");
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
    public void info(){
        System.out.println(String.format("name = [%s], color = [%s], " +
                "weight = [%s]", name, color, weight));
    }
}


