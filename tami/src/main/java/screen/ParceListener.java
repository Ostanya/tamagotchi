package screen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParceListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String mess = "Knopka Najata";
        JOptionPane.showMessageDialog(new JFrame(), mess, "Free ypurself", JOptionPane.ERROR_MESSAGE);
    }
}
