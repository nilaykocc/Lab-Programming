
package labsheet.pkg7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nilay
 */
public class Order {
    
    private static int nextOrderNumber = 1001;
    public static final double MIN_ORDER = 100.0;
    public static final double DELIVERY_FEE = 20.0;
    private static int completedOrders = 0;
    private static double totalRevenue = 0.0;

    private int orderNumber;
    private Customer customer;
    private ArrayList<MenuItem> items;
    private boolean isCompleted;
    private Cupon appliedCoupon;

    public Order(Customer customer) {
        this.orderNumber = nextOrderNumber++;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.isCompleted = false;
        this.appliedCoupon = null;
    }

    public void addItem(MenuItem item) {
        boolean found = false;
        for (MenuItem existingItem : items) {
            if (existingItem.getName().equalsIgnoreCase(item.getName())) {
                existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
                found = true;
                break;
            }
        }
        if (!found) {
            items.add(new MenuItem(item.getName(), item.getPrice(), item.getQuantity()));
        }
    }

    public boolean removeItem(String name, int quantity) {
        for (MenuItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                if (item.getQuantity() > quantity) {
                    item.setQuantity(item.getQuantity() - quantity);
                } else {
                    items.remove(item);
                }
                return true;
            }
        }
        return false;
    }

    public void updateQuantity(String name, int quantity) {
        for (MenuItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.setQuantity(quantity);
                break;
            }
        }
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (MenuItem item : items) {
            subtotal += item.getTotalPrice();
        }
        return subtotal;
    }

    public List<MenuItem> getItems() {
        List<MenuItem> copy = new ArrayList<>();
        for (MenuItem item : items) {
            copy.add(new MenuItem(item.getName(), item.getPrice(), item.getQuantity()));
        }
        return copy;
    }

    public void applyCoupon(Cupon coupon) {
        this.appliedCoupon = coupon;
    }

    public double checkout() {
        if (isCompleted) {
            return 0.0;
        }

        double subtotal = getSubtotal();
        if (subtotal < MIN_ORDER) {
            return 0.0;
        }

        double discount = 0;
        if (appliedCoupon != null && subtotal >= appliedCoupon.getMinSubtotal()) {
            discount = subtotal * appliedCoupon.getDiscountRate();
        }

        double total = subtotal - discount + DELIVERY_FEE;

        System.out.println("--- RECEIPT ---");
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Customer: " + customer.getName() + " - " + customer.getAddress());
        System.out.println("Items:");
        for (MenuItem item : items) {
            System.out.println(" - " + item);
        }
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Coupon Discount: " + discount);
        System.out.println("Delivery Fee: " + DELIVERY_FEE);
        System.out.println("Total: " + total);

        isCompleted = true;
        completedOrders++;
        totalRevenue += total;

        return total;
    }

    public static int getCompletedOrders() {
        return completedOrders;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
