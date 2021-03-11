
import java.util.Random;

public class Personaje {

    protected int vida;
    protected int armadura;
    protected int ataque =0;
    protected String nombre;
    private static int instanciaPersonaje=0;

    public Personaje(int vida, int armadura, String nombre) {
        this.vida = vida;
        this.armadura = armadura;
        this.nombre = nombre;
        Personaje.instanciaPersonaje++;
    }

    public void saludar(){
        System.out.println("Hola soy: " + this.nombre);
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque(Personaje defensor) {
        return this.ataque;
    }

    public int getArmadura() {
        return this.armadura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public static int getInstancia(){
        return Personaje.instanciaPersonaje;
    }

    public int tirarDado(int numeroFinal){
        return (int)(Math.random()*numeroFinal);
    }

    public void disminuirVida(double ataque){
        this.vida -= ataque;
    }

    public void recibirAtaque(Personaje atacante){
        System.out.println("\nAtaque entre: "+atacante.getNombre()+" (Vida: "+atacante.getVida()+") y "+this.nombre+" (Vida "+this.vida+").");
        if(atacante instanceof Heroes){
            ((Heroes)atacante).setAtaque();
        } else if (atacante instanceof Bestias){
            ((Bestias)atacante).setAtaque();
        }

        
        int ataque = atacante.getAtaque(this);
        System.out.println("Ataque: "+ataque);
        if(ataque > this.armadura){
            ataque -= this.armadura;
            this.disminuirVida(ataque);
        }else {
            System.out.println("Ataque fallido");
        }    
        System.out.println("\nFin ataque entre: "+atacante.getNombre()+" (Vida: "+atacante.getVida()+") y "+this.nombre+" (Vida "+this.vida+").");
    }

}
