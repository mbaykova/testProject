package lesson6;

import java.util.*;

public class SetExample {

    public static void main(String args[]){
        HashSet<String> names = new HashSet<>();
        names.add("Лидия Аркадьевна Бубликова");
        names.add("Иван Михайлович Серебряков");
        names.add("Дональд Джон Трамп");
        names.add("Дональд Джон Трамп");
        names.add("Дональд Джон Трамп");
        System.out.println(names);


    }
}
