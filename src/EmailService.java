public class EmailService implements OrderObserver {
    @Override 
    public void update(Order order) {
       
        
        /* ====== fill in 1 line here ====== */
        System.out.println("Confirmation email sent to " + order.customerEmail());
        /* ================================= */
    }
}
