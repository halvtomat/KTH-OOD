package integration;

public class CustomerDB {
    public CustomerDB() {

    }

    public Boolean checkDiscount(int customerId) {
        if(customerId > 69 && customerId < 420)
            return true;
        else 
            return false;
    }
}
