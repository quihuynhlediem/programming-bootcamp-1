package ExtraDay8.Lab18;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartManager {

    public static void printMenu(){
        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit\n");
    }

    public static void executeMenu(char c, ShoppingCart shoppingCart, Scanner scnr){
        switch (c){
            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                shoppingCart.printTotal();
                printMenu();
                break;
            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                shoppingCart.printDescriptions();
                break;
            case 'a':
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                String name = scnr.nextLine();
                System.out.println("Enter the item description:");
                String description = scnr.nextLine();
                System.out.println("Enter the item price:");
                int price = scnr.nextInt();
                System.out.println("Enter the item quantity:");
                int quantity = scnr.nextInt();

                ItemToPurchase item = new ItemToPurchase(name, description, price, quantity);
                shoppingCart.addItem(item);
                printMenu();
                break;
            case 'd':
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove:");
                String removedItemName = scnr.nextLine();
                shoppingCart.removeItem(removedItemName);
                break;
            case 'c':
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                String modifiedItemName = scnr.nextLine();
                System.out.println("Enter the new quantity:");
                int modifiedQuantity = scnr.nextInt();
                ItemToPurchase modifiedItem = new ItemToPurchase();
                modifiedItem.setName(modifiedItemName);
                modifiedItem.setQuantity(modifiedQuantity);
                shoppingCart.modifyItem(modifiedItem);
                break;
            case 'q':
                return;
        }
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String customerName;
        String currDate;
        ShoppingCart shoppingCart;

        System.out.println("Enter customer's name:");
        customerName = scnr.nextLine();
        System.out.println("Enter today's date:");
        currDate = scnr.nextLine();
        System.out.println();
        shoppingCart = new ShoppingCart(customerName, currDate);
        System.out.println("Customer name: " + customerName);
        System.out.println("Today's date: " + currDate);
        System.out.println();

        printMenu();
        System.out.println("Choose an option:");
        char input = scnr.nextLine().charAt(0);
        while (input != 'q'){
            executeMenu(input, shoppingCart, scnr);

            //Print prompt for new char
            System.out.println("Choose an option:");
            input = scnr.nextLine().charAt(0);
        }
    }
}
