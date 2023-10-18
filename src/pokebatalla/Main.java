/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokebatalla;
      //@JESUS ALFONSO MARTINEZ MARTINEZ
//En este programa puse la mayoria de las cosas no supe muy bien somo poner los ataques 
import pokebatalla.pokemones.Mew;
import pokebatalla.pokemones.Vaporeon;
import pokebatalla.pokemones.Dragonair;
import pokebatalla.pokemones.Pokemon;
import pokebatalla.pokemones.Gengar;
import pokebatalla.pokemones.Charizard;
import pokebatalla.pokemones.Gastly;



public class Main {
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Mew M1 = new Mew(); //Instanciando               
        Dragonair Dr = new Dragonair();   //Instanciando                     
        Vaporeon Vp = new Vaporeon();//Instanciando
        Gastly G1 = new Gastly();// Instanciando
        Charizard Ch1 = new Charizard();//Instanciando
        Gengar G2 = new Gengar();//Instanciando

        System.out.println("----------------------------");
        Pokemon obj = new Pokemon();
        System.out.println("Ejile un pokemon");
        obj.elejirPokemon("Vaporeon");
        System.out.println("Elije un oponente");
        obj.oponente("Gengar");
        System.out.println("Pelea");
        System.out.println(Vp + " VS " + G2);
        System.out.println("Vaporio atacaka a :" + G2);
        G2.recibirAtake(55);
        G2.estatusBatalla();
        System.out.println("Gengar contra ataque");
        System.out.println(Vp);
        M1.recibirAtake(50);
        M1.estatusBatalla();
        System.out.println("Cambio a Mew por " + Ch1);
        System.out.println("Charizard ataka a " + G2);
        G2.resAtakeEspescial(70);
        G2.estatusBatalla();
        G2.estaVivo();
        System.out.println("---------------------------");
        

        System.out.println(M1);
        System.out.println(Dr);
        System.out.println(Vp);
        System.out.println(G1);
        System.out.println(Ch1);
        System.out.println(G2);

        System.out.println("El estatus actual de Mew es:");
        M1.status();

        System.out.println("El estatus actual de Dragonair es:");
        Dr.status();

        System.out.println("El estatus actual de Vaporeon es:");
        Vp.status();

        System.out.println("El estatus actual de Gastly es:");
        G1.status();

        System.out.println("El estatus actual de Charizard es:");
        Ch1.status();
        System.out.println("El estatus acutal de Gengear es:");
        G2.status();
        
        
        M1.ataqueespecial= "Hipnosis";
        Dr.ataqueespecial= "Danza dragon";
        Vp.ataqueespecial= "Water Absorb";
        G1.ataqueespecial= "Onda toxica";
        Ch1.ataqueespecial= "Sismico";
        G2.ataqueespecial= "Onda tóxica";
        
        System.out.println("Mew tiene un ataque especial que seria: " +M1.ataqueespecial);
        System.out.println("Dragonite tiene un ataque especial que seria: " +Dr.ataqueespecial);
        System.out.println("Vaporio tiene un ataque especial que seria: " +Vp.ataqueespecial);
        System.out.println("Gastly tiene un ataque especial que seria: " +G1.ataqueespecial);
        System.out.println("Charizar tiene un ataque especial que seria: " +Ch1.ataqueespecial);
        System.out.println("Gengar tiene un ataque especial que seria: " +G2.ataqueespecial);

        
        
        
    }

}
