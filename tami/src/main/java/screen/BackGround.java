package screen;

import screen.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BackGround extends JFrame {
    public static final int SCREEN_WIDTH = 500;
    private GameScreen gameScreen;

    public BackGround() {
        super("Tami");
        setLocation(400, 200);
        setSize(SCREEN_WIDTH,675);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    gameScreen = new GameScreen();
//        addKeyListener(gameScreen);
     //   add(gameScreen);
    }

    public void paint (Graphics g) {
        super.paint(g);
        // g.drawLine(10,10,100,100);
        Image img = new ImageIcon("data/normal.png").getImage();
        g.drawImage(img, 160, 250, 200, 200, null);
    }
//    public void startGame() {
//        gameScreen.startGame();
//    }

}
