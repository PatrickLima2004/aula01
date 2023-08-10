
package javaapplication7;

import javax.swing.JOptionPane;
public class JavaApplication7 {

  
    public static void main(String[] args) {
      double n1, mult;
      
      String sn1;
      sn1= JOptionPane.showInputDialog(null,"digite aqui o seu salario");
      n1= Double.parseDouble(sn1);
      mult= n1*1.15;
      
      JOptionPane.showMessageDialog(null,"o resultado é" +mult);
        
    }
    
}
