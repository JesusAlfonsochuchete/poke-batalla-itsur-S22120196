
package pokebatalla.batalla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import pokebatalla.control.FileManager;
import pokebatalla.pokemones.Pokemon;

/**
 *
 * @author JESUS ALFONSO MARTINEZ MARTINEZ
 */
public class Batalla implements Serializable {
      protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    private boolean primerAtaqueRealizado = false;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
        
    }
    public boolean HubounVictorioso() {
        return (entrenador1.estaDerrotado() || entrenador2.estaDerrotado());
    }

    public void salvarProgreso() {
        FileManager.guardarPartida(this);
    }
    public void desarrollarBatalla() {
        System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
        System.out.println("La batalla a empezado");
        System.out.println("Los que pelearan son: ");
        System.out.println(entrenador1.getNombre() + "    V.S   " + entrenador2.getNombre());

        System.out.println("");
       do {
            try {
                eligirPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solo puedes elegir entre  " + "[" + entrenador1.getPokemonsCapturados().size() + "]" + "  Elige alguno de tus Pokemons");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                eligirPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solamente cuentas con:  " + "("+ entrenador2.getPokemonsCapturados().size() + ")" + "  Elige alguno de tus Pokemons");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);
        

        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

            System.out.println("Turno del entrenador: " + entrenadorEnTurno.getNombre());
            
            if (oponente.getPokemonActual() == null) {
                System.out.println("No hay un Pokémon  seleccionado para el oponente");
                return;
            }
             seleccionarAtaque(entrenadorEnTurno, oponente.getPokemonActual());
            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                cambiarPokemon(entrenadorEnTurno);

                // Repetir el turno del entrenador que no desea cambiar de Pokémon
                while (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                    System.out.println("Este entrenador no puede avanzar sin cambiar de Pokémon.");
                    cambiarPokemon(entrenadorEnTurno);
                }
            }

            if (oponente.estaDerrotado()) {
                System.out.println("¡El entrenador " + oponente.getNombre() + " ha sido derrotado!");
                System.out.println("'''''''''''''''''''LA BATALLA A FINALIZADO''''''''''''''");
                batallaFinalizada = true; 
            } else {
                salvarProgreso();
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }

    private void eligirPokemon(Entrenador entrenadorEnturno) {
        int idx = 1;
        System.out.println("******************************");
        for (Pokemon pokemon : entrenadorEnturno.getPokemonsCapturados()) {
            System.out.println(idx + ".- " + pokemon.getClass().getSimpleName() + " hp: " + pokemon.gethp() + "  defensa: " + pokemon.getDefensa() + "  nivel: " + pokemon.getNivel());
            idx++;
            System.out.println("********************************");
        }
        
        System.out.println("");
        System.out.println("Elige un  pokemon " + entrenadorEnturno.getNombre());

        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Pokemon pokemonSeleccionado = entrenadorEnturno.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);
        entrenadorEnturno.setPokemonActual(pokemonSeleccionado);
    }

  
    private void seleccionarAtaque(Entrenador entrenadorEnturno, Pokemon oponente) {

        Pokemon pokemonActual = entrenadorEnturno.getPokemonActual();

        System.out.println("'------------------------------------------------------'");
        System.out.println("Seleccione un ataque para " + pokemonActual.getClass().getSimpleName() + ":");
        System.out.println("La densa de:  "+ pokemonActual.getDefensa());
        System.out.println("Y su nivel es:  "+ pokemonActual.getNivel());
        int idx = 1;
       
        for (Enum movimiento : pokemonActual.getMovimientos()) {
            System.out.println(idx + ".- " + movimiento);
            idx++;
        }
        System.out.println("*------------------------------------------*");

        int opcionAtaque = -1;
        while (true) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            opcionAtaque = Integer.parseInt(br.readLine());
            if (opcionAtaque < 1 || opcionAtaque > pokemonActual.getMovimientos().length) {
                    System.out.println("La opción de ataque no es válida. Inténtalo de nuevo.");
                } else {
                    break; 
            }     
        } catch (IOException ex) {
            System.out.println("Error al leer la entrada. Inténtalo de nuevo.");
            ex.printStackTrace();
        }catch (NumberFormatException ex) {
                System.out.println("Por favor, ingrese un número válido. Inténtalo de nuevo.");
        } 
        }
        entrenadorEnturno.instruirMovimientoAlPokemonActual(oponente, opcionAtaque - 1);
    
    }


    ///Cambiar pokemon
    private void cambiarPokemon(Entrenador entrenador) {
        System.out.println("¿Deseas cambiar de Pokémon? (S/N)");

        char respuesta = 'N';

           while (true) {
            try {
                respuesta = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
                break;  // Salir  si no hay excepciones
            } catch (IOException ex) {
                System.out.println("Error de entrada o salida al leer la respuesta. Intenta de nuevo.");
                ex.printStackTrace();
            }
        }
           
        if (respuesta == 'S' || respuesta == 's') {

            System.out.println("Pokémon disponibles:");
            int idx = 1;
            for (Pokemon pokemon : entrenador.getPokemonsCapturados()) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
                idx++;
            }

            // Elegir  un nuevo pokemon de ka lista 
            System.out.println("Elige un nuevo Pokémon:");

            char auxLectura = '0';

            try {
                auxLectura = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (Exception ex) {
                ex.printStackTrace();
            }

             int indicePokemonNuevo = Character.getNumericValue(auxLectura) - 1;

            
            if (indicePokemonNuevo >= 0 && indicePokemonNuevo < entrenador.getPokemonsCapturados().size()) {
                Pokemon nuevoPokemon = entrenador.getPokemonsCapturados().get(indicePokemonNuevo);
                entrenador.setPokemonActual(nuevoPokemon);
                System.out.println("Has elegido al pokemon " + nuevoPokemon.getClass().getSimpleName() + " en tu equipo.");
            } else {
                System.out.println("La opción no ha sido valida, trata de nuevo con un nuevo digito.");
            }
    }
    }
}

  

