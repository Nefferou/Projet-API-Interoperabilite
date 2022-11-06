package api;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import core.BDD;
import pokemon.*;

@RestController
@RequestMapping(path = "/api")
public class PokemonAPI {

    BDD bdd = new BDD();

    @GetMapping(path = "/pokemons", produces = "application/json")
    public List<Pokemon> getPokemon() {
        try {
            
            ResultSet result = this.bdd.getBdd().executeQuery("SELECT * FROM Pokemon");
            List<Pokemon> pokList = new ArrayList<Pokemon>();

            while(result.next()){
                pokList.add(new Pokemon(result.getString(1), result.getString(2), result.getInt(3), result.getInt(4)));
            }

            return pokList;

        } catch (Exception e) {
            return null;
        }
    }
}
