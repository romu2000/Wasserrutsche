package org.example;

import java.util.List;

public class Rutschenturm {

    int id;
    String name;
    int plz;
    String strasse;
    String stadt;
    double geo;
    List<Platform> platform;


    public Rutschenturm(int id, String name, List<Platform> platform) {
        this.id = id;
        this.name = name;
        this.platform = platform;
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

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public double getGeo() {
        return geo;
    }

    public void setGeo(double geo) {
        this.geo = geo;
    }
}
