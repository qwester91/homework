package Home_work3.calcs.simple;

public class CalculatorWithMathCopy {
    /**
     * находит сумму двух чисел. Оба числа double
     * @param arg1 первое слагаемое
     * @param arg2 второе слагаемое
     * @return  возвращает результат сложения.
     */
    public double add (double arg1, double arg2){
        double result = arg1 + arg2;
        return result;
    }

    /**
     * находит разность двух чисел. Оба числа double
     * @param arg1 уменьшаемое значение
     * @param arg2 вычитаемое значение
     * @return  возвращает результат вычитания второго аргумента из первого.
     */
    public double deduct (double arg1, double arg2){
        double result = arg1 - arg2;
        return result;
    }

    /**
     * находит произведение двух чисел. Оба числа double
     * @param arg1 первый множитель
     * @param arg2 второй множитель
     * @return  возвращает результат умножения.
     */
    public double multiply (double arg1, double arg2){
        double result = arg1 * arg2;
        return result;
    }

    /**
     * находит частное двух чисел. Оба числа double
     * @param arg1 делимое
     * @param arg2 делитель
     * @return  возвращает результат деления первого аргумента на второго.
     */
    public double divide (double arg1, double arg2){
        double result = arg1 / arg2;
        return result;
    }


    /**
     * Возводим в степень. если основание отрицательное  -  ругается.
     * @param base основание (число которое возводим в степень)
     * @param exp степень (в которую возводим число)
     * @return  если все прошло хорошо, то возвращаем результат возведения в степень
     */
    public double exponentiation (double base, int exp){
        double result = 0;
        if (base < 0) {
            System.out.println("так  это не работает, возводим в степень только положительные числа!!");
            return result;
        }
       return  Math.pow(base, exp);
    }

    /**
     * возвращает модуль числа
     * @param x этого числа модуль возвращает
     * @return возвращает модуль числа
     */
    public double modul (double x){

            return Math.abs(x);

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

