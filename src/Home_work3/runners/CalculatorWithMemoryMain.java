package Home_work3.runners;

import Home_work3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import Home_work3.calcs.additional.CalculatorWithMemory;
import Home_work3.calcs.api.ICalculator;
import Home_work3.calcs.simple.CalculatorWithMathCopy;
import Home_work3.calcs.simple.CalculatorWithMathExtends;
import Home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

       CalculatorWithMemory calculator1 = new CalculatorWithMemory();

        print(result(calculator1),"CalculatorWithMemory" , calculator1.getCountOperation() );
        System.out.println();


    }

    public static double result(CalculatorWithMemory calculator){
        calculator.divide(28,5);
        calculator.setMemory();
        calculator.exponentiation(calculator.getMemory(), 2);
        calculator.setMemory();
        calculator.add(calculator.getMemory(), calculator.multiply(15,7));
        calculator.setMemory();
        return calculator.add(calculator.getMemory(), 4.1);

    }

    public static void print(double result, String nameOfCalc, long getCount ){
        System.out.println("работаем с обьектом типа " + nameOfCalc);
        System.out.println("результат вычислений: " + result);
        System.out.println("Количество использований калькулятора: " + getCount);

    }
}
