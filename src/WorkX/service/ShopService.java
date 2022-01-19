package WorkX.service;

import WorkX.dto.Box;
import WorkX.dto.ProductsInBox;
import WorkX.dto.Shop;
import WorkX.dto.products.OffProduct;
import WorkX.dto.products.SaleProduct;
import WorkX.dto.products.SimpleProduct;

import java.util.Scanner;

public class ShopService {

    public void run(){


        SimpleProduct milk = new SimpleProduct("Молоко", 2.35);
        SimpleProduct tv = new SaleProduct("Телевизор", 8563, 31);
        SimpleProduct banana = new OffProduct("Бананы", 10, 50, "битые");

        Shop shop = new Shop();
        shop.add(milk);
        shop.add(tv);
        shop.add(banana);

        Box box = shop.getBox();
        Scanner scanner = new Scanner(System.in);
        System.out.println( shop.getList().toString());

        SimpleProduct product1 = milk;
        int product;
        int count ;
        do {
            System.out.println("введите номер товара и количество");
            product = scanner.nextInt();
            count = scanner.nextInt();
            switch (product){
                case 1:
                    product1 = milk;
                    break;
                case 2:
                    product1 = tv;
                    break;
                case 3:
                    product1 = banana;
                    break;
                default: break;

            }if (product > 0 && product < 4){
            box.add(new ProductsInBox(product1, count));}
        }while (product > 0 && product < 4);


        System.out.println( shop.getReceipt(box).toString());
    }

}
