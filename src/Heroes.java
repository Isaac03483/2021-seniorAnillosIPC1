public class Heroes extends Personaje {


    public Heroes(int vida, int armadura, String nombre, String tipo){
        super(vida, armadura, nombre, tipo);
    }

    public void setAtaque(){
        int dado1 = tirarDado(100);
        int dado2 = tirarDado(100);
        if(dado1>=dado2){
            this.ataque = dado1;
        } else {
            this.ataque = dado2;
        }
    }
    
}
