package Assignments;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Assignment8 {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        String itemIsThere = "YES";
        Scanner sc = new Scanner(System.in);
        while (itemIsThere.equals("YES")) {
            System.out.println("enter item name:");

            String itemName = sc.next();
            System.out.println("enter the number of items:");
            int noOfItems = sc.nextInt();
            System.out.println("enter price of item:");
            double itemPrice = sc.nextInt();
            items.add(new Item(itemName, noOfItems, itemPrice));
            System.out.println("Again Items are there type yes or no");
            itemIsThere = sc.next();
        }

        System.out.println("Enter the customer name:");
        String name = sc.next();
        Order order = new Order(12, name, items);
        order.displayOrder();
        ViewOrderlist.processOrder(order);

    }

}

final class ViewOrderlist {
    public static void processOrder(Order order) {
        try (PrintWriter out = new PrintWriter("orders")) {
            out.println("******************************************************************************************8");
            out.println();
            out.printf("Order Id:%d                    Customer Name:%s %n", order.getOrderId(),
                    order.getCustomerName());
            out.println("==========================================================================================");
            out.printf("ITEMS        QUANTITY     PRICE   TOTALCOST\n ");
            out.println("===========================================================================================");
            for (Item item : order.getItems()) {
                out.printf("%-15s %-10d %-20.2f %4.2f %n", item.getItemName(), item.getQuantity(), item.getPrice(),
                        item.getTotalCost());

            }
            out.println(
                    "**************************************************************************************************");
            out.printf("Net Total:%f", +order.getNetTotal());

        } catch (IOException e) {
            System.out.println("error message:" + e.getMessage());
        } finally {
            System.out.println("Order processed successfully");
        }
    }
}

class Item {
    private String itemName;
    private int quantity;
    private double price;
    private double totalCost;

    public Item(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.totalCost = quantity * price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setitemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    class Order {
        private int orderId;
        private String customerName;
        private List<Item> items;
        private double netTotal;

        public Order(int orderId, String customerName, List<Item> items) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.items = items;
            this.netTotal = 0;
            for (Item item : items) {
                netTotal += item.getPrice();
            }

        }

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setOrderId(String customerName) {
            this.customerName = customerName;
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public double getNetTotal() {
            return netTotal;
        }

        public void setNetTotal(double netTotal) {
            this.netTotal = netTotal;
        }

        public void displayOrder() {
            System.out.println("****************************************************************************************");
            System.out.println();
            System.out.printf("Order Id:%d                    CustomerName:%s %n", orderId, customerName);
            System.out.println();
            System.out
                    .println("=======================================================================================");
            System.out.printf(" Items                Quantity   Price             TotalCost\n");
            System.out
                    .println("=======================================================================================");

            for (Item item : items) {
                System.out.printf("%-20s %-10d %-20.2f %4.2f %n", item.getItemName(), item.getQuantity(),
                        item.getPrice(), item.getTotalCost());

            }
            System.out.println("**************************************************************************************");
            System.out.printf("Net Total:%f", +netTotal);
        }
    }
}
