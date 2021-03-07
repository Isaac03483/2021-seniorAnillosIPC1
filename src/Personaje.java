public class Personaje {

    protected int vida;
    protected int armadura;
    protected int ataque;
    protected String nombre;

    public Personaje(int vida, int armadura, int ataque, String nombre) {
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
        this.nombre = nombre;

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

}
