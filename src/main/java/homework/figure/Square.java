package homework.figure;

public class Square extends Figure implements Drawable{

    public Square(double height, double length) {
        super(height, length);
    }

    @Override
    public double calculateSquare() {
        return length * height;
    }

    @Override
    public void draw() {
        String info = String.format("Квадрат: height = %s см; length = %s см; square = %s см2",
                height, length, calculateSquare());
        System.out.println(info);
    }
}
