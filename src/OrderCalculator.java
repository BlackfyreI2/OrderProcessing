public class OrderCalculator {
    public double calculateFinalPrice(Order order, DiscountStrategy strategy) {
        if (order == null || strategy == null)
            throw new IllegalArgumentException("order/strategy must not be null");
      
        
     
        return strategy.applyDiscount(order);
        
    }
}
