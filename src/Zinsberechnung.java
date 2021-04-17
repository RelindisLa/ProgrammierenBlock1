public class Zinsberechnung {
    public static void main(String[] args) {

        double kontostand;
        double zinssatz;
        kontostand = 1000;
        zinssatz = 2.25;

        System.out.println("Beim Kontostand von: " + kontostand + "€ werden nach einem Jahr bei folgendem Zinssatz " + zinssatz + " der Betrag von " + erhalteneZinsen(kontostand, zinssatz) + "€ als Zinsen erhalten.");
        System.out.println("Der neue Kontostand beträgt: " + neuerKontostand(kontostand,zinssatz));
        System.out.println();
        System.out.println("neue Berechnung mit unterschiedlichen Werten: " + erhalteneZinsen(200,5));
        System.out.println(neuerKontostand(200,5));


    }

    public static double erhalteneZinsen (double kontostand, double zinssatz){
        double erhalteneZinsen;

        erhalteneZinsen = (kontostand/100)*zinssatz;

        return erhalteneZinsen;

    }

    public static double neuerKontostand (double kontostand, double zinssatz){
        double neuerKontostand;
        neuerKontostand = kontostand + (kontostand/100)*zinssatz;
        return neuerKontostand;
    }
}
