public class Elfo extends Heroes {

    public Elfo(String nombre){
        super(250, 60, nombre, "Elfo");
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un Heroe, mi nombre es: " + this.nombre+" y soy un Elfo.");
    }


}
