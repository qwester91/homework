package Home_work3.runners;
//Создать класс WithoutCalculatorMain в котором необходимо посчитать следующие выражения:
//	1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result_a;
        double result_b;
        double result_c;
        double result_d;
        double result;

        result_a = 28.0/5;                      //5.6
        result_b = result_a * result_a;         //31.359999999999996
        result_c = 15 * 7;                      //105.0
        result_d = result_b + result_c;         //136.35999999999999
        result = 4.1 + result_d;                //140.45999999999998

        System.out.println("результат вычислений: " + result);
    }
}
