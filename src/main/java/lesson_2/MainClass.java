package lesson_2;

public class MainClass {

    public static void main(String[] args) {
        Car x5 = new Car("x5", ColorEnum.WHITE, 150);
        Car x6 = new Car("x6", 250);

        Cars cars = new Cars();
        cars.setCar(x5);
        cars.setCar(x6);

        System.out.println(cars.getCars(ColorEnum.BLACK).size());
    }
}
