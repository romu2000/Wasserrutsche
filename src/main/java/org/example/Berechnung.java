package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Berechnung extends Main {

    Scanner scanner = new Scanner(System.in);

    public int gerutschteMeter;

    public Rutschenturm rutschenturm = new Rutschenturm(1, "Ronny's Rutschen", createPlatform());

    public Boolean treppeMoeglich = false;
    public Boolean rutscheMoeglich = false;

    public Boolean rutschturmVerlassen = false;


    //Erstellen der Platformobjekte
    public ArrayList<Platform> createPlatform() {
        // Füllen der Platformliste mit Objekten
        platformListe.add(new Platform(0, "Platform0"));
        platformListe.add(new Platform(1, "Platform1"));
        platformListe.add(new Platform(2, "Platform2"));
        platformListe.add(new Platform(3, "Platform3"));
        platformListe.add(new Platform(4, "Platform4"));
        // Rückgabe der Platformliste
        return platformListe;
    }

    public ArrayList<Rutsche> createRutschen() {
        ArrayList<Rutsche> rutschenListe = new ArrayList<>();

        //Füllen der Rutschenliste mit Objekten
        rutschenListe.add(new Rutsche(1, "Rutsche1", 300, platformListe.get(1), platformListe.get(0), "grün", true));
        rutschenListe.add(new Rutsche(2, "Rutsche2", 500, platformListe.get(2), platformListe.get(0), "grün", false));
        rutschenListe.add(new Rutsche(3, "Rutsche3", 500, platformListe.get(3), platformListe.get(1), "blau", true));
        rutschenListe.add(new Rutsche(4, "Rutsche4", 700, platformListe.get(4), platformListe.get(1), "blau", false));
        rutschenListe.add(new Rutsche(5, "Rutsche5", 400, platformListe.get(4), platformListe.get(3), "grün", true));
        rutschenListe.add(new Rutsche(6, "Rutsche6", 500, platformListe.get(3), platformListe.get(2), "gelb", true));
        rutschenListe.add(new Rutsche(7, "Rutsche7", 1000, platformListe.get(4), platformListe.get(0), "gelb", true));

        return rutschenListe;

    }

    public ArrayList<Treppe> createTreppen() {
        ArrayList<Treppe> treppenListe = new ArrayList<>();
        //Füllen der TreppenListe
        treppenListe.add(new Treppe(1, "Treppe1", 100, platformListe.get(0), platformListe.get(1), 0));
        treppenListe.add(new Treppe(2, "Treppe2", 100, platformListe.get(0), platformListe.get(3), 0));
        treppenListe.add(new Treppe(3, "Treppe3", 100, platformListe.get(1), platformListe.get(2), 0));
        treppenListe.add(new Treppe(4, "Treppe4", 100, platformListe.get(1), platformListe.get(4), 0));
        treppenListe.add(new Treppe(5, "Treppe5", 100, platformListe.get(2), platformListe.get(4), 0));

        return treppenListe;

    }

    public Integer anzahlRutschen() {
        return createRutschen().size();
    }

    public Integer anzahlTreppen() {
        return createTreppen().size();
    }

    public double laengeGesamt() {
        int gesamtLaenge = 0;
        for (Rutsche r : createRutschen()) {
            gesamtLaenge += r.laenge;
        }
        return gesamtLaenge;
    }

    public void ausgabeAufgabe2() {
        System.out.println("Willkommen auf dem Rutschenturm " + rutschenturm.name + ".\nWir haben "
                + anzahlRutschen() + " Rutschen und " + anzahlTreppen()
                + " Treppen - insgesamt kannst du bei uns auf " + laengeGesamt() + "m Rutsch-Spaß haben. Hier ist die Karte:");
    }

    public void ausgabeRutschen() {
        for (Rutsche r : createRutschen()) {
            System.out.println(r.name + " führt von " + r.start.getName() + " nach " + r.ende.getName());
        }
    }


    public void rutscheVerlassen(){
        System.out.println("Schön das du da warst!!!. Bis zum nächsten mal");
        System.exit(1);
    }
    public void rutscheRutschen(int myStandort) {
        int auswahlRutsche;
        System.out.println("Bitte eine Nummer wählen: ");
        for (Rutsche r : createRutschen()) {
            if (platformListe.get(standort) == r.start) {
                System.out.println("Nr. " + r.ende.getId() + " " + r.ende.getName());
            }
        }
        int alterStandort = standort;
        standort = scanner.nextInt();

        System.out.println("Standort: Platform"  + standort);
    }

    public void treppeLaufen(int myStandort) {
        System.out.println("Bitte eine Nummer wählen: ");
        for (Treppe t : createTreppen()) {
            if (platformListe.get(standort).equals(t.start)) {
                System.out.println("Nr. " + t.ende.getId() + " " + t.ende.getName());
            }
        }
        standort = scanner.nextInt();
        System.out.println("Standort: Plattform"  + standort);

    }

    public void moeglichkeitAlles(int myStandort){
        String auswahl = "";
        standort = 0;
        System.out.println("Du bist hier: " + platformListe.get(standort).getName());
        System.out.println("Was möchtest du machen?");
        while(!rutschturmVerlassen){
            treppeMoeglich = false;
            rutschturmVerlassen = false;
            rutscheMoeglich = false;
            moeglichkeitTreppe(standort);
            moeglichkeitRutschen(standort);
            moeglichkeitVerlassen(standort);
            auswahl = scanner.nextLine();
            if(auswahl.toLowerCase().equals("t")){
                treppeLaufen(standort);
            }
            if(auswahl.toLowerCase().equals("r")){
                rutscheRutschen(standort);
            }
            if(auswahl.toLowerCase().equals("v")){
                System.exit(0);
            }



        }
    }

    public void moeglichkeitVerlassen(int myStandort){
        if(platformListe.get(standort).getId()==0){
            System.out.println("V - für Rutschturm verlassen" + standort);
        }
    }

    public void moeglichkeitTreppe(int myStandort) {
        for (Treppe t : createTreppen()) {
            if (platformListe.get(standort) == t.start) {
                treppeMoeglich = true;
                break;
            }
        }
        if (treppeMoeglich) {
            System.out.println("T - für Treppe laufen");
        }
    }

    public void moeglichkeitRutschen(int myStandort) {
        for (Rutsche r : createRutschen()) {
            if (platformListe.get(standort) == r.start) {
                rutscheMoeglich = true;
            }
        }
        if (rutscheMoeglich) {
            System.out.println("R - für Rutsche rutschen");
        }
    }
}
