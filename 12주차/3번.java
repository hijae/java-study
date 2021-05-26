package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame {

    JLabel jla[] = new JLabel[10];
    Container c = getContentPane();
    int flag=0;
    public void rLabel(JLabel[] jla) {
        int i;
        for(i=0;i<10;i++)
        {
            jla[i]= new JLabel(Integer.toString(i));
            int x = (int) (Math.random() * 250)+25;
            int y = (int) (Math.random() * 250)+25;
            jla[i].setLocation(x, y);
            jla[i].setSize(20,20);
            c.add(jla[i]);
            jla[i].addMouseListener((MouseListener) new mouse());
        }
    }

    class mouse extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            JLabel j = (JLabel) e.getSource();
            if (j == jla[flag]) // 클릭한게 순서 대로 인지
                if (jla[flag].getText().equals(Integer.toString(flag))) {
                    jla[flag].setVisible(false);
                    flag++;
                    if (!jla[9].isVisible()) {
                        flag = 0;
                        for (int i = 0; i < 10; i++) {
                            jla[i].setVisible(true);
                            int x = (int) (Math.random() * 150) + 50;
                            int y = (int) (Math.random() * 150) + 50;
                            jla[i].setLocation(x, y);
                            jla[i].addMouseListener((MouseListener) new mouse());
                        }
                    }
                }
        }
    }

    public Main() {
        setTitle("Ten game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c.setLayout(null);

        rLabel(jla);
        setSize(300,300);
        setVisible(true);

    }
    public static void main(String [] args) {
        new Main();
    }
}