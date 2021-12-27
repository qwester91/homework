package Home_work3.calcs.additional;
//5. Создать класс CalculatorWithCounterClassic.
//	5.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	5.2 Данный класс должен наследовать класс CalculatorWithMathExtends.
//	5.3 В классе должен быть метод void incrementCountOperation() который должен увеличивать внутренний счётчик (поле) в калькуляторе.
//	5.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора (поле).

import Home_work3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
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
}
