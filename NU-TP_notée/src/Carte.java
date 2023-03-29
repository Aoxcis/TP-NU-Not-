public class Carte{
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
        System.out.println("titulaire  " + titulaire.d.droits.get(b));
        return (PlageHoraire) titulaire.d.droits.get(b);
    }

    public String toString(){
        return("Carte numéro : " + num + "\n" + titulaire.toString());
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
