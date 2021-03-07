public class Orco extends Bestias {

    public Orco(String nombre){
        super(300,45,nombre);
    }
    
    public void saludar(){
    	System.out.println("Hola soy una Bestia, mi nombre es: "+this.nombre+" y soy un Orco.");
    }
}
