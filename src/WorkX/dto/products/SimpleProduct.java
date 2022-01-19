package WorkX.dto.products;

public class SimpleProduct {
    private final String name;
    private final double price;

    public SimpleProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getFinalPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "" + name + ", Цена - " +
                 + price ;
    }
}
