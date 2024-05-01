package Products;

import java.util.ArrayList;
import java.util.Scanner;

/*
14. Товар (Products.Product). Возможности: добавить товар; получить данные о товаре:
id, наименование, UPC, производитель, цена, срок хранения, количество; изменить данные о товаре;
переместить товар на склад, переместить товар в торговый зал; оплатить товар; списать товар.
Добавить специализированные методы для Масла, Молока, Творога.
*/
public class Product {
    private int id;
    private String name;
    private String upc;
    private String manufacturer;
    private double price;
    private int shelfLife;
    private int quantity;
    private Milk milk;
    private Curd curd;
    private Butter butter;
    public Product(int id, String name, String upc, String manufacturer, double price, int shelfLife, int quantity) {
        this.id = id;
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUpc() {
        return upc;
    }
    public void setUpc(String upc) {
        this.upc = upc;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getShelfLife() {
        return shelfLife;
    }
    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "id= " + getId() +
                ". название='" + getName() + '\'' +
                ", UPC='" + getUpc() + '\'' +
                ", производитель='" + getManufacturer() + '\'' +
                ", цена=" +getPrice() +
                ", срок годности=" + getShelfLife() +
                ", количество=" + getQuantity();
    }

    public void fatContent(){
        if(name.equals("Молоко")){
            milk.fatContent();
        }
        else if(name.equals("Творог")){
            curd.fatContent();
        }
        else if(name.equals("Масло")){
            butter.fatContent();
        }
    }
}
