package lesson5.students;

/*
    Создайте пример наследования, реализуйте класс Student и класс Aspirant,
    аспирант отличается от студента наличием некой научной работы.
1) Класс Student содержит переменные: String firstName, lastName, group.
А также, double averageMark, содержащую среднюю оценку.
2) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
Если средняя оценка студента равна 5, то сумма 15000 руб, иначе 10000руб.
Переопределить этот метод в классе Aspirant.
Если средняя оценка аспиранта равна 5, то сумма 20000 руб, иначе 15000.
3) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
 Вызвать метод getScholarship() для каждого элемента массива.
 */
public class MainClass {

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Антон", "3АСУ-1ДС", 5),
                new Aspirant("Таня", "3АСУ-4ДС", 4, "Есть ли жизнь на Марсе?"),
                new Student("Петя", "3АСУ-5ДС", 3),
                new Aspirant("Даша", "3АСУ-2ДС", 5, "Научная работа"),
                new Student("Саша", "3АСУ-2ДС", 3)};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getScholarship());
        }
    }
}
