package Home_work3.calcs.additional;
//6. Создать класс CalculatorWithCounterAutoSuper.
//	6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
//	6.2 Данный класс наследует класс CalculatorWithMathExtends.
//	6.3 Данный класс переопределяет все методы полученные в результате наследования и в этих методах должен быть
//	реализован механизм учёта их использования (учёт общий для всех методов класса), а вместо реализации математики
//	при помощи ключевого слова super вызывает данный метод у родителя. Например вызвали метод plus(7, 3) который должен
//	сложить два числа и вернуть результат сложения. Внутри метода plus() пишем реализацию учета, а после делаем вызов
//	super.plus(7, 3). Использование super позволит вызвать реализацию из родительского класса.
//	6.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
//	калькулятора. При вызове данного метода счётчик учёта не увеличивается.

import Home_work3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long countOperation = 0; // счетчик вызова метода incrementCountOperation

    /**
     * метод увличивает счетчик countOperation
     */
    public void incrementCountOperation (){
        countOperation++;
    }

    /**
     * геттер для countOperation
     * @return значение countOperation
     */
    public long getCountOperation() {
        return countOperation;
    }


    /**
     * находит сумму двух чисел. Оба числа double
     * увеличивает счетчик использования калькулятора на 1
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
     * увеличивает счетчик использования калькулятора на 1
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
     * увеличивает счетчик использования калькулятора на 1
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
     * увеличивает счетчик использования калькулятора на 1
     * @param arg1 делимое
     * @param arg2 делитель
     * @return  возвращает результат деления первого аргумента на второго.
     */
    public double divide (double arg1, double arg2){
        incrementCountOperation ();
        return super.divide(arg1, arg2);
    }


    /**
     * Возводим в степень.
     * увеличивает счетчик использования калькулятора на 1
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
     * увеличивает счетчик использования калькулятора на 1
     * @param x этого числа модуль возвращает
     * @return возвращает модуль числа
     */
    public double modul (double x){
        incrementCountOperation();
        return super.modul(x);
    }

    /**
     * квадратный корень числа
     * увеличивает счетчик использования калькулятора на 1
     * @param q число, корень из которого нужно извлечь
     * @return результат извлечения корня
     */
    public double sqrt(double q){
        incrementCountOperation();
        return super.sqrt(q);
    }
}
