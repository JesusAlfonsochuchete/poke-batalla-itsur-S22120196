

package pokebatalla.pokemones;


/**
 *
 *@JESUS ALFONSO MARTINEZ MARTINEZ
 */
import java.util.List;


public class Pokemon {

    //Atributos
    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    List<String> habilidades;

    Pokemon() {
    }

    //Métodos
    void atacar(Pokemon enemigo) {
        
        System.out.println("Atacando a un: " + enemigo.getClass().getName());
        //TODO: Aqui va la logica para causar daño al enemigo.

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{tipo:" + tipo + " hp:" + hp + "}";
    }

    public String toSring() {
        return this.getClass().getName() + "{Su ataque es de:" + "Y su defensa es de:" + defensa + "}";
    }

    public void status() {
        System.out.println("Defensa de " + defensa);
        System.out.println("Ataque de: " + ataque);
        System.out.println("Su vida es de: " + hp);
                  
    }
    //version uno
    public void recibirAtaque(int poderAtaque) {
        int dano = poderAtaque - defensa;
        if (dano > 0) {
            hp -= dano;
        }
    }

    public  boolean estaVivo() {
        return hp > 0;
    }

    public void elejirPokemon(String poke) {
        if (poke.equalsIgnoreCase("Mew")) {
            System.out.println("Haz elejido a Mew");
        } else if (poke.equalsIgnoreCase("Gengar")) {
            System.out.println("Haz elejido a Gengar");
        } else if (poke.equalsIgnoreCase("Vaporeon")) {
            System.out.println("Haz elejido a Vaporeon");
        } else if (poke.equalsIgnoreCase("Charizard")) {
            System.out.println("Haz elejido a Charizard");
        } else if (poke.equalsIgnoreCase("Dragonair")) {
            System.out.println("Haz elejido a Dragonair");
        } else if (poke.equalsIgnoreCase("Gastly")) {
            System.out.println("Haz elejido a Gastly");
        } else {
            System.out.println("No cuentas con el pokemos elejido");
        }
    }

    public void oponente(String opo) {
        if (opo.equalsIgnoreCase("Mew")) {
            System.out.println("Oponente Mew");
        } else if (opo.equalsIgnoreCase("Gengar")) {
            System.out.println("Oponente Gengar");
        } else if (opo.equalsIgnoreCase("Vaporeon")) {
            System.out.println("Oponente Vaporeon");
        } else if (opo.equalsIgnoreCase("Charizard")) {
            System.out.println("Oponente Charizard");
        } else if (opo.equalsIgnoreCase("Dragonair")) {
            System.out.println("Oponente Dragonair");
        } else if (opo.equalsIgnoreCase("Gastly")) {
            System.out.println("Oponente Gastly");
        } else {
            System.out.println("Oponente NO encontrado");
        }
    }
    //version dos
    public void recibirAtake(int canAta) {
        int da = (canAta - defensa);
        hp -= da;
        if (canAta > 50) {
            System.out.println("El poder de ataque es demasido");
            System.out.println("Vaporeon utilizo Water Absorb");
            resAtakeEspescial(canAta);
        } else {
            if (hp <= 0) {
                hp = 0;
                defensa=0;
                System.out.println("HP: " + hp);
                System.out.println("El pokemon no puede continuar");
            } else {
                System.out.println("HP: " + hp + " restante");
                System.out.println("Continua el combate");
            }
        }
    }
    //para ataque especial
    public void resAtakeEspescial(int a) {
        int da = (a - (defensa / 2));
        hp -= da;
        if (hp <= 0) {
            hp = 0;
            defensa=0;
            System.out.println("HP: " + hp);
            System.out.println("El pokemon no puede continuar");
        } else {
            System.out.println("HP: " + hp + " restante");
            System.out.println("Continua el combate");
        }
    }
    //estado de saludo y defensa
    public void estatusBatalla()
    {
        System.out.println("Defensa:" + defensa);
        System.out.println("Hp: " + hp);
    }
    public void ataqueespecial(){
        System.out.println(nombre+ "realizo un ataque especial");
        
    }
}
