import javax.swing.*;
/*
Leer por teclado un numero entero N, no negativo, y mostrar el factorial de todos los numeros
desde 0 hasta N
 */

public class P_6 {
    
    public static void main (String[] args) {
        
        int N, x , factorial=1;
        
        do{
            do{
            N = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entero: "));
            
            if (N<0){
                
                JOptionPane.showMessageDialog(null, "El numero ingresado no es entero", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            }while (N<0);
            String texto = "Los Factoriales de 0 hasta "+N +"\nFactorial de 0 = 1";
            
            for (int i = 1 ; i<=N ; i++){
                
                factorial = factorial *i;
                
                texto = texto + "\nFactorial de "+i+" = " +factorial; 
                
            }
            
                JOptionPane.showMessageDialog(null, texto);
                
                 x = JOptionPane.showConfirmDialog(null, "Finalizar programa?", "AVISO", JOptionPane.WARNING_MESSAGE);
                
        } while (x != 0);
    }    
}