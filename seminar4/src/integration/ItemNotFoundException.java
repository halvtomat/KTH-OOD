package integration;

public class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}