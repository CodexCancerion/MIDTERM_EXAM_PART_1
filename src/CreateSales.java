import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class CreateSales {
    public static void main(String[] args) {
        Employee emp1 = new Employee("88088");
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Sales> sales = new ArrayList<>();

        products.add(new Product("1000", "Apple", 25, 50));
        products.add(new Product("1001", "Pineapple", 45, 80));
        products.add(new Product("1002", "Dragon Fruit", 60, 100));
        products.add(new Product("1003", "Banana", 85, 150));
        products.add(new Product("1004", "Coconut", 25, 50));
        products.add(new Product("1005", "Rambutan", 90, 90));

        sales.add(new Sales("20230001", emp1, products.get(0), 15, new Date()));
        sales.add(new Sales("20230001", emp1, products.get(1), 20, new Date()));
        sales.add(new Sales("20230001", emp1, products.get(2), 56, new Date()));
        sales.add(new Sales("20230001", emp1, products.get(3), 73, new Date()));
        sales.add(new Sales("20230001", emp1, products.get(4), 36, new Date()));
        sales.add(new Sales("20230001", emp1, products.get(5), 8, new Date()));

        //INVENTORY
        System.out.println("INVENTORY");
                for (Product i : products) {
            System.out.println(i.toString());
        }
        System.out.println();

        //SALES
        System.out.println("SALES");
        System.out.printf("%-35s %-15s %-10s %-10s %-20s %-10s %-10s\n",
                "TRANSACTION DATE",
                "TRANSACTION NO.",
                "EMP ID",
                "PROD ID",
                "PROD NAME",
                "PRICE",
                "AMOUNT DUE");
        for (Sales i : sales) {
            System.out.println(i.toString());
        }
        System.out.println();

        //TOTAL SALES
        double totalSales = 0;
        for (Sales i : sales) {
            totalSales += i.getAmountDue();
        }
        System.out.println("TOTAL SALES: " +totalSales);
        System.out.println();

        //HIGHEST SALE TRANSACTION
        System.out.println("HIGHEST SALE TRANSACTION");
        System.out.printf("%-35s %-15s %-10s %-10s %-20s %-10s %-10s\n",
                "TRANSACTION DATE",
                "TRANSACTION NO.",
                "EMP ID",
                "PROD ID",
                "PROD NAME",
                "PRICE",
                "AMOUNT DUE");
        Collections.sort(sales, new AmountDueComparator().reversed());
        for (Sales i : sales) {
            System.out.println(i.toString());
        }

    }
}
