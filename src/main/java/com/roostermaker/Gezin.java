import java.util.ArrayList;

public class Gezin {
    protected String naam;
    protected double beschikbareTijd;
    public static ArrayList<Gezin> gezin = new ArrayList<>();

    public void gezinslid(String naam, double beschikbareTijd){
        naam = this.naam;
        beschikbareTijd = this.beschikbareTijd;        
    }

    public String getNaam(){
        return this.naam;
    }

    public double getBeschikbareTijd() {
        return this.beschikbareTijd;
    }
}
