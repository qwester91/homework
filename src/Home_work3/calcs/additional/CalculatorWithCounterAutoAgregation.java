package Home_work3.calcs.additional;
//7. Создать класс CalculatorWithCounterAutoComposite и CalculatorWithCounterAutoAgregation.
//	7.0 Изучить композицию, агрегацию и делегирование:
//
//	7.1 Все методы объявленные в данных классах НЕ статические (не имеют модификатор static).
//	7.2 Внутри класса CalculatorWithCounterAutoComposite мы должны создавать поле хранящее объект класса калькулятор и
//	инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора.
//	7.3 Внутри класса CalculatorWithCounterAutoAgregation нельзя создавать объекты (использовать new), можно
//	пользоваться только тем что передал вам другой программист при использовании вашего класса в конструктор.
//		7.3.1 В данном классе должны быть следующие варианты конструктора:
//			7.3.1.1 Принимающий объект типа CalculatorWithOperator
//			7.3.1.2 Принимающий объект типа CalculatorWithMathCopy
//			7.3.1.3 Принимающий объект типа CalculatorWithMathExtends
//	7.4 Данные классы напрямую не умеет считать математику, они умеет делегировать расчёт математики другим
//	калькуляторам которые сохранены в полях.
//	7.5 В классах должны присутствовать математические методы:
//		7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	7.6 В классах созданных в этом задании должен быть метод long getCountOperation() который должен возвращать
//	количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
//	7.7 Создать класс CalculatorWithCounterDelegateMain в котором будет точка входа (main метод). В main методе
//	требуется создать экземпляры калькуляторов созданных из классов из этого задания и используя методы из экземпляра
//	посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода
//	getCountOperation().

import Home_work3.calcs.simple.CalculatorWithMathCopy;
import Home_work3.calcs.simple.CalculatorWithMathExtends;
import Home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    CalculatorWithOperator operator;            // поле типа CalculatorWithOperator
    CalculatorWithMathCopy operator1;            // поле типа  CalculatorWithMathCopy
    CalculatorWithMathExtends operator2;            // поле типа CalculatorWithMathExtends
    long countOperation = 0;                // счетчик вызова методов калькулятора

    /**
     * конструктор CalculatorWithCounterAutoAgregation
     * @param operator - обьект типа CalculatorWithOperator
     *                 присваивает его в поле operator
     */
    public CalculatorWithCounterAutoAgregation (CalculatorWithOperator operator) {
        this.operator = operator;
    }


    /**
     * конструктор CalculatorWithCounterAutoAgregation
     * @param operator - обьект типа CalculatorWithMathCopy
     *                 присваивает его в поле operator1
     */
    public CalculatorWithCounterAutoAgregation (CalculatorWithMathCopy operator) {
        this.operator1 = operator;
    }


    /**
     * конструктор CalculatorWithCounterAutoAgregation
     * @param operator - обьект типа CalculatorWithMathExtends
     *                 присваивает его в поле operator2
     */
    public CalculatorWithCounterAutoAgregation (CalculatorWithMathExtends operator) {
        this.operator2 = operator;
    }


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
     * увеличивает счетчик использования калькулятора на 1
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
     * увеличивает счетчик использования калькулятора на 1
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
     * увеличивает счетчик использования калькулятора на 1
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
     * Возводим в степень.
     * увеличивает счетчик использования калькулятора на 1
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
     * увеличивает счетчик использования калькулятора на 1
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
     * увеличивает счетчик использования калькулятора на 1
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
