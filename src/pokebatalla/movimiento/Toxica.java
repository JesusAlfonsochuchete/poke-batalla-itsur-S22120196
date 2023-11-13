/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.movimiento;

/**
 *
 * @author Jesus Alfonso Martinez Martinez
 */
public class Toxica extends MovimientoEstado {
   public Toxica(){
     this.tipo=TiposDeMovimiento.VENENO;
     this.potencia=0;
     this.precision=90;
     this.puntosPoder=10;
   } 
}
