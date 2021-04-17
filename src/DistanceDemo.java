public class DistanceDemo {
    public static void main(String[] args) {

        int kilometerValue;
        kilometerValue = 10;
        System.out.println(kilometerValue + "km sind " + kilometer(kilometerValue) + "meilen");

    }

    public static double kilometer(int kilometer){
        double milesPerKM;
        milesPerKM = kilometer / 1.64;

        return milesPerKM;
    }
}
