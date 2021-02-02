package screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFormAppearance {
    public JPanel createPane() {
        JPanel newInterface = new JPanel();
        newInterface.setLayout(null); // create shell

        //Create blue label
        JLabel blueYar = new JLabel("Select Pet");
        blueYar.setLocation(10,10);
        blueYar.setSize(300,100);
        blueYar.setHorizontalAlignment(0);
        blueYar.setForeground(Color.blue);
        newInterface.add(blueYar);

        //create button
        JButton firstButton = new JButton("Change Name"); //free pet, help
        firstButton.setLocation(120,200);
        firstButton.setSize(200,50);
        ActionListener actionListener = new TestActionListener();
        firstButton.addActionListener(actionListener); // прикрепляем действие к кнопке
        newInterface.add(firstButton);

        JButton secondButton = new JButton("Free your pet");
        secondButton.setLocation(120, 200);
        secondButton.setSize(200, 50);
        ActionListener ParceListener = new ParceListener();
        secondButton.addActionListener(ParceListener);
        newInterface.add(secondButton);

        newInterface.setOpaque(true);
        return newInterface;
    }
}
