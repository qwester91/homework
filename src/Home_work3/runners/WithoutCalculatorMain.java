package Home_work3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result_a;
        double result_b;
        double result_c;
        double result_d;
        double result;

        result_a = 28.0/5;
        result_b = result_a * result_a;
        result_c = 15 * 7;
        result_d = result_b + result_c;
        result = 4.1 + result_d;

        System.out.println("результат вычислений: " + result);
    }
}
