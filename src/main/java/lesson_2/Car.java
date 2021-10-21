package lesson_2;

public class Car {
    private String model;
    private ColorEnum color = ColorEnum.YELlOW;
    private int speed;
    private int wheels = 4;

    public Car(String model, int speed){
        this.model = model;
        this.speed = speed;
    }

    public Car(String model, ColorEnum color, int speed){
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public void setWheels(int value){
        wheels = value;
    }

    public int getWheels(){
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 500){
            System.err.println("Скорость выше возможной");
            return;
        }
        this.speed = speed;
    }
}
