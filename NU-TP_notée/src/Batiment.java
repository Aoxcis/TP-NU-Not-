public class Batiment{
    String nom;
    String localisation;

    public Batiment(String nom, String localisation){
        this.nom = nom;
        this.localisation = localisation;
    }
    public String toString(){
        return nom + "("+localisation+")";
    }
}