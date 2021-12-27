package Home_work3.calcs.simple;
//. Создать класс CalculatorWithMathCopy.
//	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	3.2 В классе должны присутствовать математические методы:
//		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		Скопировать базовые математические операции из CalculatorWithOperator.
//		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//		Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.

//	8.2 На данный момент данный интерфейс вы должны прописать во всех классах калькуляторов созданных нами в пакетах
//	calcs.simple
import Home_work3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
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
     * @param base основание (число которое возводим в степень) double
     * @param exp степень (в которую возводим число) int
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
     * @param x число,  модуль которого возвращает метод (double)
     * @return возвращает модуль числа
     */
    public double modul (double x){
            return Math.abs(x);
    }

    /**
     * квадратный корень числа
     * @param q число, корень из которого нужно извлечь (double)
     * @return результат извлечения корня
     */
    public double sqrt(double q){
        return Math.sqrt(q);
    }


}

