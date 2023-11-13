/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.movimiento;

import pokebatalla.pokemones.Pokemon;

/**
 *
 * @author Jesus Alfonso
 */
public abstract class Movimiento {

    enum TiposDeMovimiento {
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR,     
    }

    //Atributos
    protected TiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;

    //Métodos
    public abstract void utilizar(Pokemon usuario, Pokemon objetivo);
  
}