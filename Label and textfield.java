
package layoutmanager;
    import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



public class Changeprice implements ActionListener {
JFrame converterFrame;
JPanel converterPanel;
JTextField tempDolar;
JLabel DolarLabel,DinarLabel;
JButton convertTemp;
Container pane;
public Changeprice() {

converterFrame = new JFrame("Convert Dolar to Dinar");

converterPanel = new JPanel();
converterPanel.setLayout(new GridLayout(5, 5));
     tempDolar = new JTextField(4);
    DolarLabel = new JLabel("Dolar");
convertTemp = new JButton("Convert");
   DinarLabel = new JLabel("Dinar"); 


convertTemp.addActionListener(this);
converterPanel.add(tempDolar);
converterPanel.add(DolarLabel);
converterPanel.add(convertTemp);
converterPanel.add(DinarLabel);
pane = converterFrame.getContentPane();
converterFrame.add(converterPanel,BorderLayout.CENTER);


converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

converterFrame.pack();
converterFrame.setVisible(true);
}


public void actionPerformed(ActionEvent event) {

int tempDo = Integer.parseInt(tempDolar.getText());
int tempDi = (int) (tempDo * 1200);
DinarLabel.setText(tempDi + " Dinar");
}
public static void main(String[] args) {
Changeprice converter = new Changeprice();
}
} 


