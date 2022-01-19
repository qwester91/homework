package WorkX.dto.products;

public class SaleProduct extends SimpleProduct {

    private final double discount;

    public SaleProduct(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
    public double getFinalPrice() {
        return (super.getFinalPrice() - super.getFinalPrice() * (discount/100));
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Скидка - " + discount + "%";
    }
}
