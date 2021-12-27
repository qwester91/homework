package Home_work3.runners;
//7.7 Создать класс CalculatorWithCounterDelegateMain в котором будет точка входа (main метод).
// В main методе требуется создать экземпляры калькуляторов созданных из классов из этого задания и используя методы
// из экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат
// метода getCountOperation().

import Home_work3.calcs.additional.CalculatorWithCounterAutoAgregation;
import Home_work3.calcs.additional.CalculatorWithCounterAutoComposite;
import Home_work3.calcs.simple.CalculatorWithMathCopy;
import Home_work3.calcs.simple.CalculatorWithMathExtends;
import Home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calculatorComposite = new CalculatorWithCounterAutoComposite();
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        CalculatorWithMathCopy calculator1 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculator2 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAgregation calculatorAuto1 = new CalculatorWithCounterAutoAgregation(calculator);
        CalculatorWithCounterAutoAgregation calculatorAuto2 = new CalculatorWithCounterAutoAgregation(calculator1);
        CalculatorWithCounterAutoAgregation calculatorAuto3 = new CalculatorWithCounterAutoAgregation(calculator2);

        print(result(calculatorComposite),"CalculatorWithMathExtends with composition",
                calculatorComposite.getCountOperation() );
        System.out.println();

        print(result(calculatorAuto1),"CalculatorWithOperator with aggregation" ,
                calculatorAuto1.getCountOperation() );
        System.out.println();

        print(result(calculatorAuto2),"CalculatorWithMathCopy with aggregation",
                calculatorAuto2.getCountOperation() );
        System.out.println();

        print(result(calculatorAuto3),"CalculatorWithMathExtends with aggregation",
                calculatorAuto3.getCountOperation() );
    }

    /**
     * Метод считает математику калькулятором CalculatorWithCounterAutoComposite
     * @param calculator обьект типа CalculatorWithCounterAutoComposite
     * @return результат вычисления выражения из задания 1 (double)
     */
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

    /**
     * Метод считает математику калькулятором CalculatorWithCounterAutoAgregation
     * @param calculator обьект типа CalculatorWithCounterAutoAgregation с переданным в него калькулятором из пакета simple
     * @return результат вычисления выражения из задания 1 (double)
     */
    public static double result(CalculatorWithCounterAutoAgregation calculator){
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
        System.out.println("работаем калькулятором типа " + nameOfCalc);
        System.out.println("результат вычислений: " + result);
        System.out.println("Количество использований калькулятора: " + getCount);

    }
}
