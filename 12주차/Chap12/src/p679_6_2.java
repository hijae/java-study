import javax.swing.*;
import java.awt.*;

public class p679_6_2 extends JFrame {
    private MyPanel panel = new MyPanel();
    public p679_6_2() {
        setTitle("그래픽 다각형 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(300, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            for(int i=0;i<100;i+=10) {
                int[] x = {getWidth() / 2, 0+i, getWidth() / 2, getWidth()-i};
                int[] y = {0+i, getHeight() / 2, getHeight()-i, getHeight() / 2};
                g.drawPolygon(x, y, 4);
            }
        }
    }
    public static void main(String [] args) {
        new p679_6_2();
    }
}
