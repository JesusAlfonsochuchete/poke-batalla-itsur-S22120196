
package pokebatalla.pokemones;

import pokebatalla.*;
import java.util.List;

/**
 *
 * //@JESUS ALFONSO MARTINEZ MARTINEZ
 */
public class Mew  extends Pokemon{

    String ataqueespecial;

    //Constructor default
     Mew() {
        this.tipo = "PSIQUICO";
        this.hp = 10;
        this.ataque = 100;
        this.defensa = 100;
        this.nivel = 1;
        this.precision = 4;
        
        
    }
//Constructor alterno
public Mew(String nombre){
    this();
    this.nombre = nombre;
    
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



