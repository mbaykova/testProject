package lesson6;

import java.util.*;

public class MapExample {

    public static void main(String args[]){
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        System.out.println(passportsAndNames);

        passportsAndNames.put(162348, "Виктор Михайлович Стычкин");//повторный ключ
        System.out.println(passportsAndNames);

//        //Получение и удаление элементов возможно только по ключу
//        // Номерных индексов, как в массивах или списках, в HashMap нет
//        // — доступ к значению осуществляется по ключу.
//        String lidiaName = passportsAndNames.get(212133);
//        System.out.println(lidiaName);
//
//        passportsAndNames.remove(162348);
//        System.out.println(passportsAndNames);
//
//        //Проверка наличия ключа и значения
//        System.out.println(passportsAndNames.containsKey(11111));
//        System.out.println(passportsAndNames.containsValue("Дональд Джон"));
//
        //Получения списка всех ключей и значений
        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Ключи: " + keys);
//
//        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
//        System.out.println("Значения: " + values);

        //Объединение двух map в одну
        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();
        passportsAndNames2.put(917352, "Алексей Андреевич Ермаков");
        passportsAndNames2.put(925648, "Максим Олегович Архаров");
        passportsAndNames.putAll(passportsAndNames2);
        System.out.println(passportsAndNames);

        //Перебор HashMap в цикле
        for (Map.Entry entry: passportsAndNames.entrySet()) {
            System.out.println(entry);
        }

        for (Integer key : passportsAndNames.keySet()) {
            System.out.println(key);
        }

        for (String value : passportsAndNames.values()) {
            System.out.println(value);
        }

        //LinkedHashMap
        passportsAndNames.clear();
        LinkedHashMap<Integer, String> linkedPassportsAndNames = new LinkedHashMap<>();
        linkedPassportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        linkedPassportsAndNames.put(162348, "Иван Михайлович Серебряков");
        linkedPassportsAndNames.put(8082771, "Дональд Джон Трамп");

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        System.out.println(passportsAndNames);
        System.out.println(linkedPassportsAndNames);

    }
}
