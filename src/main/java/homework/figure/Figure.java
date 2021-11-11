package homework.figure;

public abstract class Figure {
    protected double height; //высота
    protected double length; //длина стороны
    protected double square;

    public Figure(double height, double length){
        this.height = height;
        this.length = length;
    }

    public abstract double calculateSquare();
}
