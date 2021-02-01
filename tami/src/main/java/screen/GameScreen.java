package screen;

import screen.*;
import util.Resource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class GameScreen extends JPanel {
    public static final int GAME_FIRST_START = 0;
//    public static final int GAME_PLAY_START = 1;
//    public static final int GAME_OVER_START = 2;
    public static final float GROUNDY = 130;
//    private Thread thread;

    private BufferedImage tachi;

    private int gameStart = GAME_FIRST_START;

    public GameScreen() {
        setBackground(Color.pink);
    //    thread = new Thread(this);
        tachi = Resource.getResourceImage("data/normal.png");
    }

//    public void startGame() {
//        thread.start();
//    };
}
