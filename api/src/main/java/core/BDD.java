package core;

import java.sql.*;
import java.util.List;

import pokemon.*;
public class BDD {
    
    private Statement bdd;

    public BDD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd-api-tp1", "root", "");
            this.bdd = conn.createStatement();
        } catch (Exception e) {}
    }

    public Statement getBdd() {
        return this.bdd;
    }

    public void setBdd(Statement bdd) {
        this.bdd = bdd;
    }

    public List<Pokemon> getPokemon(){
        return null;
    }
}
