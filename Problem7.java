
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double commissionRate = 0;
        double totalSales = 0;
        String name;

        System.out.println("Enter Employee name");
        name = scanner.nextLine();

        System.out.println("Enter Total sales");
        totalSales = scanner.nextDouble();

        if(totalSales < 10000) {
            commissionRate = 0.00;
        } else if (totalSales >= 10000 && totalSales <= 20000) {
            commissionRate = 0.03;
        } else if (totalSales >= 20001 && totalSales <= 30000) {
            commissionRate = 0.05;
        } else if (totalSales >= 30001 && totalSales <= 50000) {
            commissionRate = 0.07;
        } else {
            commissionRate = 0.10;
        }

        double commission = totalSales * commissionRate;
        double totalEarnings = totalSales + commission;

        System.out.println("Commission: " + (commissionRate * 100) + "%");
        System.out.println("Total Commission: " + commission);
        System.out.println("Total Earnings: " + totalEarnings);
    }
}
