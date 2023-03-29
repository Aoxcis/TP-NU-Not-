import java.time.*;


public class PlageHoraire{
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