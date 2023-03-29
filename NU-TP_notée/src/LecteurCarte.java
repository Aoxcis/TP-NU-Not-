import java.time.LocalDateTime;

public class LecteurCarte{
    Batiment bat;
    LecteurCarte(Batiment b){
        bat = b;
    }

    void lecture(Carte c){
        PlageHoraire p = c.getPlageHoraireAccesBatiment(bat);
        if(p.estDansLaPlage(LocalDateTime.now())){
            System.out.println("Accès autorisé");
        }
        else{
            System.out.println("Accès refusé");
        }
    }
}