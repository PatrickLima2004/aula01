
package javaapplication2;

import javax.swing.JOptionPane;


public class JavaApplication2 {

   
    public static void main(String[] args) {
    double n1,cubo;
    String  sn1;
    
       sn1=JOptionPane.showInputDialog(null, "digite o numero");
       n1= Double.parseDouble(sn1);
       cubo= n1*n1*n1;
       JOptionPane.showMessageDialog(null, "o numero do cubo é"+ cubo);
   
    }
    
}
