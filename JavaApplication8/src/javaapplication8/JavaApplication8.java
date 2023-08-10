
package javaapplication8;

import javax.swing.JOptionPane;
public class JavaApplication8 {

   
    public static void main(String[] args) {
       double n1, mult;
       
       String sn1;
       
    
   sn1= JOptionPane.showInputDialog(null, "digite aqui seu salario");
   n1= Double.parseDouble(sn1);
   mult= n1*0.86;
   
   JOptionPane.showMessageDialog(null,"esse é o resultado" +mult);
   
   
    }
}  