import javax.swing.JOptionPane;
public class Funciones { 
   
    public static void main(String [] args){
        
        int y;
        double n1, n2 = 0;
            //Menu de opciones
         do {
             String [] operaciones = { "Suma (+)", "Resta (-) ","Multiplicacion (*)","Division (/)", "Potenciacion (^)", "Raiz Cuadrada (√)"};
         
         int x = JOptionPane.showOptionDialog(null, "Selecciona un boton", "CALCULADORA",
                 JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operaciones, operaciones[0]);
         
         //Asignacion de valor a n1 y n2
         if(x == 5){
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
         } else{
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
         }
         //Llamada de las funciones en los botones
          
         switch (x){
             
             case 0 -> {
                 double suma = suma(n1,n2);
                 JOptionPane.showMessageDialog(null, "El resultado de la operacion de " + n1 +" + "+ n2 + " = "+suma);
             }
             
             case 1 -> {
                 double resta = resta(n1,n2);
                 JOptionPane.showMessageDialog(null, "El resultado de la operacion de " + n1 + " - " + n2 + " = "+resta);
             }
             
             case 2 -> {
                 double multiplicacion = multiplicacion(n1,n2);
                 JOptionPane.showMessageDialog(null, "El resultado de la operacion de " + n1 +" * " + n2 + " = "+multiplicacion);
             }
             
             case 3 -> {
                 if (n2 == 0 || n1 == 0){
                     
                     JOptionPane.showMessageDialog(null, "OPERACION INVALIDA", "AVISO", JOptionPane.WARNING_MESSAGE);
                 }else{
                     double division = division(n1,n2);
                     JOptionPane.showMessageDialog(null, "El resultado de la operacion de " + n1 +" / "+ n2 + " = "+division);
                 }
             }
             case 4 -> {
                 double potencia = potencia(n1,n2);
                 JOptionPane.showMessageDialog(null, "El resultado de la operacion de " + n1 +" ^ "+ n2 + " = "+potencia);
             }
             case 5 -> {
                 double raiz = raiz(n1);
                 JOptionPane.showMessageDialog(null, "El resultado de la operacion de √" + n1+ " = "+raiz);
             }
         }
         y = JOptionPane.showConfirmDialog(null, "Quieres seguir", "AVISO", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE );
         
         } while (y == 0); 
    }
    
    
    //Definicion de las funciones
    
   public static double suma(double n1, double n2){
       
       double suma = n1+n2;
       
       return suma;
   }
   
   public static double resta(double n1, double n2){
       
       double resta = n1-n2;
       
       return resta;
   }
   
   public static double multiplicacion(double n1, double n2){
       
       double multiplicacion = n1*n2;
       
       return multiplicacion;
   }
   
   public static double division (double n1, double n2){
       
        double division = n1/n2;

       return division;
   }
   
   public static double potencia(double n1, double n2){
       
       double potencia = Math.pow(n1, n2);
       
       return potencia;
   }
   
   public static double raiz(double n1){
       
       double raiz = Math.sqrt(n1);
       
       return raiz;
   }
}