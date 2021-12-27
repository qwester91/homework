package Home_work3.calcs.additional;
//10*. Создать CalculatorWithMemory.
//	10.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и обеспечить его
//	дополнительной функцией памяти. В принципе работает как калькулятор из реальной жизни.
//	10.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	10.3 Данный класс напрямую не умеет считать математику.
//	10.4 В классе должны присутствовать математические методы:
//		10.4.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		10.4.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	10.5 Функция памяти работает через методы:
//		10.5.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно быть
//		параметров. Данный метод вызывается непосредтвенно пользователем, а не автоматический.
//		10.5.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи
//		нового значения память перезаписывается. Данный метод вызывается непосредтвенно пользователем, а не
//		автоматический.

import Home_work3.calcs.api.ICalculator;

public class CalculatorWithMemory  {
    ICalculator operator;        // поле типа ICalculator. Определяет чем будем считать
    private double memory;       // поле, которое хранит записанное значене еалькулятора
    private double memoryUtil;   // поле-помогатор, хранит последнее значение калькулятора
    private long countOperation = 0;   // счетчик вызова методов калькулятора

    /**
     * конструктор CalculatorWithMemory, задает в поле калькулятор которым будем считать
     * @param operator обьект калькулятора , реализующего интерфейс ICalculator
     */
    public CalculatorWithMemory(ICalculator operator) {
        this.operator = operator;
    }

    /**
     * геттер memoryUtill
     * @return значение memoryUtill
     */
    public double getMemoryUtil() {
        return memoryUtil;
    }

    /**
     * сеттер memoryUtil
     * @param memoryUtil значение записываемое в memoryUtil (double)
     */
    public void setMemoryUtil(double memoryUtil) {
        this.memoryUtil = memoryUtil;}

    /**
     * сттер для поля memory
     */
    public void setMemory() {
        memory = getMemoryUtil();
    }

    /**
     * метод возвращающий значение memory. вроде как геттер, но нет. В нашем классе геттер работает несколько иначе
     * а это - помогатор для него(костыль)
     * @return memory
     */
    public double helpGetMemory() {
        return memory;
    }

    /**
     * а вот это уже полноценный геттер для memory. после вызова еще и очищает значение поля memory
     * @return значение поля memory на момент вызова метода
     */
    public double getMemory(){
        double helper = helpGetMemory();
        this.memory = 0;
        return helper;
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
     *  увеличивает счетчик использования калькулятора на 1
     *  записывает результат в поле memoryUtil
     * @param arg1 первое слагаемое
     * @param arg2 второе слагаемое
     * @return  возвращает результат сложения.
     */
    public double add (double arg1, double arg2) {
        incrementCountOperation ();
        double result = operator.add(arg1, arg2);
        setMemoryUtil(result);
        return result;
    }

    /**
     * находит разность двух чисел. Оба числа double
     * увеличивает счетчик использования калькулятора на 1
     * записывает результат в поле memoryUtil
     * @param arg1 уменьшаемое значение
     * @param arg2 вычитаемое значение
     * @return  возвращает результат вычитания второго аргумента из первого.
     */
    public double deduct (double arg1, double arg2){
        incrementCountOperation ();
        double result = operator.deduct(arg1, arg2);
        setMemoryUtil(result);
        return result;
    }

    /**
     * находит произведение двух чисел. Оба числа double
     * увеличивает счетчик использования калькулятора на 1
     * записывает результат в поле memoryUtil
     * @param arg1 первый множитель
     * @param arg2 второй множитель
     * @return  возвращает результат умножения.
     */
    public double multiply (double arg1, double arg2){
        incrementCountOperation ();
        double result = operator.multiply(arg1, arg2);
        setMemoryUtil(result);
        return result;
    }

    /**
     * находит частное двух чисел. Оба числа double
     * увеличивает счетчик использования калькулятора на 1
     * записывает результат в поле memoryUtil
     * @param arg1 делимое
     * @param arg2 делитель
     * @return  возвращает результат деления первого аргумента на второго.
     */
    public double divide (double arg1, double arg2){
        incrementCountOperation ();
        double result = operator.divide(arg1, arg2);
        setMemoryUtil(result);
        return result;
    }


    /**
     * Возводим в степень.
     * увеличивает счетчик использования калькулятора на 1
     * записывает результат в поле memoryUtil
     * @param base основание (число которое возводим в степень)
     * @param exp степень (в которую возводим число)
     * @return  если все прошло хорошо, то возвращаем результат возведения в степень
     */
    public double exponentiation (double base, int exp){
        incrementCountOperation();
        double result = operator.exponentiation(base, exp);
        setMemoryUtil(result);
        return result;
    }

    /**
     * возвращает модуль числа
     * увеличивает счетчик использования калькулятора на 1
     * записывает результат в поле memoryUtil
     * @param x этого числа модуль возвращает
     * @return возвращает модуль числа
     */
    public double modul (double x){
        incrementCountOperation();
        double result = operator.modul(x);
        setMemoryUtil(result);
        return result;
    }

    /**
     * квадратный корень числа
     * увеличивает счетчик использования калькулятора на 1
     * записывает результат в поле memoryUtil
     * @param q число, корень из которого нужно извлечь
     * @return результат извлечения корня
     */
    public double sqrt(double q){
        incrementCountOperation();
        double result = operator.sqrt(q);
        setMemoryUtil(result);
        return result;
    }
}
