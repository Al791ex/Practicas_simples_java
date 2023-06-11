package Figuras_de_Superheroes;

public class Superheroe {
    
    //Atributos 
    String nombre;
    String poder;
    boolean capa;
    int n;
    
    public Superheroe(){
        
    }
    
    public Superheroe(String nombre){
        
    }

   public void setNombre(String nombre){
       
       this.nombre = nombre;
   }
    
   public void setPoder(String poder){
       
       this.poder = poder;
   }
   
   public void setCapa(boolean capa){
       this.capa = capa;
       
   }
   
   public void setN(int n){
       
       this.n = n;
   }
   
   public String getNombre(){
       
       return nombre;
   }
   
   public String getPoder(){
       
       return poder;
   }
   
   public Boolean getCapa(){
       
       return capa;
   }
   
   public int getN(){
       
       return n;
   }

    @Override
    public String toString() {
        return "Superheroe # "+n+"\nNombre de heroe: " + nombre + "\nPoder: " +poder + "\nCapa: " + capa;
    }
   
}