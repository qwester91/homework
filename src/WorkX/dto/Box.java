package WorkX.dto;

import WorkX.dto.products.SimpleProduct;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<ProductsInBox> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public List<ProductsInBox> getList() {
        return list;
    }

    public void add(ProductsInBox products) {
        list.add(products);
    }
}
