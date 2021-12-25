package Home_work3.runners;

import Home_work3.calcs.additional.CalculatorWithCounterAutoComposite;
import Home_work3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import Home_work3.calcs.api.ICalculator;
import Home_work3.calcs.simple.CalculatorWithMathCopy;
import Home_work3.calcs.simple.CalculatorWithMathExtends;
import Home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoCompositeInterface calculator1 = new CalculatorWithCounterAutoCompositeInterface
                (new CalculatorWithOperator());

        CalculatorWithCounterAutoCompositeInterface calculator2 = new CalculatorWithCounterAutoCompositeInterface
                (new CalculatorWithMathCopy());

        CalculatorWithCounterAutoCompositeInterface calculator3 = new CalculatorWithCounterAutoCompositeInterface
                (new CalculatorWithMathExtends());



        System.out.println("работаем с обьектом типа CalculatorWithOperator");
        System.out.println("результат вычислений: " + result(calculator1));
        System.out.println("Количество использований калькулятора: " + calculator1.getCountOperation());
        System.out.println();

        System.out.println("работаем с обьектом типа CalculatorWithMathCopy");
        System.out.println("результат вычислений: " + result(calculator2));
        System.out.println("Количество использований калькулятора: " + calculator2.getCountOperation());
        System.out.println();

        System.out.println("работаем с обьектом типа CalculatorWithMathExtends");
        System.out.println("результат вычислений: " + result(calculator3));
        System.out.println("Количество использований калькулятора: " + calculator3.getCountOperation());
    }

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
}
