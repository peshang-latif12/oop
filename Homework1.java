
package homework1;

import javax.swing.JOptionPane;

public class Homework1 {

    
    public static void main(String[] args) {
      int a=1;
      while(a==1){
          int b=Integer.parseInt(JOptionPane.showInputDialog("enter an integer"));
          if(b%2 !=0){
              JOptionPane.showMessageDialog(null, "this number is odd");
          }
          else{
              JOptionPane.showMessageDialog(null, "this number is even");
          }
          int c=JOptionPane.showConfirmDialog(null,"do another","select",JOptionPane.YES_NO_CANCEL_OPTION);
          if(c==JOptionPane.NO_OPTION){
              System.exit(0);
          }
          else if(c==JOptionPane.CANCEL_OPTION){
              System.exit(0);
      }
    }
    
}
}
