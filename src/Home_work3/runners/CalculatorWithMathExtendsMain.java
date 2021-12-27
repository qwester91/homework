package Home_work3.runners;
//4.4 Создать класс CalculatorWithMathExtendsMain в котором будет точка входа (main метод). В main методе требуется
// создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
// Вывести в консоль результат.
import Home_work3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double result_a;
        double result_b;
        double result_c;
        double result_d;
        double result;

        result_a = calculator.divide(28,5);
        result_b = calculator.exponentiation(result_a,2);
        result_c = calculator.multiply(15,7);
        result_d = calculator.add(result_b,result_c);
        result = calculator.add(4.1,result_d);

        System.out.println("результат вычислений: " + result);
    }
}
