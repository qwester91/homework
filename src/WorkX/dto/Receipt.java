package WorkX.dto;

import java.util.List;

public class Receipt {
    private final List<String> strings;
    private final double finalPrice;

    public Receipt(List<String> strings, double finalPrice) {
        this.strings = strings;
        this.finalPrice = finalPrice;
    }

    public List<String> getStrings() {
        return strings;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    @Override
    public String toString() {
        int i = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        for (String string : strings) {
            sb.append(i + ". " + string);
            sb.append("\n");
            i++;

        }
        sb.append("Итого надо заплатить - " + finalPrice);

        return sb.toString();
    }
}
