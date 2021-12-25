package Home_work3.runners;

import Home_work3.calcs.additional.CalculatorWithCounterAutoComposite;
import Home_work3.calcs.simple.CalculatorWithMathCopy;
import Home_work3.calcs.simple.CalculatorWithMathExtends;
import Home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        CalculatorWithMathCopy calculator1 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculator2 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoComposite calculatorAuto1 = new CalculatorWithCounterAutoComposite(calculator);
        CalculatorWithCounterAutoComposite calculatorAuto2 = new CalculatorWithCounterAutoComposite(calculator1);
        CalculatorWithCounterAutoComposite calculatorAuto3 = new CalculatorWithCounterAutoComposite(calculator2);



        System.out.println("работаем с обьектом типа CalculatorWithOperator");
        System.out.println("результат вычислений: " + result(calculatorAuto1));
        System.out.println("Количество использований калькулятора: " + calculatorAuto1.getCountOperation());
        System.out.println();

        System.out.println("работаем с обьектом типа CalculatorWithMathCopy");
        System.out.println("результат вычислений: " + result(calculatorAuto2));
        System.out.println("Количество использований калькулятора: " + calculatorAuto2.getCountOperation());
        System.out.println();

        System.out.println("работаем с обьектом типа CalculatorWithMathExtends");
        System.out.println("результат вычислений: " + result(calculatorAuto3));
        System.out.println("Количество использований калькулятора: " + calculatorAuto3.getCountOperation());
    }

    public static double result(CalculatorWithCounterAutoComposite calculator){
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
