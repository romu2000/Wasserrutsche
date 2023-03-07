package org.example;

public class Treppe {

    int id;
    String name;
    double laenge;
    Platform start;
    Platform ende;
    int stufen;

    public Treppe(int id, String name, double laenge, Platform start, Platform ende, int stufen) {
        this.id = id;
        this.name = name;
        this.laenge = laenge;
        this.start = start;
        this.ende = ende;
        this.stufen = stufen;
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

    public int getStufen() {
        return stufen;
    }

    public void setStufen(int stufen) {
        this.stufen = stufen;
    }


}
