package ExtraDay8.Lab17;

import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String itemName;
        int itemPrice;
        int itemQuantity;

        /* Type your code here. */
        //Item 1
        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        itemName = scnr.nextLine();
        System.out.println("Enter the item price:");
        itemPrice = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        itemQuantity = scnr.nextInt();

        ItemToPurchase item1 = new ItemToPurchase();
        item1.setName(itemName);
        item1.setPrice(itemPrice);
        item1.setQuantity(itemQuantity);
        System.out.println();

        scnr.nextLine();

        //Item 2
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        itemName = scnr.nextLine();
        System.out.println("Enter the item price:");
        itemPrice = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        itemQuantity = scnr.nextInt();
        System.out.println();

        ItemToPurchase item2 = new ItemToPurchase();
        item2.setName(itemName);
        item2.setPrice(itemPrice);
        item2.setQuantity(itemQuantity);

        //Total cost
        System.out.println("TOTAL COST");
        item1.printItemCost();
        item2.printItemCost();
        System.out.printf("\nTotal: $%d\n", item1.getTotalPrice() + item2.getTotalPrice());
    }
}