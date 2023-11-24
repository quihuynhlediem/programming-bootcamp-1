package ExtraDay8.Lab18;

import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();

    ShoppingCart(){
        customerName = "none";
        currentDate = "January 1, 2016";
    }

    ShoppingCart(String _customerName, String _currentDate){
        customerName = _customerName;
        currentDate = _currentDate;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getDate(){
        return currentDate;
    }

    public void addItem(ItemToPurchase item){
        cartItems.add(item);
    }

    public void removeItem(String removedItemName){
        boolean foundItem = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getName().equals(removedItemName)){
                cartItems.remove(i);
                foundItem = true;
                break;
            }
        }
        if (!foundItem){
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }

    public void modifyItem(ItemToPurchase modifiedItem){
        boolean foundItem = false;
        String currItemName = modifiedItem.getName();
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getName().equals(currItemName)){
                if (modifiedItem.getDescription().equals("none")){
                    modifiedItem.setDescription(cartItems.get(i).getDescription());
                }
                if (modifiedItem.getPrice() == 0){
                    modifiedItem.setPrice(cartItems.get(i).getPrice());
                }
                if (modifiedItem.getQuantity() == 0){
                    modifiedItem.setQuantity(cartItems.get(i).getQuantity());
                }
                foundItem = true;
            }
        }
        if (!foundItem){
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    public int getNumItemsInCart(){
        return cartItems.size();
    }

    public int getCostOfCart(){
        int cartTotalCost = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            cartTotalCost += cartItems.get(i).getTotalPrice();
        }
        return cartTotalCost;
    }

    public void printTotal(){
        System.out.printf("%s's Shopping Cart - %s\n", customerName, currentDate);
        System.out.printf("Number of Items: %d\n\n", getNumItemsInCart());

        if (cartItems.isEmpty()){
            System.out.println("SHOPPING CART IS EMPTY");
        }
        else {
            for (int i = 0; i < cartItems.size(); i++) {
                cartItems.get(i).printItemCost();
            }
        }
        System.out.printf("\nTotal: $%d\n\n", getCostOfCart());
    }

    public void printDescriptions(){
        if (cartItems.size() == 0){
            System.out.println("SHOPPING CART IS EMPTY");
        }
        else {
            System.out.printf("%s's Shopping Cart - %s\n\n", customerName, currentDate);
            System.out.println("Item Descriptions");
            for (int i = 0; i < cartItems.size(); i++) {
                cartItems.get(i).printItemDescription();
            }
        }

    }

}
