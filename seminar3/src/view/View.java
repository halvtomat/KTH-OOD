package view;
import controller.Controller;
import java.util.Scanner;

public class View {
    Controller controller;
    Scanner scanner;
    public View(Controller controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void printMenu() {
        System.out.print(
            "\n1. Initiate Sale\n" +
            "2. Add item\n" +
            "3. Add item with quantity\n" +
            "4. End Sale\n" +
            "5. Discount Request\n" +
            "6. Payment\n" + 
            "7. Shutdown\n\n"
        );
    }

    public int nextInt() {
        return scanner.nextInt();
    }

    public void printSale() {
        System.out.print(controller.saleToString());
    }

    public void printTotalPrice(int totalPrice) {
        System.out.print("\n----------\nTOTAL PRICE: " + totalPrice + "\n----------\n");
    }

    public void printChange(int change) {
        System.out.print("\n----------\nCHANGE: " + change + "\n----------\n");
    }
}
