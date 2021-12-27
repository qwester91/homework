package Home_work3.calcs.additional;
//9. Создать класс CalculatorWithCounterAutoAgregationInterface.
//	9.1 Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем что передал вам пользователь вашего класса.
//	9.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	9.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
//	9.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики другим калькуляторам переданным в конструктор
//	9.5 В классе должны присутствовать все методы объявленные в интерфейсе.
//	9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
//

import Home_work3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    ICalculator operator;       // поле типа ICalculator. Определяет чем будем считать
    long countOperation = 0;    // счетчик вызова методов калькулятора

    /**
     * конструктор CalculatorWithCounterAutoAgregationInterface, задает в поле калькулятор которым будем считать
     * @param operator обьект калькулятора , реализующего интерфейс ICalculator
     */
    public CalculatorWithCounterAutoAgregationInterface(ICalculator operator) {
        this.operator = operator;
    }




    /**
     * метод увеличивающий счетчик использования методов калькулятора
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
        return operator.add(arg1, arg2);
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
        return operator.deduct(arg1, arg2);
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
        return operator.multiply(arg1, arg2);
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
        return operator.divide(arg1, arg2);
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
        return operator.exponentiation(base, exp);
    }

    /**
     * возвращает модуль числа
     * увеличивает счетчик использования калькулятора на 1
     * @param x этого числа модуль возвращает
     * @return возвращает модуль числа
     */
    public double modul (double x){
        incrementCountOperation();
        return operator.modul(x);
    }

    /**
     * квадратный корень числа
     * увеличивает счетчик использования калькулятора на 1
     * @param q число, корень из которого нужно извлечь
     * @return результат извлечения корня
     */
    public double sqrt(double q){
        incrementCountOperation();
        return operator.sqrt(q);
    }
}
