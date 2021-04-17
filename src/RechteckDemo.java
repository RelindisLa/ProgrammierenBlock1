public class RechteckDemo {
    public static void main(String[] args) {

        int breite;
        int laenge;
        int umfang;
        double flaeche;
        System.out.println("umfang " + umfang(3,4));
        System.out.println("fläche " + flaeche(3,4) );

        breite = 3;
        laenge = 4;
    }

    public static int umfang(int breite, int laenge){
        int umfang = (breite + laenge)*2;
        return umfang;
    }
    public static double flaeche (int breite, int laenge){
        double flaeche = breite * laenge;
        return flaeche;
    }
}
