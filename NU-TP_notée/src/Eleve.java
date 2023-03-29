import java.time.LocalDate;

public class Eleve extends Titulaire{
    LocalDate finDeScolarité;
    
    Eleve(String nom, String prenom, DroitsAcces d, LocalDate f){
        super(nom, prenom, d);
        this.finDeScolarité = f;
    }

    public String toString(){
        return(super.toString() + "\n Fin de scolarité : "+ finDeScolarité);
    }
}