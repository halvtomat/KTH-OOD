package integration;
import model.Sale;

public class EIS {
    public EIS() {
        
    }

    public Item getItem(int itemIdentifier) {
        return new Item(itemIdentifier);
    }

    public Boolean checkValid(int itemIdentifier) {
        if(itemIdentifier < 5 && itemIdentifier >= 0)
            return true;
        else
            return false;
    }

    public void completedSale(Sale sale) {
        System.out.println("EIS completing sale");
    }
}
