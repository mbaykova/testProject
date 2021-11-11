package lesson_3.lesson_3_2;



public  class Program2 {


    public static void main(String[] args) {
        //Преобразование типов - Восходящее преобразование , от подкласса к супер классу,
        // происходит автоматически
        Object tom = new Employee("Tom", "Oracle");
        Object kate = new Client("Kate", "DeutscheBank");
        Person fred = new Client("Fred", "DeutscheBank");
        Person alice = new Employee("Alice", "Google");

        /*
        Обратное не всегда верно. Например, объект Person не всегда является объектом Employee или Client.
        Поэтому нисходящее преобразование от суперкласса к подклассу автоматически не выполняется.
        В этом случае нам надо использовать операцию преобразования типов.
         */

        Object harry = new Employee("Harry", "Oracle");

// нисходящее преобразование от Object к типу Employee
        Employee emp = (Employee)harry;
        emp.display();
        System.out.println(emp.getName());

        Object kate1 = new Client("Kate", "DeutscheBank");
        ((Person)kate1).display();

        Object sam1 = new Employee("Sam", "Oracle");
        ((Employee)sam1).display();


        //Ошибка при приведении типов
        Object kate2 = new Client("Kate", "DeutscheBank");
        Employee emp2 = (Employee) kate2;
        emp2.display();
    }
}
