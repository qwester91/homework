package Home_work3.runners;
//6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе
// требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
// Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
import Home_work3.calcs.additional.CalculatorWithCounterAutoSuper;


public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();


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
        System.out.println("Количество использований калькулятора: " + calculator.getCountOperation());
    }

}
