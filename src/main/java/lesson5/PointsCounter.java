package lesson5;


/*
    Создать метод	который рассчитывает сколько очков имеет команда  зная следующие данные:
Метод принимает	3 значения:	количество побед, ничьих и поражений
За каждую победу дается	3 очка, ничью - 1, очко и проигрыш 0

Создать метод, который определяет является ли поданный ему на  вход массив особым
который является таким если:
На каждом четном индексе находится четное число
На каждом нечетном индексе находится нечетное число
Метод должен возвращать true или false

 */
public class PointsCounter {

    public static int footballPoints(int win, int standoff, int fail){
        return win * 3 + standoff;
    }

    public static boolean isSpecialArray(int[] array){
        for(int i = 0; i < array.length; i++){
            if (i%2 == 0 && array[i]%2 !=0){
                return false;
            }
            if (i%2 != 0 && array[i]%2 ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(footballPoints(3,4,2));
        System.out.println(footballPoints(5,0,2));
        System.out.println(footballPoints(0,0,1));

        System.out.println(isSpecialArray(new int[] { 2, 7, 4, 9, 6, 1, 6, 3 }));
        System.out.println(isSpecialArray(new int[] { 2, 7, 9, 1, 6, 1, 6, 3 }));
        System.out.println(isSpecialArray(new int[] { 2, 7, 8, 5, 6, 1, 6, 3}));
    }
}
