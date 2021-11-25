import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class NewWindow extends JFrame{
    JLabel label = new JLabel();
    JButton okButton = new JButton("OK");
    public NewWindow(String title) {
        super(title);
        setLayout(new FlowLayout());
        Container c = getContentPane();
        label.setText("자바는 썬 마이크로시스템즈의 제임스 고슬링과 다른 연구원들이 개발한 객체 지향적 프로그래밍 언어이다.\n1991년 그린 프로젝트라는 이름으로 시작해 1995년에 발표했다.");
        c.add(label);
        c.add(okButton);
        okButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                setVisible(false);
            }
        });
        setSize(1000,200);
        setVisible(true);
    }
}
