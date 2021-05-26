import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menupl2 extends JFrame {
    public menupl2() {
        setTitle("18114022 송희재");
        createMenu(); // 메뉴 생성, 프레임에 삽입
        setSize(250,200);
        setVisible(true);
    }
    private void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu screenMenu1 = new JMenu("1번");

        screenMenu1.add(new JMenuItem("실행"));

        mb.add(screenMenu1);
        JMenu screenMenu21 = new JMenu("2-1번");
        screenMenu21.add(new JMenuItem("New"));
        screenMenu21.add(new JMenuItem("Open"));
        screenMenu21.addSeparator(); // 분리선 삽입
        screenMenu21.add(new JMenuItem("Save"));
        screenMenu21.add(new JMenuItem("SaveAs"));

        mb.add(screenMenu21);
        JMenu screenMenu22 = new JMenu("2-2번");
        screenMenu22.add(new JMenuItem("Open"));
        screenMenu22.addSeparator(); // 분리선 삽입
        screenMenu22.add(new JMenuItem("Color"));
        screenMenu22.addSeparator(); // 분리선 삽입
        screenMenu22.add(new JMenuItem("Line"));
        screenMenu22.add(new JMenuItem("Rect"));
        screenMenu22.add(new JMenuItem("Oval"));
        screenMenu22.add(new JMenuItem("RndRect"));
        screenMenu22.add(new JMenuItem("Text"));
        screenMenu22.add(new JMenuItem("FreeLine"));

        mb.add(screenMenu22);
        JMenu screenMenu3 = new JMenu("3,4,5번");
        screenMenu3.add(new JMenuItem("3.게임시작"));
        screenMenu3.add(new JMenuItem("4.계산기"));
        JMenuItem menujavaitem = new JMenuItem("5.자바란?");
        menupl2.MenuActionListener listener = new menupl2.MenuActionListener();
        menujavaitem.addActionListener(listener);
        screenMenu3.add(menujavaitem);

        mb.add(screenMenu3);
        setJMenuBar(mb);
    }
    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new NewWindow("자바");
        }
    }
    public static void main(String [] args) {
        new menupl2();
    }
}
