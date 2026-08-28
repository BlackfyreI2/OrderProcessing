public class PercentageDiscount implements DiscountStrategy {
    private final double percent;

    public PercentageDiscount(double percent) {
        if (percent < 0 || percent > 100)
            throw new IllegalArgumentException("percent must be 0-100");
        this.percent = percent;
    }

    @Override 
    public double applyDiscount(Order order) {
        double total = order.getTotalPrice();
      
        return total - (total * percent / 100.0);
     
    }
}
