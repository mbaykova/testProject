package homework.figure;

public class Triangle extends Figure implements Drawable{

    public Triangle(double height, double length) {
        super(height, length);
    }

    @Override
    public double calculateSquare() {
        return 0.5 * length * height;
    }

    @Override
    public void draw() {
        String info = String.format("Треугольник: height = %s см; length = %s см; square = %s см2",
                height, length, calculateSquare());
        System.out.println(info);
    }
}
