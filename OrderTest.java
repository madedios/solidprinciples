public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        // Additional functionalities for AdvancedOrder
        InvoiceGenerator invoiceGenerator = new AdvancedOrder();
        EmailNotifier emailNotifier = new AdvancedOrder();

        invoiceGenerator.generateInvoice("order_123.pdf");
        emailNotifier.sendEmailNotification("johndoe@example.com");
    }
}