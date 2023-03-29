public class Titulaire{
    String nom;
    String prenom;
    DroitsAcces d;

    Titulaire(String nom, String prenom, DroitsAcces d){
        this.nom = nom;
        this.prenom = prenom;
        this.d = d;
    }

    public String toString(){
        return "Titulaire : " + prenom + " " + nom + "\n" + d.toString();
    }
}