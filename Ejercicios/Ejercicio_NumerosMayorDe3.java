import javax.swing.JOptionPane;

//elaborar un programa que indique el numero numero mayor
public class Clase5_E1 {
    
    public static void main (String[] args){
        
        int j, d, h;
        
        j = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
        h = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer numero: "));
        
        if (j>d && j>h) {
            
            JOptionPane.showMessageDialog(null, "El numero mayor es el "+j);
        } else {
            
            if (d>h) {
                
                JOptionPane.showMessageDialog(null, "El numero mayor es el "+d);
            } else {
                
                JOptionPane.showMessageDialog(null, "El numero mayor es el "+h);
            }
        }
    }
}