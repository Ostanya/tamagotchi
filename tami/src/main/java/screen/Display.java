package screen;

import javax.swing.*;


public class Display extends JFrame {
    public static final int SCREEN_WIDTH = 500;
    private GameScreen gameScreen;

    public Display() {
        super("Tami");
        setLocation(400, 200);
        setSize(SCREEN_WIDTH,675);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameScreen = new GameScreen();
//        addKeyListener(gameScreen);
        add(gameScreen);
    }

//
//    public void startGame() {
//        gameScreen.startGame();
//    }

}
