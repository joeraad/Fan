package com.fanApp;

import com.fan.UI.FanUI;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Loading GUI");
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    FanUI gui = new FanUI();
                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.getContentPane().add(gui.getPanel1());
                    frame.setTitle("Fan");
                    frame.pack();
                    frame.setVisible(true);
                }
            });
        }catch (Exception e){
            System.out.println("Failed to load GUI");
        }

    }
}
