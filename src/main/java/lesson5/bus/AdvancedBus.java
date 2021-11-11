package lesson5.bus;

/*
Усовершенствовать предыдущий класс
    Создать поля для хранения данных
        Оставшееся топливо в бензобаке (в литрах)
        Базовый расход топлива	(литров на км)
        Включен ли кондиционер
    Создать метод, который рассчитывает максимальную дистанцию, которую возможно проехать, учитывая что
    Каждый пассажир увеличивает базовый расход топлива на 5%
    Включенный кондиционер увеличивает общий расход	(после расчета на пассажиров) топлива на 10%

 */
public class AdvancedBus extends Bus{

    private double petrol;
    private double rate;
    private boolean isCondition;


    public AdvancedBus(int countSets, int petrol, int rate) {
        super(countSets);
        this.petrol = petrol;
        this.rate = rate;
    }

    public double calculateMaxDistance(){
        rate = rate *(1 +(0.05 * passengers.length));
        if (isCondition){
            rate = rate * 1.1;
        }
        return petrol/rate;
    }

    public boolean isCondition() {
        return isCondition;
    }

    public void setCondition(boolean condition) {
        isCondition = condition;
    }
}
