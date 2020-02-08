
package layoutmanager;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Layoutmanager extends JFrame {
 
    JButton L=new JButton("Labtop");
    JButton M=new JButton("Mobile");
    JButton C=new JButton("Camera");
   
    public Layoutmanager() {
setTitle("Chosse Your Option To Buy");
Container pane = getContentPane();
pane.setLayout(new FlowLayout());
setBounds(500,0,500,500);
pane.add(L); pane.add(M); pane.add(C);
    }
    
        
    public static void main(String[] args) {
      Layoutmanager a=new Layoutmanager();
      a.setVisible(true);
 
}
    }
    

