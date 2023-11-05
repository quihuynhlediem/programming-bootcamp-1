package Day4;

import java.util.Scanner;

public class SearchForDomainName {

    public static void main(String [ ] args) {
        Scanner scnr = new Scanner(System.in);
        String inputName;
        String searchName;
        String coreGtld1;
        String coreGtld2;
        String coreGtld3;
        String coreGtld4;
        boolean isCoreGtld;

        coreGtld1 = ".com";
        coreGtld2 = ".net";
        coreGtld3 = ".org";
        coreGtld4 = ".info";
        isCoreGtld = false;

        System.out.println("\nEnter a top-level domain name: ");
        inputName  = scnr.nextLine();
        searchName = inputName.toLowerCase();

        // If the user entered a name without a leading period, add one
        if ((!searchName.isEmpty()) && (searchName.charAt(0) != '.')) {
            searchName = "." + searchName;
        }

        // See if the domain name entered is a generic top-level domain name
        if (searchName.compareTo(coreGtld1) == 0) {
            isCoreGtld = true;
        }
        else if (searchName.compareTo(coreGtld2) == 0) {
            isCoreGtld = true;
        }
        else if (searchName.compareTo(coreGtld3) == 0) {
            isCoreGtld = true;
        }
        else if (searchName.compareTo(coreGtld4) == 0) {
            isCoreGtld = true;
        }
        else {
            isCoreGtld = false;
        }

        System.out.print("The name \"" + inputName + "\" ");
        if (isCoreGtld) {
            System.out.println("is a core gTLD.");
        }
        else {
            System.out.println("is not a core gTLD.");
        }
    }
}
