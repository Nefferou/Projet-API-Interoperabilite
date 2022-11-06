package pokemon;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PokemonController {

    private static List<Pokemon> pokemon = new ArrayList<>();
    private static String file = "./src/main/java/core/BDD.txt";

    public static List<Pokemon> getPokemons() throws IOException {
        try {
            PokemonController.pokemon = new ArrayList<>();
            FileReader bdd = new FileReader(PokemonController.file);
            BufferedReader br = new BufferedReader(bdd);
            String[] tabPokemon;
            String line;
            int i = 1;
            while ((line = br.readLine()) != null) {
                tabPokemon = line.split(",");
                PokemonController.pokemon.add(new Pokemon(i, tabPokemon[0], tabPokemon[1],
                        Integer.parseInt(tabPokemon[2]), Integer.parseInt(tabPokemon[3]), tabPokemon[4]));
                i++;
            }
            bdd.close();
            return PokemonController.pokemon;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Pokemon getPokemon(int id) throws IOException {
        PokemonController.getPokemons();
        return PokemonController.pokemon.get(id - 1);
    }

    public static Pokemon postPokemon(Pokemon p) throws IOException {

        PokemonController.getPokemons();
        p.setId(PokemonController.pokemon.size() + 1);
        PokemonController.pokemon.add(p);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("./src/main/java/core/BDD.txt", true));
            try {
                out.write("\n" + PokemonController.pokemon.get(PokemonController.pokemon.size() - 1).toString());
            } finally {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return PokemonController.pokemon.get(PokemonController.pokemon.size() - 1);
    }

    public static Pokemon putPokemon(int id, Pokemon p) throws IOException {
        PokemonController.getPokemons();
        PokemonController.pokemon.set(id-1, p);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("./src/main/java/core/BDD.txt"));
            for (Pokemon pok : PokemonController.pokemon) {
                try {
                    out.write(pok.toString() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PokemonController.getPokemons();
        return PokemonController.pokemon.get(id-1);
    }

    public static Pokemon deletePokemon(int id) throws IOException {
        PokemonController.getPokemons();
        PokemonController.pokemon.remove(id-1);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("./src/main/java/core/BDD.txt"));
            for (Pokemon pok : PokemonController.pokemon) {
                try {
                    out.write(pok.toString() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            out.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    return null;
    }
}
