package screen;

import objects.Pet;
import screen.*;
import util.Resource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.text.AttributedCharacterIterator;

public class GameScreen extends JPanel implements Runnable, MouseListener {
//    public static final int GAME_FIRST_START = 0;
//    public static final int GAME_PLAY_START = 1;
//    public static final int GAME_OVER_START = 2;
    public static final float GROUNDY = 130;
    private Thread thread;
    private Pet firstPet;

    private BufferedImage tachi;

//    private int gameStart = GAME_FIRST_START;

    public GameScreen() {
        setBackground(Color.pink);
        thread = new Thread(this);
        tachi = Resource.getResourceImage("data/normal.png");
        firstPet = new Pet();
    }

    public void startGame() {
        thread.start();
    };

    public void paint (Graphics g) {
        super.paint(g);
        // g.drawLine(10,10,100,100);
        g.drawImage(tachi, 160, 250, 200, 200, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse click at X: " + x + " Y : " + y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse presse at X: " + x + " Y : " + y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse release at X: " + x + " Y : " + y);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse enter at X: " + x + " Y : " + y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse exit at X: " + x + " Y : " + y);
    }

    @Override
    public void run() {
        while(true) {
            try{
            //    update();
                repaint();
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
