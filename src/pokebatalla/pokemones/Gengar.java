/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.pokemones;


import pokebatalla.movimiento.CargaTóxica;
import pokebatalla.movimiento.Lenguetazo;
import pokebatalla.movimiento.Movimiento;
import pokebatalla.movimiento.Toxica;
import java.io.Serializable;


/**
 *
 *///@JESUS ALFONSO MARTINEZ MARTINEZ
 //
public class Gengar extends Pokemon implements Serializable {
public enum Movimientos{
        CARGATOXICA,
        LENGUETAZO,
        Toxico,
    }
    public Gengar(){
        
        
        this.tipo= "FANTASMA/VENENO";
        this.hp = 60;
        this.ataque = 65;
        this.defensa = 60;
        this.nivel = 1;
        this.precision = 7;
    }

    //Constructor alterno 1
    public Gengar(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    //METODOS 
    @Override
    public Enum[] getMovimientos() {
        return Gengar.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Charmander. esta madreado a morir y eso que esta muerto y no puede realizar mas movimientos.");
            return;
        }

        Gengar.Movimientos movimientoAUtilizar = Gengar.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case LENGUETAZO:
                instanciaMovimiento = new Lenguetazo();
                break;
            case CARGATOXICA:
                instanciaMovimiento = new CargaTóxica();
                break;
            case Toxico:
                instanciaMovimiento = new Toxica();
                break;
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);

    }

}
