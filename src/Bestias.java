public class Bestias extends Personaje {

    public Bestias(int vida, int armadura, String nombre, String tipo){
        super(vida, armadura,nombre,tipo);
    }
    
    public void setAtaque(){
        this.ataque = tirarDado(90);
    }

    
}
