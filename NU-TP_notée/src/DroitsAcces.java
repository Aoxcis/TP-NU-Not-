import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;

public class DroitsAcces{
        LinkedHashMap<Batiment, PlageHoraire> droits;
        DroitsAcces(){
            this.droits = new LinkedHashMap<Batiment, PlageHoraire>();
        }

        void ajouteDroit(Batiment b, PlageHoraire p){
            droits.put(b, p);
        }

            /* public String toString() {
                String chaine = "";
                Iterator it = droits.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, String> entry = (Map.Entry)it.next();
                    chaine += entry.getKey().toString() + " : " + entry.getValue().toString() + "\n";
                }
                return chaine;
        } */

        public String toString() {
            String rep = "";
            for(Batiment bt : droits.keySet()){
                rep+= bt.toString()+" : "+droits.get(bt).toString()+"\n";
            }
    
            return rep;
        }
}