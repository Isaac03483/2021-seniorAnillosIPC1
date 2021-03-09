
public class Hobbit extends Heroes {

    /* constructor */
    public Hobbit(String nombre){
        super(200, 40, nombre, "Hobbit");
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un Heroe, mi nombre es: " + this.nombre+" y soy un Hobbit.");
    }

    @Override
    public void cambiarAtaque(){
        this.ataque -=5;
    }
    
    
}
