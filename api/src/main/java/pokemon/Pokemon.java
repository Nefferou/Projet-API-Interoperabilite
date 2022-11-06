package pokemon;

public class Pokemon {

    private int id;
    private String nom;
    private String habitat;
    private int attaque;
    private int defense;
    private String type;


    public Pokemon() {
    }

    public Pokemon(int id, String nom, String habitat, int attaque, int defense, String type) {
        this.id = id;
        this.nom = nom;
        this.habitat = habitat;
        this.attaque = attaque;
        this.defense = defense;
        this.type = type;
    }

    public Pokemon(String nom, String habitat, int attaque, int defense, String type) {
        this.nom = nom;
        this.habitat = habitat;
        this.attaque = attaque;
        this.defense = defense;
        this.type = type;
    }

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
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getNom() + "," + getHabitat() + "," + getAttaque() + "," + getDefense() + "," + getType();
    }
}
