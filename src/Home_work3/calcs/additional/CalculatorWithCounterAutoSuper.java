package Home_work3.calcs.additional;

import Home_work3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long countOperation = 0;

    public void incrementCountOperation (){
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }
    /**
     * находит сумму двух чисел. Оба числа double
     * @param arg1 первое слагаемое
     * @param arg2 второе слагаемое
     * @return  возвращает результат сложения.
     */
    public double add (double arg1, double arg2) {
        incrementCountOperation ();
        return super.add(arg1, arg2);
    }

    /**
     * находит разность двух чисел. Оба числа double
     * @param arg1 уменьшаемое значение
     * @param arg2 вычитаемое значение
     * @return  возвращает результат вычитания второго аргумента из первого.
     */
    public double deduct (double arg1, double arg2){
        incrementCountOperation ();
        return super.deduct(arg1, arg2);
    }

    /**
     * находит произведение двух чисел. Оба числа double
     * @param arg1 первый множитель
     * @param arg2 второй множитель
     * @return  возвращает результат умножения.
     */
    public double multiply (double arg1, double arg2){
        incrementCountOperation ();
        return super.multiply(arg1, arg2);
    }

    /**
     * находит частное двух чисел. Оба числа double
     * @param arg1 делимое
     * @param arg2 делитель
     * @return  возвращает результат деления первого аргумента на второго.
     */
    public double divide (double arg1, double arg2){
        incrementCountOperation ();
        return super.divide(arg1, arg2);
    }


    /**
     * Возводим в степень. если основание отрицательное  -  ругается.
     * @param base основание (число которое возводим в степень)
     * @param exp степень (в которую возводим число)
     * @return  если все прошло хорошо, то возвращаем результат возведения в степень
     */
    public double exponentiation (double base, int exp){

        incrementCountOperation();
       return super.exponentiation(base, exp);
    }

    /**
     * возвращает модуль числа
     * @param x этого числа модуль возвращает
     * @return возвращает модуль числа
     */
    public double modul (double x){
        incrementCountOperation();
        return super.modul(x);
    }

    /**
     * квадратный корень числа
     * @param q число, корень из которого нужно извлечь
     * @return результат извлечения корня
     */
    public double sqrt(double q){
        incrementCountOperation();
        return super.sqrt(q);
    }
}
