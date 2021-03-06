package homework.figure;

/*
    1. Создать абстрактный класс, который описывает геометрическую  фигуру и имеет:
    protected поля
    Длина фигуры (см)
    Высота фигуры (см)
    Площадь фигуры (см)
    Конструктор с первыми двумя полями
    Абстрактный метод для расчета площади фигуры

    Создать подклассы треугольник, квадрат и ромб, которые могут работать с этими полями и методами
    Создать объекты, чтобы использовать весь этот функционал в методе main().

    2. Создать интерфейс Drawable, который означает, что человек сможет нарисовать фигуру, который имеет методы:
    draw - вывести информацию о нарисованной фигуре

    Реализовать интерфейс в классах треугольника и квадрата и все его  недефолтные методы.
    Создать объекты, чтобы использовать весь этот функционал в методе main()

 */
public class MainClass {

    public static void main(String args[]){
        Drawable triangle = new Triangle(3, 4);
        Drawable square = new Square(5, 5);
        triangle.draw();
        square.draw();

    }
}
