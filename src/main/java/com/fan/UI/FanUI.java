package com.fan.UI;

import com.fan.Fan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FanUI extends JPanel {
    private JPanel panel1;
    private JTextArea fanStatus;
    private JButton pullSpeedCordButton;
    private JButton pullDirectionCordButton;
    Fan fan = new Fan();

    public FanUI() {
        pullSpeedCordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("pullSpeedCordButton pressed");

                fan.pullSpeedCord();
                updateFanStatus();
            }
        });
        pullDirectionCordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("pullDirectionCordButton pressed");

                fan.pullDirectionCord();
                updateFanStatus();
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private void updateFanStatus() {
        System.out.println("Updating fanStatus text panel");

        fanStatus.setText(fan.toString());
    }
}
