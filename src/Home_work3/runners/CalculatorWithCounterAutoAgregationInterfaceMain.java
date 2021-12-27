package Home_work3.runners;
//9.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
// В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения
// из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().

import Home_work3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import Home_work3.calcs.api.ICalculator;
import Home_work3.calcs.simple.CalculatorWithMathCopy;
import Home_work3.calcs.simple.CalculatorWithMathExtends;
import Home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregationInterfaceMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregationInterface calculator1 = new CalculatorWithCounterAutoAgregationInterface
                (new CalculatorWithOperator());

        CalculatorWithCounterAutoAgregationInterface calculator2 = new CalculatorWithCounterAutoAgregationInterface
                (new CalculatorWithMathCopy());

        CalculatorWithCounterAutoAgregationInterface calculator3 = new CalculatorWithCounterAutoAgregationInterface
                (new CalculatorWithMathExtends());



        print(result(calculator1),"CalculatorWithOperator" , calculator1.getCountOperation() );
        System.out.println();

        print(result(calculator2),"CalculatorWithMathCopy",calculator2.getCountOperation() );
        System.out.println();

        print(result(calculator3),"CalculatorWithMathExtends",calculator3.getCountOperation() );


    }

    /**
     * метод считает математику
     * @param calculator обект реализующий интерфейс ICalculator
     * @return результат вычислений
     */
    public static double result(ICalculator calculator){
        double result_a;
        double result_b;
        double result_c;
        double result_d;
        double result;

        result_a = calculator.divide(28,5);
        result_b = calculator.exponentiation(result_a,2);
        result_c = calculator.multiply(15,7);
        result_d = calculator.add(result_b,result_c);
      return  result = calculator.add(4.1,result_d);
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
