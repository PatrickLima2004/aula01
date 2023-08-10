
package javaapplication4;

import javax.swing.JOptionPane;

public class JavaApplication4 {

   
    public static void main(String[] args) {
     double n1, resQuad, resRaiz;
     
     String sn1;
     sn1= JOptionPane.showInputDialog(null,"escreva o numero");
     n1= Double.parseDouble(sn1);
     resQuad= n1*n1;
     resRaiz=Math.sqrt(n1);
     JOptionPane.showMessageDialog(null, "essa é a raiz" +resRaiz);
     JOptionPane.showMessageDialog(null," esse é o quadrado" +resQuad);
    }
    
}
