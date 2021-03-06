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


import Home_work3.calcs.simple.CalculatorWithMathExtends;


public class CalculatorWithCounterAutoComposite {

    CalculatorWithMathExtends operator;   // поле определяющее каким классом считаем математику
    long countOperation = 0;

    /*
    конструктор по умолчанию, создает новый обьект калькулятора на основе CalculatorWithMathExtends
     */
    public CalculatorWithCounterAutoComposite() {
         this.operator = new CalculatorWithMathExtends();
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
