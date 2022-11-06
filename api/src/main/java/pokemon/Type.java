package pokemon;

public class Type {
    
    private String nom;
    private String color;
    private Type faiblesse;
    private Type resistance;

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Type getFaiblesse() {
        return this.faiblesse;
    }

    public void setFaiblesse(Type faiblesse) {
        this.faiblesse = faiblesse;
    }

    public Type getResistance() {
        return this.resistance;
    }

    public void setResistance(Type resistance) {
        this.resistance = resistance;
    }

}