package controller;
import integration.*;
import model.Sale;

public class Controller {

    private Printer printer;
    private EAS eas;
    private EIS eis;
    private CustomerDB customerDB;
    private Sale sale;

    public Controller(Printer printer, EAS eas, EIS eis, CustomerDB customerDB) {
        this.printer = printer;
        this.eas = eas;
        this.eis = eis;
        this.customerDB = customerDB;
    }

    public void initiateSale() {
        this.sale = new Sale(customerDB, printer); 
    }

    public void addItem(int itemIdentifier, int quantity) {
        boolean isValid = eis.checkValid(itemIdentifier);
        
        if(isValid) {
            Item item = eis.getItem(itemIdentifier);
            sale.update(item, quantity);
        }
    }

    public void addItem(int itemIdentifier) {
        addItem(itemIdentifier, 1);
    }

    public int endSale() {
        return sale.endSale();
    }

    public int discountRequest(int customerId) {
        return sale.applyDiscount(customerId);
    }

    public int payment(int amount) {
        int changeAmount = sale.payment(amount);
        eis.completedSale(sale);
        eas.completedSale(sale);
        this.sale = null;
        return changeAmount;
    }

    public String saleToString() {
        return sale.toString();
    }
}
