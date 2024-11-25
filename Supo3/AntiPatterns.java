class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches cannot fly");
    }
}

public class OrderManager {

    // Handles user authentication
    public boolean authenticateUser(String username, String password) {
        return username.equals("admin") && password.equals("password");
    }

    // Creates an order
    public void createOrder(String product, int quantity) {
        System.out.println("Order created for: " + product + ", Quantity: " + quantity);
    }

    // Processes payment
    public void processPayment(String paymentMethod, double amount) {
        System.out.println("Payment of " + amount + " processed via " + paymentMethod);
    }

    // Ships the order
    public void shipOrder(String address) {
        System.out.println("Order shipped to: " + address);
    }

    // Generates a report
    public void generateReport() {
        System.out.println("Generating order report...");
    }

    // High-level method that orchestrates the entire process
    public void handleOrder(String username, String password, String product, int quantity, String paymentMethod, double amount, String address) {
        if (authenticateUser(username, password)) {
            createOrder(product, quantity);
            processPayment(paymentMethod, amount);
            shipOrder(address);
            generateReport();
        } else {
            System.out.println("Authentication failed!");
        }
    }
}