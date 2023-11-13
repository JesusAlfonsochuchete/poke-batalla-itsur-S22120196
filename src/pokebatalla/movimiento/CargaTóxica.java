/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.movimiento;

/**
 *
 * @author Jesus Alfonso Martinez Martinez
 */
public class CargaTóxica extends movimientoespecial {
    public CargaTóxica(){
        this.tipo=TiposDeMovimiento.VENENO;
        this.potencia = 65;
        this.precision = 100;
        this.puntosPoder = 10;
    }
    
}
