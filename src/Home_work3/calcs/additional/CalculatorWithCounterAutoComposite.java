package Home_work3.calcs.additional;

import Home_work3.calcs.simple.CalculatorWithMathCopy;
import Home_work3.calcs.simple.CalculatorWithMathExtends;
import Home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    CalculatorWithOperator operator;
    CalculatorWithMathCopy operator1;
    CalculatorWithMathExtends operator2;


    public CalculatorWithCounterAutoComposite (CalculatorWithOperator operator) {
        this.operator = operator;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathCopy operator) {
        this.operator1 = operator;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathExtends operator) {
        this.operator2 = operator;
    }
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
    public double add (double arg1,double arg2 ) {
        incrementCountOperation ();
        if (operator!= null) {
            return operator.add(arg1, arg2);
        }else if (operator1!= null) {
            return operator1.add(arg1, arg2);
        }else if (operator2!= null) {
            return operator2.add(arg1, arg2);
        }else {
        return 0;
        }
    }

    /**
     * находит разность двух чисел. Оба числа double
     * @param arg1 уменьшаемое значение
     * @param arg2 вычитаемое значение
     * @return  возвращает результат вычитания второго аргумента из первого.
     */
    public double deduct (double arg1, double arg2){
        incrementCountOperation ();
        if (operator!= null) {
            return operator.deduct(arg1, arg2);
        }else if (operator1!= null) {
            return operator1.deduct(arg1, arg2);
        }else if (operator2!= null) {
            return operator2.deduct(arg1, arg2);
        }else {
            return 0;
        }
    }

    /**
     * находит произведение двух чисел. Оба числа double
     * @param arg1 первый множитель
     * @param arg2 второй множитель
     * @return  возвращает результат умножения.
     */
    public double multiply (double arg1, double arg2){
        incrementCountOperation ();
        if (operator!= null) {
            return operator.multiply(arg1, arg2);
        }else if (operator1!= null) {
            return operator1.multiply(arg1, arg2);
        }else if (operator2!= null) {
            return operator2.multiply(arg1, arg2);
        }else {
            return 0;
        }
    }

    /**
     * находит частное двух чисел. Оба числа double
     * @param arg1 делимое
     * @param arg2 делитель
     * @return  возвращает результат деления первого аргумента на второго.
     */
    public double divide (double arg1, double arg2){
        incrementCountOperation ();
        if (operator!= null) {
            return operator.divide(arg1, arg2);
        }else if (operator1!= null) {
            return operator1.divide(arg1, arg2);
        }else if (operator2!= null) {
            return operator2.divide(arg1, arg2);
        }else {
            return 0;
        }
    }


    /**
     * Возводим в степень. если основание отрицательное  -  ругается.
     * @param base основание (число которое возводим в степень)
     * @param exp степень (в которую возводим число)
     * @return  если все прошло хорошо, то возвращаем результат возведения в степень
     */
    public double exponentiation (double base, int exp){
        incrementCountOperation ();
        if (operator!= null) {
            return operator.exponentiation(base, exp);
        }else if (operator1!= null) {
            return operator1.exponentiation(base, exp);
        }else if (operator2!= null) {
            return operator2.exponentiation(base, exp);
        }else {
            return 0;
        }
    }

    /**
     * возвращает модуль числа
     * @param x этого числа модуль возвращает
     * @return возвращает модуль числа
     */
    public double modul (double x){
        incrementCountOperation();
        if (operator!= null) {
            return operator.modul(x);
        }else if (operator1!= null) {
            return operator1.modul(x);
        }else if (operator2!= null) {
            return operator2.modul(x);
        }else {
            return 0;
        }
    }

    /**
     * квадратный корень числа
     * @param q число, корень из которого нужно извлечь
     * @return результат извлечения корня
     */
    public double sqrt(double q){
        incrementCountOperation();
        if (operator!= null) {
            return operator.sqrt(q);
        }else if (operator1!= null) {
            return operator1.sqrt(q);
        }else if (operator2!= null) {
            return operator2.sqrt(q);
        }else {
            return 0;
        }
    }
}
