package integration;

public class Item {
    int identifier;
    String description;
    int price;
    int vatRate; 
    
    public Item(int itemIdentifier) {
        this.identifier = itemIdentifier;

        switch(identifier) {
            case 0:
                description = "banana";
                price = 1337;
                vatRate = 0;
                break;
            
            case 1:
                description = "toilet paper";
                price = 1;
                vatRate = 100;
                break;

            case 2:
                description = "hot dog";
                price = 2;
                vatRate = 99;
                break;

            case 3:
                description = "gold bar";
                price = 5;
                vatRate = 1;
                break;

            case 4:
                description = "snickers";
                price = Integer.MAX_VALUE;
                vatRate = 25;
                break;
        }
    }
    public int getIdentifier() {
        return this.identifier;
    }

    public int getPrice() {
        return this.price;
    }

    public int getVat() {
        return this.vatRate * price / 100;
    }

    public String getDescription() {
        return this.description;
    }
}
