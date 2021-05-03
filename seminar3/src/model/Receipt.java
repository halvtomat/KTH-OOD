package model;
import integration.Printer;

public class Receipt {
    Sale sale;
    Printer printer;

    public Receipt(Sale sale, Printer printer) {
        this.sale = sale;
        this.printer = printer;
    }

    public void print() {
        printer.print(sale);
    }
}
