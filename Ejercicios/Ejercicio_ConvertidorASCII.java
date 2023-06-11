/* Desarrollar un programa que visualice por pantalla todos los caracteres correspondientes a las 
    letras minusculas y su numero equivalente en codigo ASCII, que muestre el codigo ASCII*/
import java.util.Scanner;

public class Caracteres_ASCII {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Codigo ASCII");
        System.out.println();
        
        System.out.println("Tabla ASCII (97 - 122)");
        for (int i = 97 ; i<=122; i++) {
            
            System.out.println(i + " ==> " +(char)i);  
        }
        System.out.println();
        System.out.println("Ingresa un codigo ASCII: ");
        int n = sc.nextInt();
     
        System.out.println("El caracter de " + n + " es " + (char)n);
    }   
}