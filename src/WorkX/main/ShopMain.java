package WorkX.main;

import WorkX.service.ShopService;

public class ShopMain {

    public static void main(String[] args) {
        ShopService service = new ShopService();
        service.run();
    }
}
