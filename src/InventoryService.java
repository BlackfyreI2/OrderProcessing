public class InventoryService implements OrderObserver {
    @Override 
    public void update(Order order) {
      
        /* ====== fill in 1 line here ====== */
        System.out.println("Inventory updated for order " + order.orderId());
        /* ================================= */
    }
}
