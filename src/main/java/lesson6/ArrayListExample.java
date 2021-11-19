package lesson6;

import lesson_4.Cat;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args){
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);
        System.out.println("Список котов: " + cats);
        int thomasIndex = cats.indexOf(thomas);
        System.out.println("Индекс объекта thomas " + thomasIndex);
        System.out.println("Объект thomas " + cats.get(1));


        //C помощью метода contains можно узнать, содержится ли объект в коллекции
        System.out.println("До удаления объекта pushok " + cats.contains(pushok));
        cats.remove(pushok);
        System.out.println("После удаления объекта pushok " +cats.contains(pushok));

        //ArrayList позволяет вставлять данные не только в конец массива, но и в любую ячейку по индексу.
        //Для этого у него есть два метода:
        cats.set(0, philipp);
        System.out.println(cats); //кот с индексом 0 был заменен

        cats.add(0, thomas);
        System.out.println(cats); //в ячейку с индексом 0 добавлен thomas, остальные объекты сдвинулись на одну позицию
        //Получение размер массива
        System.out.println("Размер списка = " + cats.size());

        //Перебор списка
        for (int i= 0; i < cats.size(); i++){
            System.out.println(cats.get(i));
        }

        for (Cat cat : cats){
            System.out.println(cat);
        }

        //Очистка списка
        cats.clear();
        System.out.println(cats);
    }
}
