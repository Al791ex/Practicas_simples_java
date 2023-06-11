import javax.swing.*;

//calculadora, suma, resta, multiplicacion, division, salida.

 class Clase6_E1 {
     
     public static void main (String[] args) {
         
         int y;
         
         do {
             String [] operaciones = { "Suma", "Resta","Multiplicacion","Division"};
         
         
         int x = JOptionPane.showOptionDialog(null, "Selecciona un boton", "CALCULADORA",
                 JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operaciones, operaciones[0]);
         
          double n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
          double n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
          
         switch (x){
             
             case 0: {
                 double suma = n1+n2;
                 JOptionPane.showMessageDialog(null,"El resultado de la operacion es: "+suma);
             }
             break;
             
             case 1: {
                 double resta = n1-n2;
                 JOptionPane.showMessageDialog(null,"El resultado de la operacion es: "+resta);
             }
             break;
             
             case 2: {
                 double multiplicacion = n1*n2;
                 JOptionPane.showMessageDialog(null,"El resultado de la operacion es: "+multiplicacion);
             }
             break;
             
             case 3: {
                 if (n2 == 0 || n1 == 0){
                     
                     JOptionPane.showMessageDialog(null, "OPERACION INVALIDA", "AVISO", JOptionPane.WARNING_MESSAGE);
                 }
                 double division = n1/n2;
                 JOptionPane.showMessageDialog(null,"El resultado de la operacion es: "+division);
                 
                 
             } 
             break;  
         }
         
         y = JOptionPane.showConfirmDialog(null, "Quieres seguir", "AVISO", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE );
         
         } while (y == 0);
         
         JOptionPane.showMessageDialog(null, "CHAO MAMAWEBO");
         
     }
 }