package lesson_1;

public class SwitchExample {


    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        }

        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else {
            System.out.println("Первое число меньше второго");
        }


        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else if (num1 < num2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }

        if(num1 > num2 && num1>7){
            System.out.println("Первое число больше второго и больше 7");
        }


        int num = 8;
        switch(num){

            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }


    }
}
