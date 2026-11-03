
package labsheet.pkg7;

public class LabSheet7 {

    
    public static void main(String[] args) {
       Customer c1 = new Customer("Nilay", "5551112233", "Bagdat Cd.", "Kadikoy", "Istanbul");
        Customer c2 = new Customer("Berra", "5552223344", "Ataturk Cd.", "Cankaya", "Ankara");

        Order o1 = new Order(c1);
        Order o2 = new Order(c2);

        System.out.println("Order 1 Number: " + o1.getOrderNumber());
        System.out.println("Order 2 Number: " + o2.getOrderNumber());

        o1.addItem(new MenuItem("Burger", 150.0, 1));
        o1.addItem(new MenuItem("Burger", 150.0, 1));
        o1.addItem(new MenuItem("Cola", 40.0, 2));

        o1.updateQuantity("Cola", 1);
        o1.removeItem("Burger", 1);

        Cupon validCoupon = new Cupon("DISCOUNT10", 0.1, 100.0);
        o1.applyCoupon(validCoupon);

        o1.checkout();
        o1.checkout();

        o2.addItem(new MenuItem("Water", 10.0, 1));
        o2.checkout();

        System.out.println("Completed Orders: " + Order.getCompletedOrders());
        System.out.println("Total Revenue: " + Order.getTotalRevenue());
    }
    
}
