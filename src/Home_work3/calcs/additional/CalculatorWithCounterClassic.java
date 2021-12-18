package Home_work3.calcs.additional;

import Home_work3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    long countOperation = 0;

    public void incrementCountOperation (){
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }
}
