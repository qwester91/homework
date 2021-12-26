package Home_work3.runners;

import Home_work2.utils.SortsUtils;
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



        print(result(calculator1),"CalculatorWithOperator" , calculator1.getCountOperation() );
        System.out.println();

        print(result(calculator2),"CalculatorWithMathCopy",calculator2.getCountOperation() );
        System.out.println();

        print(result(calculator3),"CalculatorWithMathExtends",calculator3.getCountOperation() );


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

    public static void print(double result, String nameOfCalc, long getCount ){
        System.out.println("работаем с обьектом типа " + nameOfCalc);
        System.out.println("результат вычислений: " + result);
        System.out.println("Количество использований калькулятора: " + getCount);

    }
}
