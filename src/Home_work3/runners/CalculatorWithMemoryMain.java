package Home_work3.runners;
//10.6 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется создать
// экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
// Вывести в консоль результат. В мэйне запрещается использование переменных для хранения значений участвующих в
// просчёте, а также результатов работы методов калькулятора, можно использовать только литералы и метод получения из
// памяти записанного значения.

import Home_work3.calcs.additional.CalculatorWithMemory;
import Home_work3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

       CalculatorWithMemory calculator1 = new CalculatorWithMemory(new CalculatorWithMathCopy());

        print(result(calculator1),"CalculatorWithMathCopy" , calculator1.getCountOperation() );
        System.out.println();


    }

    /**
     * метод считает математику, возможно тут нет смысла выносить это в отдельный метод, но привычка.
     * @param calculator обект CalculatorWithMemory
     * @return результат вычислений
     */
    public static double result(CalculatorWithMemory calculator){
        calculator.divide(28,5);
        calculator.setMemory();
        calculator.exponentiation(calculator.getMemory(), 2);
        calculator.setMemory();
        calculator.add(calculator.getMemory(), calculator.multiply(15,7));
        calculator.setMemory();
        return calculator.add(calculator.getMemory(), 4.1);

    }

    /**
     * печатает в консоль. много раз повторять, поэтому в отдельном методе
     * @param result результат вычислений double
     * @param nameOfCalc  каким калькулятором считали String
     * @param getCount  счетчик использования калькулятора  long
     */
    public static void print(double result, String nameOfCalc, long getCount ){
        System.out.println("работаем с обьектом типа " + nameOfCalc);
        System.out.println("результат вычислений: " + result);
        System.out.println("Количество использований калькулятора: " + getCount);

    }
}
