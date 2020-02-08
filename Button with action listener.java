package layoutmanager;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Buttonwithactionlistener extends JFrame implements ActionListener {

    JButton b1 = new JButton("Dell"), b2 = new JButton("Hp"),
            b3 = new JButton("Lenovo"), b4 = new JButton("Vaio"),
            b5 = new JButton("Mackbook");

    CardLayout b = new CardLayout();
    Container pane;

    public Buttonwithactionlistener() {
        setTitle("CardLayout Test");
        pane = getContentPane();
        pane.setLayout(b);
        setBounds(500, 0, 500, 500);
        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
        pane.add(b4);
        pane.add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public static void main(String[] args) {
     Buttonwithactionlistener c=new Buttonwithactionlistener();   
     c.setVisible(true);
    }
        @Override
        public void actionPerformed(ActionEvent e) {
if (e.getSource() == b1) {
                b.next(pane);
            } else if (e.getSource() == b2) {
                b.next(pane);
            } else if (e.getSource() == b3) {
                b.next(pane);
            } else if (e.getSource() == b4) {
                b.next(pane);
            } else if (e.getSource() == b5) {
                b.next(pane);
            }
        }
    }
