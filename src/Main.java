import menu.MainController;
import menu.MenuController;

public class Main {
    public static void main(String[] args) {
        new MainController().go();
        new MenuController().printMenu();
    }
}
