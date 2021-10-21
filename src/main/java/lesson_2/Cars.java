package lesson_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private List<Car> cars = new ArrayList<>();

    public void setCar(Car car){
        cars.add(car);
    }

    public List<Car> getCars(){
        return cars;
    }

    public List<Car> getCars(ColorEnum color){
        return cars.stream()
                .filter(car -> car.getColor() == color)
                .collect(Collectors.toList());
    }
}
