import java.util.ArrayList;

public class Kind extends Gezin {
    //private String naam;
    //private double beschikbareTijd;
    public ArrayList<Gezin> kind = new ArrayList<>();

    public void kind(String naam, double beschikbareTijd){
        super(naam, beschikbareTijd);
        kind.add(this);
        
    }

    public String getNaam(){
        return this.naam;
    }

    public double getBeschikbareTijd() {
        return this.beschikbareTijd;
    }

}