public class BruttoNetto {
    public static void main(String[] args) {

        float netPrice = 252;
        int tax = 50; //prozent
        int maxTax = 50; //euro

        float calulatiedTax = (netPrice * tax) / 100;
        System.out.println("calculatedTax = " + calulatiedTax);

        boolean maxTaxExceeded = calulatiedTax >= maxTax;
        System.out.println("maxTexExceeded = " + maxTaxExceeded);

        double grossPrice = netPrice + calulatiedTax;

        System.out.println("grossPrice = " + grossPrice);


    }
}
