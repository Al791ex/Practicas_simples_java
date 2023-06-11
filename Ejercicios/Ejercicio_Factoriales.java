/* Leer por teclado un numero entero N no negativo, y mostrar la suma de los factoriales de todos los
    numeros desde 0 hasta N, do while, for */
import java.util.Scanner;

public class Factoriales {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double N;
        
        do {
            
            System.out.print("Ingresa un numero no negativo: ");
            N = sc.nextDouble();
           
            if (N<0){
                
                System.out.println("Intenta de nuevo...");
                
            }
            
        } while (N<0);
        
        double factorial = 1, aux = 0;
        int n = 1;
        for (int i = 1 ; i<=N ; i++) {
       
            factorial = factorial*i;  
            
            aux = factorial+aux;
     
            System.out.println("El factorial de " + (n) + " es " + factorial);
            
            n++; 
            
        }
        System.out.println();
        System.out.println("La suma de todos los factoriales es: "+aux);   
    }
}