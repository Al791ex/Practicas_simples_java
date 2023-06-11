import java.util.Scanner;

/* El programa pide al usuario que introduzca por teclado su nombre y lo muestra por pantalla. A coninuacion se pide que se introduzca por teclado
el valor del radio de una circunferenci de tipo double y muestra la longitud de la circunferencia. Ademas pide que se introduzca por teclado un
numero entero y muestra su cuadrado */

public class Clase3_E1 {
    
    public static void main (String[] args) {
        
    Scanner sc = new Scanner(System.in); // se crea un objeto
    
    System.out.print("Ingresa tu nombre: ");
    String user = sc.nextLine(); // lee un string 
    
    System.out.println("Bienvenido "+ user);
    System.out.println();
    
    System.out.println("Introduce el radio de una circunferencia: ");
    double radio = sc.nextDouble();
        
    double longitud = 2*(radio)*Math.PI;
    
    System.out.println("La longitud de la circunferencia es: " + longitud);
    
    System.out.println("Introduce un numero entero: ");
    int n = sc.nextInt();
    
    System.out.println("El cuadrado de su numero es: " + Math.pow(n,2));
        
    }
    
}