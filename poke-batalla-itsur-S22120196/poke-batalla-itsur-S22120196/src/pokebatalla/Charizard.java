/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla;

import java.util.List;

/**
 *
 * //@JESUS ALFONSO MARTINEZ MARTINEZ
 */
public class Charizard extends Pokemon {

    String ataqueespecial;
    
    Charizard(){
      this.tipo=  "FUEGO/VOLADOR";
      this.hp= 78;
      this.ataque= 84;
      this.defensa= 78;
      this.nivel= 2;
      this.precision= 7;
    }
public Charizard(String nombre){
    this();
    this.nombre= nombre;
}    

    public String getNombre() {
        return nombre;
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }
 
}
