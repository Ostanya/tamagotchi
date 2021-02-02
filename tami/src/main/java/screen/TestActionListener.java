package screen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String mess = "\"string 1\"\n" + "string 2\n" + "string 3";
        JOptionPane.showMessageDialog(new JFrame(), mess, "Help", JOptionPane.ERROR_MESSAGE);
    }
}
