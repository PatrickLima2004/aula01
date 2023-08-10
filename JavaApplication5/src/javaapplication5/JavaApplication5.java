
package javaapplication5;

import javax.swing.JOptionPane;

public class JavaApplication5 {

    
    public static void main(String[] args) {
       double n1, n2, n3 , soma, mult;
       
       String sn1, sn2, sn3;
       sn1= JOptionPane.showInputDialog(null,"escreva o primeiro  numero");
       sn2= JOptionPane.showInputDialog(null,"escreva o segundo numero");
       sn3= JOptionPane.showInputDialog(null,"digite o terceiro numero");
       
       n1= Double.parseDouble(sn1);
       n2= Double.parseDouble(sn2);
       n3= Double.parseDouble(sn3);
       soma= n1+n2+n3;
       mult= soma*3;
       JOptionPane.showMessageDialog(null,"o resultado é" +mult);
    }
}  