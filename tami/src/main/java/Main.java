import screen.Display;
import screen.MenuWindow;

public class Main {
    public static void main(String[] args) {
        MenuWindow app1 = new MenuWindow();
        Display app = new Display();
        app.setVisible(true);
        app.startGame();
    }
}
