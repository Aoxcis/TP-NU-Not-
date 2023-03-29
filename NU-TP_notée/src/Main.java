import java.time.Month;
import java.time.LocalTime;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IMTNE e = new IMTNE();
        System.out.println("1");
        Eleve toto = new Eleve("Jhon", "McLain", e.eleves, LocalDate.of(2025,Month.SEPTEMBER, 30));
        System.out.println(toto);
        System.out.println("2");
        Personnel tata = new Personnel("Jhon", "Doe", e.personnel, LocalDate.of(2035,Month.AUGUST, 31));
        Carte c1 = new Carte(toto);
        System.out.println(c1);
        Carte c2 = new Carte(tata);
        System.out.println("3");
        DroitsAcces d1 = new DroitsAcces();
        System.out.println("droits avant : " + d1);
        d1.ajouteDroit(e.lesBatiments.get(2), new PlageHoraire(LocalTime.of(8,0,0),LocalTime.of(12,0,0), true));
        System.out.println("droits après : " + d1);
        System.out.println(e.lesBatiments.get(2));
        LecteurCarte dia = new LecteurCarte(e.lesBatiments.get(2));
        System.out.println("4");
        System.out.println(c1);
        dia.lecture(c1);
        System.out.println(c1);
        System.out.println("5");

        LecteurCarte disi = new LecteurCarte(e.lesBatiments.get(6));
        disi.lecture(c1);
    }
}