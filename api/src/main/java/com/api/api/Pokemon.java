package com.api.api;

public class Pokemon {

    private int id;
    private String nom;
    private String Habitat;
    private int attaque;
    private int defense;
    private Type type;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getHabitat() {
        return this.Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }

    public int getAttaque() {
        return this.attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
