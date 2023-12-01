/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.batalla;

/**
 *
 * @author JESUS ALFONSO MARTINEZ MARTINEZ
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import pokebatalla.pokemones.Pokemon;

public class Entrenador implements Serializable{

    protected String nombre;
    protected List<Pokemon> pokemonsCapturados;
    protected Pokemon pokemonActual;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemonsCapturados = new ArrayList<>();
        this.pokemonsCapturados = new ArrayList<>();
    }

    public boolean capturarPokemon(Pokemon p) {
        return pokemonsCapturados.add(p);
    }


    public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordinalMovimiento) {
        try {
        if (pokemonActual == null) {
            throw new NullPointerException("No hay un Pokémon actualmente seleccionado.");
            
        }

        if (ordinalMovimiento < 0 || ordinalMovimiento >= pokemonActual.getMovimientos().length) {
            throw new IllegalArgumentException("El ordinal de movimiento no es válido.");
           
        }

        this.pokemonActual.atacar(oponente, ordinalMovimiento);
    }catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        
    }

    public boolean estaDerrotado() {
        for (Pokemon pokemon : pokemonsCapturados) {

            if (pokemon.gethp() > 0) {
                return false;
            }
        }
        return true;
    }


    public String getNombre() {
        return nombre;
    }

    public Pokemon getPokemonActual() {
        return pokemonActual;
    }

    public void setPokemonActual(Pokemon p) {
       this. pokemonActual = p;
    }

    public List<Pokemon> getPokemonsCapturados() {
        return pokemonsCapturados;
    }
}