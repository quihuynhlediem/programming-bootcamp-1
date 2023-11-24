package ExtraDay8.Lab17;

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    ItemToPurchase(){
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
        itemDescription = "none";
    }

    ItemToPurchase(String itemName,String itemDescription, int itemPrice, int itemQuantity){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;
    }

    public void setName(String _itemName){
        itemName = _itemName;
    }

    public String getName(){
        return itemName;
    }

    public void setPrice(int _itemPrice){
        itemPrice = _itemPrice;
    }

    public int getPrice(){
        return itemPrice;
    }

    public void setQuantity(int _itemQuantity){
        itemQuantity = _itemQuantity;
    }

    public int getQuantity(){
        return itemQuantity;
    }

    public void setDescription(String _itemDescription){
        itemDescription = _itemDescription;
    }

    public String getDescription(){
        return itemDescription;
    }

    public int getTotalPrice(){
        return itemPrice * itemQuantity;
    }

    public void printItemCost(){
        int totalPrice = getTotalPrice();
        System.out.printf("%s %d @ $%d = $%d\n", itemName, itemQuantity, itemPrice, totalPrice);
    }

    public void printItemDescription(){
        System.out.printf("%s: %s.\n", itemName, itemDescription);
    }
}
