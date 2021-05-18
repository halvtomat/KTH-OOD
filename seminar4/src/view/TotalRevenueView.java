package view;
import model.RevenueObserver;

public class TotalRevenueView implements RevenueObserver {
    private int totalRevenue;
    
    public TotalRevenueView() {
        totalRevenue = 0;
    }

    public void completedSale(int totalPrice) {
        totalRevenue += totalPrice;
        printRevenue();
    }

    private void printRevenue() {
        System.out.println("Total Revenue: " + totalRevenue + " pesos");
    }
}
