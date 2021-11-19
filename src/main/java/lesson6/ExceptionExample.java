package lesson6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionExample {


    public static void main(String args[])  {

//        // Обработка проверяемого исключения
        try {
            Path testFile1 = Files.createFile(Paths.get("testFile114.txt"));
            System.out.println("Был ли файл успешно создан?");
            System.out.println(Files.exists(testFile1));
//          //  List<String> tests = Files.readAllLines(Paths.get("testFile112.txt"));
        } catch (IOException e) {
            System.out.println("Новый файл не создан, так как есть файл с таким именем");
            e.printStackTrace();
        }finally {
            System.out.println("выполняется всегда!");
        }
        System.out.println("Продолжаем выполнение");

        int num[] = {1, 2, 3, 4};
        try {
            System.out.println(num[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за границу массива");
        }



        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    private static void createFile(Path path) throws IOException {
        Files.createFile(path);
    }

    void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }

}
