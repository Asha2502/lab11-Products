package menu;

import constants.MainMenu;

import java.util.Scanner;

public class MenuController {
    public void printMenu() {
        MainController mainController = new MainController();
        Scanner scanner = new Scanner(System.in);
        int key;

        while (true) {
            MainMenu.menu();
            key = scanner.nextInt();
            switch (key) {
                case 0 -> System.exit(0);
                case 1 -> mainController.printAllProducts();
                case 2 -> mainController.inputNewProduct();
                case 3 -> mainController.moveToWarehouse();
                case 4 -> mainController.moveToTradingHall();
                case 5 -> mainController.buyProduct();
                case 6 -> mainController.deleteProduct();
                case 7->mainController.printWarehouseProducts();
                case 8 -> mainController.milkProduct();
                default -> System.out.println("Ошибка");
            }
        }
    }
}
