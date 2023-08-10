
package javaapplication6;

import javax.swing.JOptionPane;
public class JavaApplication6 {

   
    public static void main(String[] args) {
     double n1, mult;
     
     String sn1;
     sn1= JOptionPane.showInputDialog(null,"valor em reais");
     n1= Double.parseDouble(sn1);
     mult= n1*5;
     
     JOptionPane.showMessageDialog(null,"o resultado é" +mult);
    }
    
}
