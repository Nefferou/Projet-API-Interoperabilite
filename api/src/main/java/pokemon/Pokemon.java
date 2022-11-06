package pokemon;

public class Pokemon {

    private String nom;
    private String Habitat;
    private int attaque;
    private int defense;
    private Type type;


    public Pokemon(String nom, String Habitat, int attaque, int defense) {
        this.nom = nom;
        this.Habitat = Habitat;
        this.attaque = attaque;
        this.defense = defense;
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
