package ExtraDay8.Lab17Demo;

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    ItemToPurchase(){
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    public void setName(String name) {
        itemName = name;
    }

    public  String getName() {
        return itemName;
    }

    public void setPrice(int price) {
        itemPrice = price;
    }

    public  int getPrice() {
        return itemPrice;
    }

    public void setQuantity(int quantity) {
        itemQuantity = quantity;
    }

    public  int getQuantity() {
        return itemQuantity;
    }

    public void printItem(){
        System.out.printf("%s %d @ $%d ",itemName,itemQuantity, itemPrice );
    }
}