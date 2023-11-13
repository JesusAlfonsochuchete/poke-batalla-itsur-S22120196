/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokebatalla.pokemones;
      //@JESUS ALFONSO MARTINEZ MARTINEZ
//En este programa puse la mayoria de las cosas no supe muy bien somo poner los ataques 


import pokebatalla.batalla.Batalla1;
import pokebatalla.batalla.Entrenador;




//Es cuestion de al momento que pongamos un pokemon al mismo tiempo pongamos su ataque especial
public class Main {
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Gastly g = new Gastly("TITO");
      Gengar g1 = new Gengar("FEO");
      Vaporeon v = new Vaporeon("ETE SECH");
      
      Entrenador en1 = new Entrenador("Cris");
      en1.capturarPokemon(v);
      en1.capturarPokemon(g);
      
      Entrenador en2 = new Entrenador("AlAN");
      en2.capturarPokemon(g1);
      en2.capturarPokemon(g);
      
      Batalla1 z = new Batalla1(en1, en2);
        z.desarrollarBatalla();
        
        
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
               
        

        
     
    }

}
