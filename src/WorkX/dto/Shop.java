package WorkX.dto;

import WorkX.dto.products.SimpleProduct;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<SimpleProduct> list;

    public Shop() {
        this.list = new ArrayList<>();
    }

    public void add (SimpleProduct product){
        list.add(product);
    }

    public List<SimpleProduct> getList() {
        return list;
    }

    public Box getBox(){
        return new Box();
    }
    public Receipt getReceipt(Box box){
        double finalPrise = 0;

        List<String> strings = new ArrayList<>();
        for (ProductsInBox productsInBox : box.getList()) {
            finalPrise += productsInBox.getProduct().getFinalPrice() * productsInBox.getCount();
            strings.add(productsInBox.getProduct().toString() + ", Количество - " + productsInBox.getCount() + ", Сумма - "
                    + productsInBox.getProduct().getFinalPrice() * productsInBox.getCount());
        }


       Receipt receipt = new Receipt(strings, finalPrise);
        return receipt;
    }


}
