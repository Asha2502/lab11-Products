package menu;

import Products.*;
import constants.Constants;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    Constants constants = new Constants();
    ProductsList prl = new ProductsList();
    private ArrayList<Product> list= prl.init();
    private ArrayList<Product> warehouse = new ArrayList<>();
    private double cash = constants.getMoney();
    Scanner sc = new Scanner(System.in);

    public void go() {
        System.out.println("Выделенная сумма денег: " + cash + " рублей");
    }

    public void printAllProducts(){
        if(list.isEmpty())
            System.out.println("Торговый зал пуст");
        else
        for (Product pr : list) {
            System.out.println(pr);
        }
    }
    public void inputNewProduct(){
        System.out.print("Введите данные для добавления продукта: \nid: ");
        int id = sc.nextInt();
        System.out.print("название: ");
        String name = sc.next();
        System.out.print("UPC: ");
        String upc = sc.next();
        System.out.print("производитель: ");
        String manufacturer = sc.next();
        System.out.print("цена: ");
        double price = sc.nextDouble();
        System.out.print("срок хранения: ");
        int shellife = sc.nextInt();
        System.out.print("количество: ");
        int quantity = sc.nextInt();
        Product pr = new Product(id, name, upc, manufacturer, price, shellife, quantity);
        addProduct(pr);
    }

    public void addProduct(Product pr){
        int fatContent=0;
        if(pr.getName().equals("Молоко") || pr.getName().equals("Творог") || pr.getName().equals("Масло")){
            System.out.print("жирность: ");
            fatContent = sc.nextInt();
        }
        Product newitem;
        if(pr.getName().equals("Молоко")){
            newitem = new Milk(pr, fatContent);
            list.add(newitem);
        }
        else if(pr.getName().equals("Творог")){
            newitem = new Curd(pr, fatContent);
            list.add(newitem);
        }
        else if(pr.getName().equals("Масло")){
            newitem = new Butter(pr, fatContent);
            list.add(newitem);
        }
        else list.add(pr);
    }

    public void moveToWarehouse(){
        System.out.print("Введите id товара, который нужно переместить на склад: ");
        int id = sc.nextInt();
        int k=0;
        for (Product pr : list) {
            if(id== pr.getId()){
                list.remove(pr);
                warehouse.add(pr);
                k++;
                break;
            }
        }
        if(k==0) System.out.println("Товар не найден");
        else System.out.println("Товар успешно перемещен на склад");
    }
    public void moveToTradingHall(){
        System.out.print("Введите id товара, который нужно переместить в торговый зал со склада: ");
        int id = sc.nextInt();
        int k=0;
        for (Product pr : warehouse) {
            if(id== pr.getId()){
                warehouse.remove(pr);
                list.add(pr);
                k++;
                break;
            }
        }
        if(k==0)  System.out.println("Товар не найден");
        else System.out.println("Товар успешно перемещен в торговый зал");
    }

    public void buyProduct() {
        System.out.print("Введите id товара, который хотите купить: ");
        int id = sc.nextInt();
        int k=0;
        int q;
        for (Product pr : list) {
            if(id==pr.getId() && cash>=pr.getPrice()){
                cash-=pr.getPrice();
                q=pr.getQuantity();
                pr.setQuantity(--q);
                k++;
                break;
            }
        }
        if(k==0) System.out.println("Товар не найден");
        else System.out.println("Вы купили товар! Остаток денег - "+cash);
    }

    public void deleteProduct() {
        System.out.print("Введите id товара, который нужно удалить: ");
        int id = sc.nextInt();
        int k=0;
        for (Product pr : list) {
            if(id==pr.getId()){
                list.remove(pr);
                k++;
                break;
            }
        }
        for (Product pr: warehouse){
            if(id==pr.getId()){
                warehouse.remove(pr);
                k++;
            }
        }
        if(k==0) System.out.println("Товар не найден");
        else System.out.println("Товар успешно удален");
    }

    public void printWarehouseProducts(){
        if(warehouse.isEmpty())
            System.out.println("Склад пуст");
        else
        for (Product pr : warehouse) {
            System.out.println(pr);
        }
    }

    public void milkProduct(){
        System.out.print("Введите id товара: ");
        int id = sc.nextInt();
        int k=0;
        for (Product pr : list) {
            if(id == pr. getId()) {
                pr.fatContent();
                k++;
            }
        }
        if(k==0) System.out.println("Товар не найден");
    }

}
