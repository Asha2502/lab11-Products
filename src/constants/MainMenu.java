package constants;

public abstract class MainMenu {
    public static void menu(){
        System.out.println("\n1. Вывести все товары в торговом зале");
        System.out.println("2. Добавить товар");
        System.out.println("3. Переместить товар на склад");
        System.out.println("4. Переместить в торговый зал");
        System.out.println("5. Оплатить товар");
        System.out.println("6. Списать товар");
        System.out.println("7. Вывести все товары на складе");
        System.out.println("8. Описание жирности молочного продукта");
        System.out.println("0. Выход");
        System.out.print("Введите ключ> ");
    }
}
