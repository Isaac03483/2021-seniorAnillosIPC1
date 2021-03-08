public class Trasgo extends Bestias{

    public Trasgo(String nombre){
        super(325,46,nombre, "Trasgo");
    }
    
    @Override
    public void saludar(){
    	System.out.println("Hola soy una Bestia, mi nombre es: "+this.nombre+" y soy un trasgo.");
    }
}
