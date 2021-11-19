package lesson6;

import java.util.*;

public class Example {

    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("tessffst");
        list.add("353535");
        list.add("test3");
        list.add("test");
        list.add("test");
        list.add("tessffst");
        list.add("tessffst");
        list.add("tessffst");
        list.add("test");

        LinkedHashMap<String, Integer> resultMap2 = new LinkedHashMap<>();
        for (String el : list){
            if (!resultMap2.containsKey(el)){
                resultMap2.put(el, 1);
            }else {
                resultMap2.put(el, resultMap2.get(el) + 1);
            }
        }
        for (Map.Entry<String, Integer> row : resultMap2.entrySet()){
            if (row.getValue() == 1){
                System.out.println(row.getKey());
                break;
            }
        }
    }
}
