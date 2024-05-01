package Products;

import Products.Butter;
import Products.Curd;
import Products.Milk;
import Products.Product;

import java.util.ArrayList;

public class ProductsList {
    public ArrayList<Product> productsList = new ArrayList<>();
    public ArrayList init() {
        productsList.add(new Milk(1,  "Молоко", "234085273", "ОАО \"Савушкин продукт\"", 2.35, 30, 70, 3.6));
        productsList.add(new Butter(2,"Масло", "192489328", "ОАО \"Савушкин продукт\"", 5.02, 60, 30, 82.5));
        productsList.add(new Curd(3,  "Творог", "100328822", "ОАО \"Минский молочный завод №1\"", 1.82, 30, 50, 9));
        productsList.add(new Product(4, "Рыба", "1398429840", "Санта Бремор", 15.50, 12, 15));
        return productsList;
    }
}
