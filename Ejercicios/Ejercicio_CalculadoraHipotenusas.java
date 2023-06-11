import javax.swing.*;

public class P_7 {
    
   public static void main (String[] args){
       
       int x;
       
       do{
           
           JOptionPane.showMessageDialog(null, "Encuentra la hipotenusa de tus triangulos", "CALCULADORA", -1);
           
           double co = Double.parseDouble(JOptionPane.showInputDialog("Introduce el cateto opuesto"));
           
           double ca = Double.parseDouble(JOptionPane.showInputDialog("Introduce el cateto adyacente"));
           
           double hipotenusa = Math.sqrt(Math.pow(co , 2)+ Math.pow(ca, 2));
           
           JOptionPane.showMessageDialog(null, "La hipotenusa de tu triangulo es: " + hipotenusa);
           
           x = JOptionPane.showConfirmDialog(null, "Desea continuar?", "AVISO", JOptionPane.WARNING_MESSAGE);
       }while (x != 1);
       
   }  
}