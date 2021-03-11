import java.util.Arrays;

public class DatatypeExamples {
    public static void main(String[] args) {
        System.out.println("Einige Beispiele zu Datentypen");
        int laenge; //deklaration
        int breite; //deklaration
        int ergebnis; //deklaration

        laenge = 5; //initialisierung
        breite = 7; //initialisierung

        ergebnis = laenge * breite; // initialisierung auf der rechten seite : read/read

        System.out.println("Die Fläche lautet: " + ergebnis + "cm²");
        System.out.println("Die Fläche von: " + laenge + " und " + breite + " lautet: " + ergebnis + "cm²" );


        int a, b, c;
        a = 7;
        b = 5;
        c = 3;

        ergebnis = a/b;
        System.out.println("result = " + ergebnis);
        ergebnis = a = b * 3;
        System.out.println("result = " + ergebnis);
        System.out.println("result = " + a);
        ergebnis = a/b;
        System.out.println("result = " + ergebnis);



        a = 4;
        b = 5;

        /*
        * a + b = 4 + 5 = 9
        * a - b = 4 - 5 = -1
        * a * b ...
        * a / b = ...
        * a % b = ...
        * */

        ergebnis = a + b;
        System.out.println("a + b = " + a + " + " + b + " = " + ergebnis);

        ergebnis = a - b;
        System.out.println("a - b = " + a + " - " + b + " = " + ergebnis);

        ergebnis = a * b;
        System.out.println("a * b = " + a + " * " + b + " = " + ergebnis);

        ergebnis = a / b;
        System.out.println("a / b = " + a + " / " + b + " = " + ergebnis);

        ergebnis = a % b;
        System.out.println("a % b = " + a + " % " + b + " = " + ergebnis);

        // Alternative:

        System.out.println("neue Variante:");

        int g = a + b;
        int h = a - b;
        int i = a * b;
        int j = a / b;
        int k = a % b;
        System.out.println("a + b = " + a + " + " + b + " = " + g);
        System.out.println("a - b = " + a + " - " + b + " = " + h);
        System.out.println("a * b = " + a + " * " + b + " = " + i);
        System.out.println("a / b = " + a + " / " + b + " = " + j);
        System.out.println("a % b = " + a + " % " + b + " = " + k);

        double x = 5, y = 3;
        System.out.println("x + y = " + x + " + " + y + " = " + (x + y));
        System.out.println("x - y = " + x + " - " + y + " = " + (x - y));
        System.out.println("x * y = " + x + " * " + y + " = " + (x + y));
        System.out.println("x / y = " + x + " / " + y + " = " + (x / y));
        System.out.println("x % y = " + x + " % " + y + " = " + (x % y));


    }
}
