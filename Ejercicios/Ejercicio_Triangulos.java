/* Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensones de los lados de un 
triangulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta lo siguiente:

-Si se cumple Pitagoras entonces es un TRIANGULO RECTANGULO
-Si solo dos lados del triangulo son iguales entonces es ISOSCELES
-Si solo los tres lados son iguales entonces es EQUILATERO
-Si no se cumple ninguna de las condiciones anteriores ESCALENO */
import java.util.Scanner;

//Inicio del programa y declaracion de variables
public class Clase2_E1 {
    
    public static void main (String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    float ladoA;
    float ladoB;
    float ladoC;
    boolean rectangulo = false;
            
    // Solicita datos del usuario 
    
    System.out.println("Este programa muestra la clasificacion de un triangulo");
    
    System.out.println("Introduce el valor del lado A: ");
    ladoA = scanner.nextFloat();
    
    System.out.println("Introduce el valor del lado B: ");
    ladoB = scanner.nextFloat();
   
    System.out.println("Introduce el valor del lado C: ");
    ladoC = scanner.nextFloat();
    
    /* Se realizan calculos y se muestran en pantalla, para calcular cual es el lado mas largo comprobamos Pitagoras,
    si se cumple el valor del rectangulo pasa a true.
    */
    
    if (ladoA > ladoB && ladoA > ladoC) {
        
       if ((Math.pow(ladoA,2)) == (Math.pow(ladoB,2)) + (Math.pow(ladoC,2))) {
           rectangulo = true;
       } 
    } else if (ladoB > ladoA && ladoB > ladoC) {
        
        if ((Math.pow(ladoB,2)) == (Math.pow(ladoA,2)) + (Math.pow(ladoC,2))) {
            
            rectangulo = true;
            
        }
    } else if (ladoC > ladoA && ladoC > ladoB) {
        if ((Math.pow(ladoC,2)) == (Math.pow(ladoA,2)) + (Math.pow(ladoB,2))) {
            
            rectangulo = true;
        }
    }
    
    // una vez sabemos si es rectangulo, continuamos con el resto de comprobaciones.Dos lados iguales/
    
    if ((ladoA == ladoB && ladoA != ladoC) ||(ladoA == ladoC && ladoA != ladoB) || (ladoB == ladoC && ladoB != ladoA)) {
     
        if (rectangulo) {
            System.out.println("Es un triangulo rectangulo e isosceles.");
            
            
        } else { 
            System.out.println("Es un triangulo isosceles.");
        }
        
        // tres lados iguales
        
        
    } else if (ladoA == ladoB && ladoB == ladoC) {
        if (rectangulo) {
            
            System.out.println("Es un triangulo rectangulo y escaleno.");
        } else {
            System.out.println("Es un triangulo equilatero.");
        }
    } else {
        if (rectangulo) {
            System.out.println("Es un rectangulo y escaleno.");
        } else {
            System.out.println("Es un triangulo escaleno.");
        }     
    }
    }       
}