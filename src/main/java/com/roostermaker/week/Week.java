package com.roostermaker.week;

import java.util.ArrayList;

public abstract class Week {
    protected String dag;
    protected String dagdeel;
    protected boolean isWeekend;

    public static ArrayList<Week> week = new ArrayList<>();

    public Week(String dag, String dagdeel, boolean isWeekend) {
        this.dag = dag;
        this.dagdeel = dagdeel;
        this.isWeekend = isWeekend;
    }

    public String getDag() {
        return dag;
    }

    public String getDagdeel() {
        return dagdeel;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public static ArrayList<Week> getWeek() {
        return week;
    }
    
    public abstract String getDagVanWeek();
    
}
