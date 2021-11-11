package homework;

/*
    Создать метод, который определяет, является ли среднее  арифметическое,
    поданных ему на вход чисел целым числом.
    Метод должен возвращать true или false.

 */
public class HomeWork2_1 {

    public static void main(String args[]) {
        System.out.println(isAvgWhole(new int[] { 1, 3 }));
        System.out.println(isAvgWhole(new int[] { 1, 2, 3, 4 }));
        System.out.println(isAvgWhole(new int[] { 1, 5, 6 }));
        System.out.println(isAvgWhole(new int[] { 1, 1, 1 }));
        System.out.println(isAvgWhole(new int[] { 9, 2, 2, 5 }));
    }

    public static boolean isAvgWhole(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum % array.length == 0;
    }
}
