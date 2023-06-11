package Figuras_de_Superheroes;

public class Figura {
    
    String codigo;
    double precio;
    Superheroe heroe;
    Dimension dimensiones;
    int n;
   
   
    public Figura(String codigo, double precio, Dimension dimensiones, Superheroe heroe){
        
        this.codigo = codigo;
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.heroe = heroe;
        
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setHeroe(Superheroe heroe) {
        this.heroe = heroe;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void setN(int n){
       
       this.n = n;
   }
    
    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public Superheroe getHeroe() {
        return heroe;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }
    
    public int getN(){
       
       return n;
   }
    
    @Override
    public String toString() {
        return "Figura #"+n+ "\nHeroe: " + heroe+"\nCodigo: " + codigo + "\nPrecio: " + precio + " \n\nDimensiones: " + dimensiones;
    }
    
    public void subirPrecio(double cantidad){
        
        precio = precio+cantidad;
    }  
}