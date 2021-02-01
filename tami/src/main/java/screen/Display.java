package screen;

import javax.swing.*;


public class Display extends JFrame {
    public static final int SCREEN_WIDTH = 500;
    private GameScreen gameScreen;

    public Display() {
        super("Tami");
        setLocation(400, 200);
        setSize(SCREEN_WIDTH,675);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameScreen = new GameScreen();
        addMouseListener(gameScreen);
        add(gameScreen);
    }

//
//    public void startGame() {
//        gameScreen.startGame();
//    }

}
