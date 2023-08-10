
package javaapplication3;

import javax.swing.JOptionPane;

public class JavaApplication3 {

    
    public static void main(String[] args) {
       int n1,n2, res;
       String sn1, sn2;
      
       sn1 =JOptionPane.showInputDialog(null,"escolha um numero");
       sn2 =JOptionPane.showInputDialog(null,"escolha outro numero");
       
       n1 =Integer.parseInt(sn1);
       n2 =Integer.parseInt(sn2);
       
       res=n1%n2;
       
       JOptionPane.showMessageDialog(null,"o resto da divisão é" +res);
    }
    
}
