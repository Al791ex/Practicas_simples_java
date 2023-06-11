import java.util.Scanner;

/*Crea una aplicacion que permita adivinar un numero. La aplicacion genera un numero aleatorio del uno al 100. A continuacion va pidiendo numeros
y respondiendo si el numero a adivinar es mayor o menor que el introducido, ademas de los intentos que te quedan (10 intentos para acertarlo.
El programa termina cuando se acierta el numero, ademas te dice en cuantos intentos lo haz acertado, si se llega al limite de intentos te muestra
el numero que habias puesto para adivinar. El usuario adivinara el numero
*/
public class Examen_1 {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adivina el numero...");
        
        float x = 44, n;
        int contador = 1;
        do {
            System.out.print("Ingresa un numero: ");
            n = sc.nextFloat();
            System.out.println("Este es tu intento numero "+ contador);
            if (n>x){
                
                System.out.println("El numero que BUSCAS es MENOR que el INTRODUCIDO ");
            } 
            if (n<x) {
                System.out.println("El numero que BUSCAS es MAYOR que el INTRODUCIDO");
            }
            
            if (n == x) {
                System.out.println("Henorabuena!! haz acertado el numero en "+contador+ " intentos");
                break;
            } 
           
            contador++;
            
            if (contador == 11) {
                
                System.out.println("Haz consumido todos tus intentos, el numero a adivinar era "+ x);
            }
        } while (contador<=10);
        
        
        
        
        
        
        
    }
    
}