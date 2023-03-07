package org.example;

public class Rutsche {

    int id;
    String name;
    double laenge;
    Platform start;
    Platform ende;
    String schwierigkeit;
    Boolean reifen;

    public Rutsche(int id, String name, double laenge, Platform start, Platform ende, String schwierigkeit, Boolean reifen) {
        this.id = id;
        this.name = name;
        this.laenge = laenge;
        this.start = start;
        this.ende = ende;
        this.schwierigkeit = schwierigkeit;
        this.reifen = reifen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public Platform getStart() {
        return start;
    }

    public void setStart(Platform start) {
        this.start = start;
    }

    public Platform getEnde() {
        return ende;
    }

    public void setEnde(Platform ende) {
        this.ende = ende;
    }

    public String getSchwierigkeit() {
        return schwierigkeit;
    }

    public void setSchwierigkeit(String schwierigkeit) {
        this.schwierigkeit = schwierigkeit;
    }

    public Boolean getReifen() {
        return reifen;
    }

    public void setReifen(Boolean reifen) {
        this.reifen = reifen;
    }
}
