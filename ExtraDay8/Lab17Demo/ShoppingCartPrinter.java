package ExtraDay8.Lab17Demo;

import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main (String[] args){
        Scanner scnr = new Scanner(System.in);
        String name;
        int price;
        int quantity;
        int total1 =0;
        int total2 = 0;
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();
        //Item1
        System.out.println("Item "+ 1);
        System.out.println("Enter the item name:");
        name = scnr.nextLine();

        System.out.println("Enter the item price:");
        price = scnr.nextInt();

        System.out.println("Enter the item quantity:");
        quantity = scnr.nextInt();

        item1.setName(name);
        item1.setPrice(price);
        item1.setQuantity(quantity);
        total1 += price* quantity;
        System.out.println();
        scnr.nextLine();

        //item2
        System.out.println("Item " + 2);

        System.out.println("Enter the item name:");
        name = scnr.nextLine();

        System.out.println("Enter the item price:");
        price = scnr.nextInt();

        System.out.println("Enter the item quantity:");
        quantity = scnr.nextInt();

        item2.setName(name);
        item2.setPrice(price);
        item2.setQuantity(quantity);

        System.out.println();
        total2 += price * quantity;
        //Total cost
        System.out.println("TOTAL COST");
        item1.printItem();
        System.out.println("= $" + total1);
        item2.printItem();
        System.out.println("= $" + total2);
        System.out.println();
        System.out.printf("Total: $%d\n",total1+total2);

    }
}
