package screen;

import screen.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class GameScreen extends JPanel {
    public static final int GAME_FIRST_START = 0;
//    public static final int GAME_PLAY_START = 1;
//    public static final int GAME_OVER_START = 2;
//    private Thread thread;

    private int gameStart = GAME_FIRST_START;

    public GameScreen() {
        setBackground(Color.pink);
    //    thread = new Thread(this);

    }

//    public void startGame() {
//        thread.start();
//    };
}
