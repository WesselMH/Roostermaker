package com.roostermaker;
import java.util.ArrayList;

public class Kind extends Gezin {


    public Kind(String naam, double beschikbareTijd, String gezinsverhouding) {
        super(naam, beschikbareTijd, gezinsverhouding);


        Gezin.gezin.add(this);
    }



    public String getNaam(){
        return this.naam;
    }

    public double getBeschikbareTijd() {
        return this.beschikbareTijd;
    }

}