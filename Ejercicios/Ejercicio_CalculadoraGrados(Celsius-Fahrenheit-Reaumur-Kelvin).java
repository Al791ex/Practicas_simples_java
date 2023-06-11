import java.util.Scanner;

public class P_1 {

    public static void main (String[] args){
       
        
        // sc.next().chrAt(0); permite recoger el primer caracter 
        
      
      Scanner sc = new Scanner(System.in);
      char tecla;
      double cantidad;
      int grado , grado2;
      
      do{
        System.out.println("Calculadora de unidades de temperatura");
        System.out.println("");
        
      do {
            System.out.println("Ingresa la cantidad a en # convertir: ");
            cantidad = sc.nextDouble();
        
            System.out.println("Indica la unidad del grado a convertir");
      
            System.out.println("1. Celsius");
            System.out.println("2. Kelvin");
            System.out.println("3. Reaumur");
            System.out.println("4. Fahrenheit"); 
             grado = sc.nextInt ();
             if (grado>4 || grado<1) {
            System.out.println("Opcion incorrecta, digite nuevamente...");
            }
      } while (grado>4 || grado<1); 
      
         
      do {
            System.out.println("1. Celsius");
            System.out.println("2. Kelvin");
            System.out.println("3. Reaumur");
            System.out.println("4. Fahrenheit"); 
            grado2 = sc.nextInt ();
            
            if (grado2>4 || grado2<1) {
            System.out.println("Opcion incorrecta, digite nuevamente...");
            }
            
      } while (grado2>4 || grado2<1);
      
       
      
      switch (grado){
          
          case 1: 
              
              if (grado2 == 1) {
                  
                   System.out.println(cantidad + " Grados Celsius equivalen a "+ cantidad + " grados Celsius");
              }
              
               if (grado2 == 2) {
                  
                 double ck = cantidad+273.15; 
                 System.out.println(cantidad + " Grados Celsius equivalen a "+ ck + " grados Kelvin");
              } 
              
              if (grado2 == 3) {
                  
                 double cr = cantidad*4/5; 
                 System.out.println(cantidad + " Grados Celsius equivalen a "+ cr+ " grados Reaumur");
              } 
              
              if (grado2 == 4) {
                  
                 double cf = (cantidad*1.8)+32; 
                 System.out.println(cantidad + " Grados Celsius equivalen a "+ cf + " Fahrenheit");
              } 
              break;
           
            case 2: 
              
              if (grado2 == 1) {
                  double kc = cantidad-273.15;
                  System.out.println(cantidad + " Grados Kelvin equivalen a "+ kc + " grados Celsius");
              }    
              if (grado2 == 2) {
                 
                 System.out.println(cantidad + " Grados Kelvin equivalen a "+ cantidad + " grados Kelvin");
              } 
              
              if (grado2 == 3) {
                  
                 double ck = cantidad+273.15; 
                 System.out.println(cantidad + " Grados Kelvin equivalen a "+ ck + " grados Reaumur");
              } 
    
              if (grado2 == 4) {
                  
                 double kf = cantidad*(9/5)-459.67; 
                 System.out.println(cantidad + " Grados Kelvin equivalen a "+ kf + " Fahrenheit");
              }
              break;
            
            case 3: 
              
              if (grado2 == 1) {
                  double rc = cantidad*5/4;
                  System.out.println(cantidad + " Grados Reaumur equivalen a "+ rc + " grados Celsius");
              }    
              if (grado2 == 2) {
                 double rk = cantidad*5/4+273;
                 System.out.println(cantidad + " Grados Reaumur equivalen a "+ rk + " grados Kelvin");
              } 
              
              if (grado2 == 3) {
                 System.out.println(cantidad + " Grados Reaumur equivalen a "+ cantidad + " grados Reaumur");
              }
              
              if (grado2 == 4) {
                  
                 double rf = cantidad*9/4+32; 
                 System.out.println(cantidad + " Grados Reaumur equivalen a "+ rf + " Fahrenheit");
              } 
              break;
            
            case 4: 
              
              if (grado2 == 1) {
                 double fc = (cantidad-32)/1.8;
                 System.out.println(cantidad + " Grados Fahrenheit equivalen a "+ fc + " grados Celsius");
              }    
              if (grado2 == 2) {
                 
                 double fk = 5/9*(cantidad -32)+273.15;
                 System.out.println(cantidad + " Grados Fahrenheit equivalen a "+ fk + " grados Kelvin");
              } 
              
              if (grado2 == 3) {
                 
                 double fr= 5/9*(cantidad -32)+273.15;
                 System.out.println(cantidad + " Grados Fahrenheit equivalen a "+ fr + " grados Reaumur");
              }
                 
              if (grado2 == 4) {
                 System.out.println(cantidad + " Grados Fahrenheit equivalen a "+ cantidad + " Fahrenheit");
              }
              break;
              
            // intentar hacer funciones  
      } 
          System.out.println();
        System.out.println("Desea continuar calculando o salir?");
        System.out.println("Presione (S) para continuar o cualquier tecla para salir... ");
        tecla = sc.next().charAt(0);
       
          
      } while (tecla == 'S');

    }
}