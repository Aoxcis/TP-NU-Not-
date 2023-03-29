import java.util.ArrayList;
import java.time.LocalTime;

public class IMTNE{
    ArrayList<Batiment> lesBatiments;
    DroitsAcces eleves;
    DroitsAcces personnel;

    IMTNE(){
        lesBatiments = new ArrayList<Batiment>();
        creerIMTNordEurope();
        eleves = new DroitsAcces();
        creerDroitsEleves();
        personnel = new DroitsAcces();
        creerDroitsPersonnel();
    }

    void creerIMTNordEurope(){
        Batiment Laplace = new Batiment("Laplace", "Bourseul");
        Batiment Newton = new Batiment("Newton", "Bourseul");
        Batiment CERI_SN = new Batiment("CERI_SN", "Lahure");
        Batiment CERI_SN2 = new Batiment("CERI_SN", "Vda");
        Batiment GC1 = new Batiment("GC1", "Lahure");
        Batiment GC2 = new Batiment("GC2", "Lahure");
        Batiment DISI = new Batiment("DISI", "Lahure");
        Batiment Batiment_central = new Batiment("Batiment_central", "Lahure");

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
        Batiment Laplace = new Batiment("Laplace", "Bourseul");
        Batiment Newton = new Batiment("Newton", "Bourseul");
        Batiment CERI_SN = new Batiment("CERI_SN", "Lahure");
        Batiment CERI_SN2 = new Batiment("CERI_SN", "Vda");
        Batiment GC1 = new Batiment("GC1", "Lahure");
        Batiment GC2 = new Batiment("GC2", "Lahure");
        Batiment DISI = new Batiment("DISI", "Lahure");
        Batiment Batiment_central = new Batiment("Batiment_central", "Lahure");

        personnel.ajouteDroit(Laplace, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), true));
        personnel.ajouteDroit(Newton, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), true));
        personnel.ajouteDroit(CERI_SN, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), true));
        personnel.ajouteDroit(CERI_SN2, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), true));
        personnel.ajouteDroit(GC1, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), true));
        personnel.ajouteDroit(GC2, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), true));
        personnel.ajouteDroit(DISI, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), true));
        personnel.ajouteDroit(Batiment_central, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), true));

        }
        void creerDroitsEleves(){
        Batiment Laplace = new Batiment("Laplace", "Bourseul");
        Batiment Newton = new Batiment("Newton", "Bourseul");
        Batiment CERI_SN = new Batiment("CERI_SN", "Lahure");
        Batiment CERI_SN2 = new Batiment("CERI_SN", "Vda");
        Batiment GC1 = new Batiment("GC1", "Lahure");
        Batiment GC2 = new Batiment("GC2", "Lahure");
        Batiment DISI = new Batiment("DISI", "Lahure");
        Batiment Batiment_central = new Batiment("Batiment_central", "Lahure");

        eleves.ajouteDroit(Laplace, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), false));
        eleves.ajouteDroit(Newton, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), false));
        eleves.ajouteDroit(CERI_SN, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), false));
        eleves.ajouteDroit(CERI_SN2, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), false));
        eleves.ajouteDroit(GC1, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), false));
        eleves.ajouteDroit(GC2, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), false));
        eleves.ajouteDroit(DISI, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), false));
        eleves.ajouteDroit(Batiment_central, new PlageHoraire(LocalTime.of(7, 0), LocalTime.of(21, 0), false));

        }
    }