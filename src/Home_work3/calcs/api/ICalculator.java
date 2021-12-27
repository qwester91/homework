package Home_work3.calcs.api;
//8. Создать интерфейс ICalculator. Данный интерфейс создайте в пакете calcs.api . Можете прогуглить слово API,
// оно очень универсально. Такие пакеты обычно содержат интерфейсы, перечисления и в некоторых случаях абстрактные
// классы.
//	8.1 В данном интерфейсе должны быть объявлены методы:
//		8.1.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		8.1.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	8.2 На данный момент данный интерфейс вы должны прописать во всех классах калькуляторов созданных нами в пакетах
//	calcs.simple

public interface ICalculator {
    public double add(double arg1, double arg2);
    public double deduct(double arg1, double arg2);
    public double multiply(double arg1, double arg2);
    public double divide(double arg1, double arg2);
    public double exponentiation(double base, int exp);
    public double modul(double arg1);
    public double sqrt(double arg1);

}
