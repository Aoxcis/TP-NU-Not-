import java.time.LocalDate;
import java.time.LocalDate;

public class Personnel extends Titulaire{
    LocalDate finDeContrat;

    Personnel(String nom, String prenom, DroitsAcces d, LocalDate f){
        super(nom, prenom, d);
        this.finDeContrat = f;
    }

    public String toString(){
        return(super.toString() + "\n Fin de contrat : "+ finDeContrat);
    }
}