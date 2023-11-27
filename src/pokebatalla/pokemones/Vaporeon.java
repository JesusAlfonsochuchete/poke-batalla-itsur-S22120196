/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.pokemones;

import pokebatalla.movimiento.Malicioso;
import pokebatalla.movimiento.Movimiento;
import pokebatalla.movimiento.PISTOLAAGUA;
import pokebatalla.movimiento.Triple_inmersión;
import java.io.Serializable;



/**
 *
 * @//@JESUS ALFONSO MARTINEZ MARTINEZ
 */
public class Vaporeon extends Pokemon implements Serializable {

    public enum Movimientos{
        PISTOLA_AGUA,
        Malicioso,
        Triple_inmersión,
    }
    
   public String ataqueespecial;

    public Vaporeon() {
        this.tipo = "AGUA";
        this.hp = 130;
        this.ataque = 65;
        this.defensa = 60;
        this.nivel = 1;
        this.precision = 4;
    }

    //Constructor alterno 1
    public Vaporeon(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    //METODOS 
    @Override
    public Enum[] getMovimientos() {
        return Vaporeon.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Charmander. esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Vaporeon.Movimientos movimientoAUtilizar = Vaporeon.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case Malicioso:
                instanciaMovimiento = new Malicioso();
                break;
            case PISTOLA_AGUA:
                instanciaMovimiento = new PISTOLAAGUA();
                break;
            case Triple_inmersión:
                instanciaMovimiento = new Triple_inmersión();
                break;
                    
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);

    }

}
