import javax.swing.*;
/*
Escribir un programa que pide limite inferior y superior de un intervalo.
Si el limite inferior es mayor que el superior lo tiene que volver a pedir.
A continuacion se van introduciendo numeros, hasta que introduscamos el 0.
Cuando termine el programa dara las siguientes informaciones:
-La suma de los numeros que estan dentro del intervalo(el intervalo es abierto)
-Cuantos numeros estan fuera del intervalo
-Informa si se ha introducido a un numero igual a los limites del intervalo
 */

public class P_5 {
    
    public static void main (String[] args) {
        
       
        double n, aux = 0, aux2 = 0, sup, inf;
        int contador = 0, contador2 = 0, contador3= 0;
        
        JOptionPane.showMessageDialog(null, "Desea continuar? ", "CALCULADORA DE INTERVALOS", JOptionPane.DEFAULT_OPTION);
        
        do {
        sup = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el limite superior: "));
        
        inf = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el limite inferior: "));
        
        if (inf>sup){  
           
            JOptionPane.showMessageDialog(null,"Limite inferior mayor a limite superior", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        } while (inf>sup);

        
        do {
            
            n = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero al azar: "));
            if (n>=inf && n<=sup){
                
                aux = n + aux;
                
            } else{
                
                contador++;
            }
            
            if (n == sup || n == inf) {
                
                if (n == sup){
                    
                    contador2++;
                }else {
                    
                    contador3++;
                }
  
            }
            
        } while (n != 0);
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma de los numeros dentro del intervalo es: "+ aux + "\nLa cantidad de # fuera del intervalo es: "+contador + "\n# Iguales a limite superior("+sup+ "): "+contador2 + "\nIguales a limite inferior ("+inf+"): "+contador3, "RESULTADOS" , JOptionPane.INFORMATION_MESSAGE);
       
    }
    
}