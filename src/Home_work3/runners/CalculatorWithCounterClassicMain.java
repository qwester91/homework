package Home_work3.runners;
import Home_work3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double result_a;
        double result_b;
        double result_c;
        double result_d;
        double result;

        result_a = calculator.divide(28,5);
        calculator.incrementCountOperation();
        result_b = calculator.exponentiation(result_a,2);
        calculator.incrementCountOperation();
        result_c = calculator.multiply(15,7);
        calculator.incrementCountOperation();
        result_d = calculator.add(result_b,result_c);
        calculator.incrementCountOperation();
        result = calculator.add(4.1,result_d);
        calculator.incrementCountOperation();

        System.out.println("результат вычислений: " + result);
        System.out.println("Количество использований калькулятора: " + calculator.getCountOperation());


        System.out.println(calculator.add(4.1, calculator.add(calculator.multiply(15,7), calculator.exponentiation(calculator.divide(28,5),2 ) )));
    }
}
