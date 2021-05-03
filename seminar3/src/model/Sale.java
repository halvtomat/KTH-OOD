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
        if(searchItem(item) > -1){
            itemList.get(searchItem(item)).quantity += quantity;
        }
        else {
            itemList.add(new ItemQuantity(item, quantity));
        }
        
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
        for(int i = 0; i<itemList.size(); i++){
            totalPrice += itemList.get(i).item.getPrice()*itemList.get(i).quantity;
        }
        return totalPrice;
    }

    public int payment(int amount){
        Receipt receipt = new Receipt(this, printer);
        receipt.print();
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
    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i<itemList.size(); i++){
            s += itemList.get(i).item.getDescription() + ": " + itemList.get(i).quantity + "x \n";
        }

        s += totalPrice + " \n";
        return s;
    
    }
}
