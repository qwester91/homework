package WorkX.dto;

import WorkX.dto.products.SimpleProduct;

public class ProductsInBox {

   private final SimpleProduct product;
   private final int count;

    public ProductsInBox(SimpleProduct product, int count) {
        this.product = product;
        this.count = count;
    }

    public SimpleProduct getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }

}
