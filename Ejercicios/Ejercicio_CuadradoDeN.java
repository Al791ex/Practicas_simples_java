import javax.swing.JOptionPane;
// recibir numero entero, si es mayor a 10 y menor a 50 hacerle su cuadrado, si no mostrar error ( 2 bucles)


public class Clase5_E2 {
    
    public static void main (String[] args) {
        
        int i =0 , n;
        double c;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entero"));
            
            if (n>10 && n<50){
                
                c = Math.pow(n,2); 
                
                JOptionPane.showMessageDialog(null, "El cuadrado de "+n+" es "+c);
                break;
                
            } else {
                
                JOptionPane.showMessageDialog(null, "NUMERO INVALIDO", "ERROR ", JOptionPane.ERROR_MESSAGE);
            }
            
            i++;
        } while (i>=1);
    }
}