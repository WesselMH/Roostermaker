import java.util.ArrayList;

public class Ouder extends Gezin {
    //private String naam;
    //private double beschikbareTijd;
    public ArrayList<Gezin> ouder = new ArrayList<>();

    
    public void ouderGezinslid(String naam, double beschikbareTijd){
        super(naam, beschikbareTijd);
        ouder.add(this);
        
    }

    public String getNaam(){
        return this.naam;
    }

    public double getBeschikbareTijd() {
        return this.beschikbareTijd;
    }
}
