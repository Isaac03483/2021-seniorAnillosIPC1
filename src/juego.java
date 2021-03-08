import java.util.Scanner;

public class juego {

    private static Bestias[] ejercitoBestias;
    private static Heroes[] ejercitoHeroes;
    public static Scanner entrada = new Scanner(System.in);

    private static int Cantidad = 5;
    
    public juego(){

        ejercitoBestias = new Bestias[Cantidad];
        ejercitoHeroes = new Heroes[Cantidad];

    }

    public void jugar(){
        System.out.println("Bienvenido al juego del señor de los anillos: \n\n");
        inicializarHeroes();
        inicializarBestias();
        presentarHeroes();
        presentarBestias();

        pelear();

    }

    public static void inicializarHeroes(){
        ejercitoHeroes[0]= new Elfo("legolas");
        ejercitoHeroes[1]= new Hobbit("frodo");
        ejercitoHeroes[2] = new Humano("Aragon");
        ejercitoHeroes[3]= new Elfo("Pieck");
        ejercitoHeroes[4]= new Hobbit("Alice");
    }

    public static void inicializarBestias(){
        ejercitoBestias[0] = new Orco("Juan");
        ejercitoBestias[1] = new Trasgo("Amy");
        ejercitoBestias[2] = new Orco("Came");
        ejercitoBestias[3] = new Trasgo("Mosh");
        ejercitoBestias[4] = new Orco("Castle");
    }

    public static void presentarHeroes(){
        for(int i = 0; i < ejercitoHeroes.length; i++){
            ejercitoHeroes[i].saludar();
        }
        System.out.println("");
    }

    public static void presentarBestias(){
        for(int i = 0; i < ejercitoBestias.length; i++){
            ejercitoBestias[i].saludar();
        }
        System.out.println("");
    }

    public static void pelear(){
        char avanzar;
        int nTurnos;
        System.out.println("\tInicia el combate.");
        nTurnos = 0;
        do{
            System.out.print("\nIngrese cualquier letra o número para avanzar al encuentro: ");
            avanzar = entrada.nextLine().charAt(0);
            //iniciamos la batalla con el turno de los heroes
            System.out.println("\nTurno: "+(nTurnos+1));
            System.out.println("Lucha entre: "+ ejercitoHeroes[nTurnos].getNombre() +" (Vida: "+ ejercitoHeroes[nTurnos].getVida() +") y "+ ejercitoBestias[nTurnos].getNombre() +" (Vida: "+ ejercitoBestias[nTurnos].getVida() +").");
            ejercitoHeroes[nTurnos].setAtaque(); //tiramos los dados y le damos un ataque aleatorio al heroe del 1 al 100
            System.out.println("\nAtaque: "+ejercitoHeroes[nTurnos].getAtaque());
            if(ejercitoHeroes[nTurnos].getTipo() == "Elfo" && ejercitoBestias[nTurnos].getTipo() == "Orco"){ //hacemos la comparación para ver si se está enfrentando un elfo con un orco
                ejercitoHeroes[nTurnos].rabia(); //si está enfrentandose a un orco entonces el elfo adiquiere rabia que mejora su ataque
                System.out.println("Ataque aumentado por rabia: "+ejercitoHeroes[nTurnos].getAtaque()); //mostramos el ataque potenciado
            } else if(ejercitoHeroes[nTurnos].getTipo() == "Hobbit" && ejercitoBestias[nTurnos].getTipo() == "Trasgo"){ //hacemos una comparación para ver si se está enfrentando un hobbir con un trasgo 
                ejercitoHeroes[nTurnos].miedo(); //si está enfrentandose entonces el hobbit disminuye su ataque por el miedo que le tiene
                System.out.println("Ataque disminuido por miedo: "+ejercitoHeroes[nTurnos].getAtaque()); //mostramos el ataque disminuido
            }

            if(ejercitoHeroes[nTurnos].getAtaque()> ejercitoBestias[nTurnos].getArmadura()){ //el ataque solo es permitido si el ataque es mayor a la armadura
                ejercitoBestias[nTurnos].disminuirVida((ejercitoHeroes[nTurnos].getAtaque()-ejercitoBestias[nTurnos].getArmadura())); //la vida disminuída es la diferencia que hay en el ataque con la armadura
                System.out.println("Fin Lucha entre: "+ ejercitoHeroes[nTurnos].getNombre() +" (Vida: "+ ejercitoHeroes[nTurnos].getVida() +") y "+ ejercitoBestias[nTurnos].getNombre() +" (Vida: "+ ejercitoBestias[nTurnos].getVida() +").");
            } else { //si no es mayor a la armadura no hace efecto el golpe
                System.out.println("Ataque fallido.");
                System.out.println("Fin Lucha entre: "+ ejercitoHeroes[nTurnos].getNombre() +" (Vida: "+ ejercitoHeroes[nTurnos].getVida() +") y "+ ejercitoBestias[nTurnos].getNombre() +" (Vida: "+ ejercitoBestias[nTurnos].getVida() +").");
            }

            System.out.println("\nTurno: "+(nTurnos+1));
            System.out.println("Lucha entre: "+ ejercitoBestias[nTurnos].getNombre() +" (Vida: "+ ejercitoBestias[nTurnos].getVida() +") y "+ ejercitoHeroes[nTurnos].getNombre() +" (Vida: "+ ejercitoHeroes[nTurnos].getVida() +").");
            ejercitoBestias[nTurnos].setAtaque();
            System.out.println("\nAtaque: "+ejercitoBestias[nTurnos].getAtaque());

            if(ejercitoBestias[nTurnos].getAtaque()> ejercitoHeroes[nTurnos].getArmadura()){ //el ataque solo es permitido si el ataque es mayor a la armadura  
            ejercitoHeroes[nTurnos].disminuirVida((ejercitoBestias[nTurnos].getAtaque() -ejercitoHeroes[nTurnos].getArmadura()));
            System.out.println("Fin Lucha entre: "+ ejercitoHeroes[nTurnos].getNombre() +" (Vida: "+ ejercitoHeroes[nTurnos].getVida() +") y "+ ejercitoBestias[nTurnos].getNombre() +" (Vida: "+ ejercitoBestias[nTurnos].getVida() +").");
           
            } else { //si no es mayor a la armadura no hace efecto el golpe
                System.out.println("Ataque fallido.");
                System.out.println("Fin Lucha entre: "+ ejercitoBestias[nTurnos].getNombre() +" (Vida: "+ ejercitoBestias[nTurnos].getVida() +") y "+ ejercitoHeroes[nTurnos].getNombre() +" (Vida: "+ ejercitoHeroes[nTurnos].getVida() +").");
            }

            

            nTurnos++;
        }while(nTurnos < ejercitoHeroes.length);
    }


}
