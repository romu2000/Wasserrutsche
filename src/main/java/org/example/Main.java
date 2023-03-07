package org.example;

import java.util.ArrayList;

public class Main {

    public static int standort;

    public static ArrayList<Platform> platformListe = new ArrayList<>();
    public static Berechnung berechnung = new Berechnung();



    public static void main(String[] args) {


        berechnung.createPlatform();
        berechnung.ausgabeAufgabe2();
        berechnung.ausgabeRutschen();
    //    berechnung.treppeLaufen(standort);
    //    berechnung.rutscheRutschen(standort);
        berechnung.moeglichkeitAlles(standort);
    }
}