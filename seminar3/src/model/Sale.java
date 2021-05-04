package model;
import integration.CustomerDB;
import integration.Item;
import integration.Printer;
import java.util.List;
import java.util.ArrayList;

public class Sale {

    private class ItemQuantity{
        Item item;
        int quantity;
        public ItemQuantity(Item item, int quantity){
            this.item = item;
            this.quantity = quantity;
        }
    }
    
    private int totalPrice = 0;
    private List<ItemQuantity> itemList;
    CustomerDB customerDB;
    Printer printer;

    public Sale(CustomerDB customerDB, Printer printer){
        this.customerDB = customerDB;
        this.printer = printer;
        itemList = new ArrayList();
    }

    public void update(Item item, int quantity){
        if(searchItem(item) > -1)
            itemList.get(searchItem(item)).quantity += quantity;
        else 
            itemList.add(new ItemQuantity(item, quantity));
        totalPrice += item.getPrice() * quantity;
    }

    public int searchItem(Item item){
        for(int i = 0; i < itemList.size(); i++){
            if(itemList.get(i).item.getIdentifier() == item.getIdentifier()){
                return i;
            }
        }
        return -1;
    }

    public int endSale(){
        return totalPrice;
    }

    public int payment(int amount){
        printer.print(this);
        return amount-totalPrice;
    }

    public int applyDiscount(int customerId){
        if(customerDB.checkDiscount(customerId)){
            return totalPrice = totalPrice/2;
        }
        else {
            return totalPrice;
        }
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    @Override
    public String toString() {
        String printOut = "\n----- SALE INFO -----\n";
        for(int i = 0; i < itemList.size(); i++){
            printOut += itemList.get(i).item.getDescription() + ": " + itemList.get(i).quantity + "x \n";
        }

        printOut += "Total Price: " + totalPrice + "\n" + "----- SALE INFO -----\n\n";
        return printOut;
    }
}
