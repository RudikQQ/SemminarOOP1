import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("tea", 123, 100, 100));
        productList.add(new HotDrink("qwe", 200, 150, 50));
        productList.add(new HotDrink("zxcg", 500, 1000, 60));
        productList.add(new HotDrink("qaffwe", 123, 10, 70));

        HotDrinksVendingMashine hotDrinksMashine = new HotDrinksVendingMashine();
        hotDrinksMashine.initProduct(productList);

        System.out.println(hotDrinksMashine.getProduct("zxcg", 1000, 60));

    }
}