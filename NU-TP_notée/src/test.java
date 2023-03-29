import java.time.DayOfWeek;
import java.util.Collection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Iterator;
import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;


class PlageHoraire {
    private LocalTime debut;
    private LocalTime fin;
    private Boolean accesWeekend;

    public PlageHoraire(LocalTime debut, LocalTime fin, Boolean accesWeekend){
        this.debut = debut;
        this.fin = fin;
        this.accesWeekend = accesWeekend;
    }

    Boolean estDansLaPlage(LocalDateTime i){
        
        if(i.toLocalTime().isBefore(fin) == true && i.toLocalTime().isAfter(debut) == true){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        if(accesWeekend){
            return "Accès de " + debut + " à " + fin + " tous les jours";
        }
        else{
            return "Accès de " + debut + " à " + fin + " sauf le weekend";
        }
        
    }
}

class Batiment{
    String nom;
    String localisation;

    public Batiment(String nom, String localisation){
        this.nom = nom;
        this.localisation = localisation;
    }
    public String toString(){
        return nom + " ("+localisation+")";
    }
}

class DroitsAcces {
    LinkedHashMap<Batiment, PlageHoraire> droits;

    public DroitsAcces() {
        droits = new LinkedHashMap<Batiment, PlageHoraire>();
    }

    public void ajouterDroits(Batiment b, PlageHoraire p){
        droits.put(b,p);
    }


    public String toString() {
        String chaine = "";
        for(Batiment b : droits.keySet()){
            chaine += b.toString() + " : " + droits.get(b).toString() + "\n";
        }
        return chaine;
    }
}


class Titulaire {
    String nom;
    String prenom;
    DroitsAcces d;

    Titulaire(String nom, String prenom, DroitsAcces droit){
        this.nom = nom;
        this.prenom = prenom;
        this.d = droit;
    }

    public String toString(){
        return "Titulaire : " + nom + " " + prenom + "\n" + d.toString();
    }
}

class Eleve extends Titulaire{
    LocalDate finDeScolarité;
    
    Eleve(String nom, String prenom, DroitsAcces d, LocalDate f){
        super(nom, prenom, d);
        this.finDeScolarité = f;
    }

    public String toString(){
        return(super.toString() + "\n Fin de scolarité : "+ finDeScolarité);
    }
}

class Personnel extends Titulaire{
    LocalDate finDeContrat;

    Personnel(String nom, String prenom, DroitsAcces d, LocalDate f){
        super(nom, prenom, d);
        this.finDeContrat = f;
    }

    public String toString(){
        return(super.toString() + "\n Fin de contrat : "+ finDeContrat);
    }
}

class Carte {
    Titulaire titulaire;
    int num;
    int nbTotalCartes;
    double montant;

    Carte(Titulaire t){
        this.titulaire = t;
        this.num = nbTotalCartes+1;
        nbTotalCartes++;
    }

    public PlageHoraire getPlageHoraireAccesBatiment(Batiment b){
        return (PlageHoraire) titulaire.d.droits.get(b);
    }

    public String toString(){
        return "Carte numéro : " + num + "\n" + titulaire.toString();
    }
    
    void debit(double montant){
        if(this.montant - montant < 0){
            System.out.println("Solde insuffisant");
        }
        if(this.montant - montant >= 0){
            this.montant -= montant;
            System.out.println("Nouveaux solde : " + this.montant);
        }
    }

    void credit(double montant){
        this.montant += montant;
        System.out.println("Nouveaux solde : " + this.montant);
    }
}

class LecteurCarte {
    Batiment bat;
    LecteurCarte(Batiment b){
        this.bat = b;
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

class IMTNE {
    ArrayList<Batiment> lesBatiments;
    DroitsAcces eleves;
    DroitsAcces personnel;

    IMTNE(){
        lesBatiments = new ArrayList<>();
        eleves = new DroitsAcces();
        personnel = new DroitsAcces();
        creerIMTNordEurope();
        creerDroitsEleves();
        creerDroitsPersonnel();
    }

    void creerIMTNordEurope(){
        Batiment Laplace = new Batiment("Laplace", "Bourseul");
        Batiment Newton = new Batiment("Newton", "Bourseul");
        Batiment CERI_SN = new Batiment("CERI SN", "Lahure");
        Batiment CERI_SN2 = new Batiment("CERI SN", "Vda");
        Batiment GC1 = new Batiment("GC1", "Lahure");
        Batiment GC2 = new Batiment("GC2", "Lahure");
        Batiment DISI = new Batiment("DISI", "Lahure");
        Batiment Batiment_central = new Batiment("Batiment central", "Lahure");

        lesBatiments.add(Laplace);
        lesBatiments.add(Newton);
        lesBatiments.add(CERI_SN);
        lesBatiments.add(CERI_SN2);
        lesBatiments.add(GC1);
        lesBatiments.add(GC2);
        lesBatiments.add(DISI);
        lesBatiments.add(Batiment_central);
    }

    void creerDroitsPersonnel(){
        PlageHoraire PlageBase = new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), true);
        for(Batiment b : lesBatiments){
            personnel.ajouterDroits(b, PlageBase);
            }
        }

        void creerDroitsEleves(){
            PlageHoraire PlageBase = new PlageHoraire(LocalTime.of(8, 0), LocalTime.of(19, 0), false);
            for(Batiment b : lesBatiments){
                personnel.ajouterDroits(b, PlageBase);
                }
        }
}