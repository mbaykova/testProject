package lesson_4;

public class Cat {
    private double weight = 3000.0;;
    private String name;
    private String color = "Черный";

    public Cat() {
        name = "Безымянная";
    }

    public Cat(String name)    {
        this.name = name;
    }
    public Cat(String name, String color, double weight)    {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
    public void info(){
        System.out.println(String.format("name = [%s], color = [%s], " +
                "weight = [%s]", name, color, weight));
    }

    @Override
    public String toString(){
        return String.format("name = [%s]", name);
    }
}


