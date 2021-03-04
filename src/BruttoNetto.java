public class BruttoNetto {
    public static void main(String[] args) {

        float netPrice = 100;
        int tax; //prozent
        int maxTax = 50; //euro

        int tax_class = 1;

        if (tax_class == 1) {
            tax = 16;
        } else if (tax_class == 2) {
            tax = 8;
        } else if (tax_class == 3) {
            tax = 8;
        } else {
            tax = 0;
            System.out.println("Lieber User, diese Steuerklasse ist unbekannt");
        }

        switch (tax_class) {
            case 1:         //wenn dieser Fall, dann führe folgendes aus:
                tax = 20;
                break;
            case 2:
                tax = 16;
                break;
            case 3:
                tax = 8;
                break;
            default:  // sonst mach folgendes
                tax = 0;
                System.out.println("Lieber User, diese Steuerklasse ist unbekannt!");
        }

        double calulatiedTax = (netPrice * tax) / 100;
        System.out.println("calculatedTax = " + calulatiedTax);

        boolean maxTaxExceeded = calulatiedTax >= maxTax;
        System.out.println("maxTexExceeded = " + maxTaxExceeded);

        if (maxTaxExceeded == true) { // dann
            //entweder
            System.out.println("Der maximale Steuerbetrag wurde erreicht: " + calulatiedTax + " >= " + maxTax);
        } else { // ELSE ist immer optional
            //oder
            System.out.println("Der maximale Steuerbetrag wurde nicht erreicht, Folgender Betrag ist noch verfügbar: "
                    + (maxTax - calulatiedTax));
        }

        if (maxTaxExceeded == false) {
            System.out.println("juhu");
        }

        if (!maxTaxExceeded) {
            System.out.println("Juhu");
        }
        if (false) {
            System.out.println("false");
        }
        if (true) {
            System.out.println("true");
        }
        boolean check = true;
        System.out.println("check = " + check);
        check = !check;
        System.out.println("check = " + check);
        check = !check;
        System.out.println("check = " + check);
        System.out.println("expression 5==5: " + (5 == 5));
        System.out.println("expression 5==7: " + (5 == 7));
        System.out.println("expression !5==7: " + !(5 == 7));

        double grossPrice = netPrice + calulatiedTax;
        System.out.println("grossPrice = " + grossPrice);

        printNameToGrade(1);
        printNameToGrade(2);
        printNameToGrade(3);
        printNameToGrade(4);
        printNameToGrade(5);


    }
         public static void printNameToGrade(int grade){
          // public static = fix, (void/Datentyp = Rückgabetyp),

            // Ihre Aufgabe: Name für Schulnote ausgeben.
            int language = 2; // 1 Deusch, 2 English

            if (grade == 1 && language == 1) {
                System.out.println("Sehr gut");
            } else if (grade == 2 && language == 1) {
                System.out.println("Gut");
            } else if (grade == 3 && language == 1) {
                System.out.println("Befriedigend");
            } else if (grade == 4 && language == 1) {
                System.out.println("Genügend");
            } else if (grade == 5 && language == 1) {
                System.out.println("Nicht genügend");
            } else if (grade == 1 && language == 2) {
                System.out.println("A");
            } else if (grade == 2 && language == 2) {
                System.out.println("B");
            } else if (grade == 3 && language == 2) {
                System.out.println("C");
            } else if (grade == 4 && language == 2) {
                System.out.println("D");
            } else if (grade == 5 && language == 2) {
                System.out.println("Fail");
            } else {
                System.out.println("Lieber Schüler, gib bitte deine Note bekannt");
            }

        }



}
