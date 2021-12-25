package Home_work3.calcs.simple;

import Home_work3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    /**
     * Возводим в степень. если основание отрицательное  -  ругается.
     * @param base основание (число которое возводим в степень)
     * @param exp степень (в которую возводим число)
     * @return  если все прошло хорошо, то возвращаем результат возведения в степень
     */
    public double exponentiation (double base, int exp){
        double result = 1;
        if (base < 0) {
            System.out.println("так  это не работает, возводим в степень только положительные числа!!");
            return result = 0;
        }

        if (exp == 0) {
            result = 1;
            return result;
        } else if (exp > 0) {
            for (int i = 0; i < exp; i++) {
                result *= base;
            }
            return result;

        }else if (exp < 0) {
            exp = -exp  ;
            for (int i = 0; i < exp; i++) {
                result *= base;
            }
            return (1/result);
        }
        return result = 0;

    }

    /**
     * возвращает модуль числа
     * @param x этого числа модуль возвращает
     * @return возвращает модуль числа
     */
    public double modul (double x){
        if (x < 0){
            x = -x;
            return x;
        }else {
            return x;
        }
    }

    /**
     * квадратный корень числа
     * @param q число, корень из которого нужно извлечь
     * @return результат извлечения корня
     */
    public double sqrt(double q){
        return Math.sqrt(q);
    }
}

