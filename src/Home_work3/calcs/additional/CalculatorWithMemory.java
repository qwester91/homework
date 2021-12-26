package Home_work3.calcs.additional;

import Home_work3.calcs.api.ICalculator;

public class CalculatorWithMemory extends CalculatorWithCounterClassic {
   private double memory;
   private double memoryUtil;





    long countOperation = 0;

    public double helpGetMemory() {
        return memory;
    }

    public void setMemory() {
        memory = memoryUtil;
    }
    public double getMemory(){
        double helper = helpGetMemory();
        this.memory = 0;
        return helper;
    }

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
        double result = super.add(arg1, arg2);
        memoryUtil = result;
        return result;
    }

    /**
     * находит разность двух чисел. Оба числа double
     * @param arg1 уменьшаемое значение
     * @param arg2 вычитаемое значение
     * @return  возвращает результат вычитания второго аргумента из первого.
     */
    public double deduct (double arg1, double arg2){
        incrementCountOperation ();
        double result = super.deduct(arg1, arg2);
        memoryUtil = result;
        return result;
    }

    /**
     * находит произведение двух чисел. Оба числа double
     * @param arg1 первый множитель
     * @param arg2 второй множитель
     * @return  возвращает результат умножения.
     */
    public double multiply (double arg1, double arg2){
        incrementCountOperation ();
        double result = super.multiply(arg1, arg2);
        memoryUtil = result;
        return result;
    }

    /**
     * находит частное двух чисел. Оба числа double
     * @param arg1 делимое
     * @param arg2 делитель
     * @return  возвращает результат деления первого аргумента на второго.
     */
    public double divide (double arg1, double arg2){
        incrementCountOperation ();
        double result = super.divide(arg1, arg2);
        memoryUtil = result;
        return result;
    }


    /**
     * Возводим в степень. если основание отрицательное  -  ругается.
     * @param base основание (число которое возводим в степень)
     * @param exp степень (в которую возводим число)
     * @return  если все прошло хорошо, то возвращаем результат возведения в степень
     */
    public double exponentiation (double base, int exp){
        incrementCountOperation();
        double result = super.exponentiation(base, exp);
        memoryUtil = result;
        return result;
    }

    /**
     * возвращает модуль числа
     * @param x этого числа модуль возвращает
     * @return возвращает модуль числа
     */
    public double modul (double x){
        incrementCountOperation();
        double result = super.modul(x);
        memoryUtil = result;
        return result;
    }

    /**
     * квадратный корень числа
     * @param q число, корень из которого нужно извлечь
     * @return результат извлечения корня
     */
    public double sqrt(double q){
        incrementCountOperation();
        double result = super.sqrt(q);
        memoryUtil = result;
        return result;
    }
}
