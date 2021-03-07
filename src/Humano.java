public class Humano extends Heroes {

    public Humano(String nombre){
        super(180,75,nombre);
    }

    public void saludar(){
    	System.out.println("Hola soy una Heroe, mi nombre es: "+this.nombre+" y soy un Humano.");
    }
    
}
