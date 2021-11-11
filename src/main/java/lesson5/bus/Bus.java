package lesson5.bus;

import homework.Person;

import java.util.Arrays;

public class Bus {
    private int countSets;
    private int countPassengers;
    protected Person[] passengers;

    public Bus(int countSets){
        this.countSets = countSets;
        this.passengers = new Person[countSets];
    }

    public void addPassenger(Person person){
        System.out.println("Входит пассажир: " + person.getFullName());
        if (countPassengers < countSets){
            if (person.isHaveName()){
                passengers[countPassengers] = person;
                countPassengers++;
                if (countPassengers==1){
                    go();
                }
            }else {
                System.out.println("У пассажира нет имени!");
            }
            return;
        }
        System.out.println("Нет свободных мест");
    }

    public void deletePassenger(Person person){
        System.out.println("Выходит пассажир: " + person.getFullName());
        if (countPassengers!=0){
            for (int i = 0; i <passengers.length; i++){
                if (passengers[i].getFullName().equals(person.getFullName())
                        && passengers[i].getAge() == passengers[i].getAge()){
                    passengers[countPassengers] = null;
                    countPassengers--;
                    return;
                }
            }
            System.out.println("В автобусе не найден пассажир: " + person.getFullName());
        }else {
            System.out.println("В автобусе нет пассажиров");
        }

    }

    public void changeCountPassengers(Person[] newPassengers, Person[] exitPassengers){
        for (int i = 0; i < newPassengers.length; i++){
            addPassenger(newPassengers[i]);
        }
        for (int i = 0; i < exitPassengers.length; i++){
            deletePassenger(exitPassengers[i]);
        }
    }

    public void go(){
        System.out.println("Автобус отправляется в  путь. " +
                "В автобусе " + countPassengers + " пассажиров: " + Arrays.toString(passengers));
    }


}
