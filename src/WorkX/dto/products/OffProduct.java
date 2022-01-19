package WorkX.dto.products;

public class OffProduct extends SaleProduct {
    private final String offCause;

    public OffProduct(String name, double price, double discount, String offCause) {
        super(name, price, discount);
        this.offCause = offCause;
    }

    public String getOffCause() {
        return offCause;
    }

    public double getFinalPrice() {
        return (super.getFinalPrice()) ;
    }

    @Override
    public String toString() {
        return super.toString() + ", Уценка - " +
                offCause ;
    }
}
