import java.util.Scanner;

/* Una persona adquirio un producto para pagar en 20 meses. El primer mes paga 10 euros. el segundo 20 euros, el tercero 40 euros y asi sucesivamente.
Realizar un programa para determinar cuanto debe pagar mensualmente y el total de lo que pagara despues de los 20 meses. Este programa puede servir
para calcular otras compras y con diferentes plazos*/

public class Examen_1P2 {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        char l;
        
        do {
            float pagototal = 0, pagofinal = 0, aux = 1;
            
        
        System.out.print("Ingresa el NOMBRE del producto a calcular: ");
        String producto = sc.nextLine();
        
        System.out.print("Ingrese el pago mensual de la cuota en EUROS: ");
        float pago = sc.nextFloat();
        
        System.out.print("Ingresa los MESES de duracion de la cuota: ");
        int meses = sc.nextInt();
        System.out.println();
        
        System.out.println("Producto seleccionado: "+ ">> "+producto+" <<");
        
    
            for (int i = 1 ; i<=meses ; i++){
                
                pagototal = pago*aux;
               
                aux = aux*2;
                System.out.println("El mes numero " + i + " tendra que pagar " + pagototal + " Euros");
                
                pagofinal = pagototal+pagofinal;
                
           
        }
        
        System.out.println();
        System.out.println("El total a pagar luego de los " + meses+ " meses es "+ pagofinal +"Euros");
        System.out.println();
        
        
        System.out.println("Desea seguir calculando?");
        
        System.out.print("Presione (S) para continuar, de lo contrario ingrese cualquier numero: ");
        l = sc.next().charAt(0);
        sc.nextLine();
        
        } while (l == 'S');
        
        System.out.println("FINALIZANDO PROGRAMA...");
         
    }
}