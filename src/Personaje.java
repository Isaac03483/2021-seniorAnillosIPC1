import java.util.Random;

public class Personaje {

    protected int vida;
    protected int armadura;
    protected int ataque =0;
    protected String nombre;
    protected String tipo;

    public Personaje(int vida, int armadura, String nombre, String tipo) {
        this.vida = vida;
        this.armadura = armadura;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void saludar(){
        System.out.println("Hola soy: " + this.nombre);
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getArmadura() {
        return this.armadura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void rabia(){
        this.ataque = this.ataque + 10;
    }

    public void miedo(){
        this.ataque -=5;
    }

    public int tirarDado(int numeroFinal){
        return (int)(Math.random()*numeroFinal);
    }

    public void disminuirVida(int ataque){
        this.vida -= ataque;
    }

}
