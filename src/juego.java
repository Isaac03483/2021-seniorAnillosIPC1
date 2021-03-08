public class juego {

    private static Bestias[] ejercitoBestias;
    private static Heroes[] ejercitoHeroes;

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
        int nTurnos;
        System.out.println("\tInicia el combate.");
        nTurnos = 0;
        do{
            
            System.out.println("\nTurno: "+(nTurnos+1));
            System.out.println("Lucha entre: "+ ejercitoHeroes[nTurnos].getNombre() +" (Vida: "+ ejercitoHeroes[nTurnos].getVida() +") y "+ ejercitoBestias[nTurnos].getNombre() +" (Vida: "+ ejercitoBestias[nTurnos].getVida() +").");
            ejercitoHeroes[nTurnos].setAtaque();
            System.out.println("\nAtaque: "+ejercitoHeroes[nTurnos].getAtaque());
            if(ejercitoHeroes[nTurnos].getTipo() == "Elfo" && ejercitoBestias[nTurnos].getTipo() == "Orco"){
                ejercitoHeroes[nTurnos].rabia();
                System.out.println("Ataque aumentado por rabia: "+ejercitoHeroes[nTurnos].getAtaque());
            } else if(ejercitoHeroes[nTurnos].getTipo() == "Hobbit" && ejercitoBestias[nTurnos].getTipo() == "Trasgo"){
                ejercitoHeroes[nTurnos].miedo();
                System.out.println("Ataque disminuido por miedo: "+ejercitoHeroes[nTurnos].getAtaque());
            }
            nTurnos++;
        }while(nTurnos < ejercitoHeroes.length);
    }


}
