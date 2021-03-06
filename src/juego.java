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
        System.out.println("Número de Personajes: "+ Personaje.getInstancia());
        System.out.println("Número de Héroes: "+Heroes.getInstancia());
        System.out.println("Número de Elfos: "+ Elfo.getInstancia());
        System.out.println("Número de Hobbits: "+Hobbit.getInstancia());
        System.out.println("Número de Humanos: "+ Humano.getInstancia());
        System.out.println("Número de Trasgos: "+Trasgo.getInstancia());
        System.out.println("Número de Orcos: "+ Orco.getInstancia());
        Pelea.pelear(ejercitoHeroes, ejercitoBestias);

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

    


}
