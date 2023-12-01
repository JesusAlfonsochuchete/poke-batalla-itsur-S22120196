/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokebatalla.pokemones;
      //@JESUS ALFONSO MARTINEZ MARTINEZ
//En este programa puse la mayoria de las cosas no supe muy bien somo poner los ataques 


import java.io.Serializable;
import pokebatalla.batalla.Batalla;
import pokebatalla.batalla.Entrenador;
import pokebatalla.control.FileManager;
import java.io.IOException;




public class Main implements Serializable {
        
    /**
     * @JESUS ALFONSO MARTINEZ MARTINEZ
     */
    public static void main(String[] args) {

        Batalla j = FileManager.cargarPartida();

        if (j == null) {
            Gastly g = new Gastly("TITO");
            Gengar g1 = new Gengar("FEO");
            Vaporeon v = new Vaporeon("ETE SECH");

            Entrenador en1 = new Entrenador("Cris");
            en1.capturarPokemon(g);
            en1.capturarPokemon(v);

            Entrenador en2 = new Entrenador("Alan");
            en2.capturarPokemon(g1);
            en2.capturarPokemon(g);

            j = new Batalla(en1, en2);
        }
        j.desarrollarBatalla();

        if (j.Victorioso()) {
            System.out.println("Desea iniciar una nueva partida");

            char respuesta = 'N';
            try {
                respuesta = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (IOException ex) {
                System.out.println("Error  "
                        + "Intenta de nuevo.");
                ex.printStackTrace();
            }

            if (respuesta == 'S' || respuesta == 's') {
                // Borra el archivo de la partida guardada
                FileManager.eliminarPartida();
                //Pokemons 
                Gastly g = new Gastly("TITO");
                 Gengar g1 = new Gengar("FEO");
                Vaporeon v = new Vaporeon("ETE SECH");
                
                Entrenador nuevoEntrenador1 = new Entrenador("Lupita");
                nuevoEntrenador1.capturarPokemon(v);
                nuevoEntrenador1.capturarPokemon(g);
                
                Entrenador nuevoEntrenador2 = new Entrenador("Chucho");
                nuevoEntrenador2.capturarPokemon(g1);
                nuevoEntrenador2.capturarPokemon(g);
                

                Batalla nuevaBatalla = new Batalla(nuevoEntrenador1, nuevoEntrenador2);
                nuevaBatalla.desarrollarBatalla();
            }
        }
    }
}
   
        ///System.out.println("BIENVENIDOS AL VIDEOJUEGO POKEMON");                             
        /*Vaporeon Vp = new Vaporeon();//Instanciando
        Gastly G1 = new Gastly();// Instanciando
        Gengar G2 = new Gengar();//Instanciando
        System.out.println("Ash tiene 2 pokemones con el y decide enfrentarse contra un rival que tiene 3");
        System.out.println("El primero que saca ash es Gastly y ataca a su oponetente Vaporeon");
        System.out.println("Gastly hace un ataque a Vaporeon");
        G1.atacar(Vp, Gastly.Movimientos.CARGATOXICA);
        System.out.println("Contrataca vaporeon");
        Vp.atacar(G1, Vaporeon.Movimientos.PISTOLA_AGUA);
        System.out.println("Gastly hace un ataque fisico");
        G1.atacar(Vp, Gastly.Movimientos.PuyaNociva);
        System.out.println("Vaporeon hace un ataque Estado");
        Vp.atacar(Vp, Vaporeon.Movimientos.Malicioso);
        System.out.println("Ash cambia de pokemon a Gengar tipo Fantasma/Veneno y ataca a vaporeon");
        G2.atacar(Vp, Gengar.Movimientos.LENGUETAZO);
        
        System.out.println("-----------------------------------------------------");
        
        System.out.println("Ash se dio cuenta que sus pokemones eran un poco debiles contra vaporeon ");
        System.out.println("Decide atacar con los dos pokemones");
        G1.atacar(Vp, Gastly.Movimientos.CARGATOXICA);
        G2.atacar(Vp, Gengar.Movimientos.LENGUETAZO);
        System.out.println("De igual manera Vaporeon contrataca");
        Vp.atacar(G1, Vaporeon.Movimientos.PISTOLA_AGUA);
        Vp.atacar(G2, Vaporeon.Movimientos.Triple_inmersión);
        System.out.println("Vaporeon deja aturdido a Gastly y decide hacer sus ataques finales");
        Vp.atacar(G1, Vaporeon.Movimientos.PISTOLA_AGUA);
        Vp.atacar(G1, Vaporeon.Movimientos.Triple_inmersión);
        System.out.println("Ash se retira la batalla con sus pokemones dañados");
        System.out.println("Los pokemones de ash quedaron asi:" + G1 + " y " + G2);
        System.out.println("El vaporeon quedo con: " +Vp);
        */
               
        

        
     
    

