package api;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pokemon.PokemonController;
import pokemon.Pokemon;

@RestController
@RequestMapping(path = "/api")
public class PokemonAPI {

    public PokemonAPI() {
    }

    @GetMapping(path = "/pokemons")
    public List<Pokemon> getAllPokemon() throws Exception{
        return PokemonController.getPokemons();
    }

    @GetMapping(path = "/pokemons/{id}")
    public Pokemon getPokemonById(@PathVariable int id) throws Exception{
        return PokemonController.getPokemon(id);
    }

    @PostMapping(path = "/pokemons")
    public Pokemon postPokemon(@RequestBody Pokemon pokemon) throws Exception{
        return PokemonController.postPokemon(pokemon);
    }

    @PutMapping(path = "/pokemons/{id}")
    public Pokemon putPokemon(@PathVariable int id, @RequestBody Pokemon pokemon) throws Exception{
        return PokemonController.putPokemon(id, pokemon);
    }

    @DeleteMapping(path = "/pokemons/{id}")
    public Pokemon deletePokemon(@PathVariable int id) throws Exception{
        return PokemonController.deletePokemon(id);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PokemonAPI.class, args);
    }
}
