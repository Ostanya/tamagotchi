package screen;

import javax.swing.*;

public class MenuWindow {
    public MenuWindow() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Menu");

        MainFormAppearance one = new MainFormAppearance();
        frame.setContentPane(one.createPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

    }
}
