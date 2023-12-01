/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.pokemones;

import pokebatalla.movimiento.CargaTóxica;
import pokebatalla.movimiento.Movimiento;
import pokebatalla.movimiento.Puya_nociva;
import pokebatalla.movimiento.Rabia;
import java.io.Serializable;
        
/**
 *
 * @JESUS ALFONSO MARTINEZ MARTINEZ
 */
public class Gastly extends Pokemon implements Serializable {
    

    public enum Movimientos{
        CARGATOXICA,
        PuyaNociva,
        Rabia,
        
    }
    public String ataqueespecial;
    
    public Gastly(){
        this.tipo= "FANTASMA/VENENO";
        this.hp = 5;
        this.ataque= 35;
        this.defensa= 30;
        this.nivel= 1;
        this.precision= 5;
    }
     //Constructor alterno 1
    public Gastly(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    //METODOS 
    @Override
    public Enum[] getMovimientos() {
        return Gastly.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Gastly esta dormido no es cierto esta muerto :( y no puede realizar mas movimientos.");
            return;
        }

        Gastly.Movimientos movimientoAUtilizar = Gastly.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case CARGATOXICA:
                instanciaMovimiento = new CargaTóxica();
                break;
            case  PuyaNociva:
                instanciaMovimiento = new Puya_nociva();
                break;
            case Rabia:
                instanciaMovimiento = new Rabia();
                break;
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);

    }

}

