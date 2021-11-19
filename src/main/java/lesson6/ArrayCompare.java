package lesson6;

import java.util.Arrays;

public class ArrayCompare {

    public static void main(String args[]){
        //Сравнение массивов поэлементно
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean areEqual = true;

        for (int i = 0; i < 5; i++) {
            if (arr1[i] != arr2[i]) {
                areEqual = false;
                break;
            }
        }
        System.out.println("Результат сравнения arr1 и arr2: " + areEqual);

        //false - Потому что мы сравниваем arr1 и arr2, которые являются ссылками,
        //а не массивами. Переменные arr1 и arr2 ссылаются на разные
        //объекты в памяти.
        System.out.println("Результат сравнения arr1 и arr2 через оператор равенства: "
                + (arr1 == arr2));

        //false - вызывается метод equals из класса Object, который тоже сравнивает по ссылкам
        System.out.println("Результат сравнения arr1 и arr2 через equals " +
            (arr1.equals(arr2)));

        System.out.println("Результат сравнения arr1 и arr2: " + Arrays.equals(arr2,arr1));
    }
}
