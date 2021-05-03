package startup;
import controller.Controller;
import view.View;
import integration.*;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        EAS eas = new EAS();
        EIS eis = new EIS();
        CustomerDB customerDB = new CustomerDB();
        Controller controller = new Controller(printer, eas, eis, customerDB);
        View view = new View(controller);

        while(true){
            view.printMenu();
            int input = view.nextInt();
            int id, quantity;

            switch(input) {
                case 1:
                    controller.initiateSale();
                    break;
                case 2:
                    id = view.nextInt();
                    controller.addItem(id);
                    view.printSale();
                    break;
                case 3:
                    id = view.nextInt();
                    quantity = view.nextInt();
                    controller.addItem(id, quantity);
                    view.printSale();
                    break;
                case 4:
                    controller.endSale();
                    view.printSale();
                    break;
                case 5:
                    id = view.nextInt();
                    controller.discountRequest(id);
                    break;
                case 6: 
                    quantity = view.nextInt();
                    controller.payment(quantity);
                    break;
            }
        }
    }
}

