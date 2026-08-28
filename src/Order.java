import java.util.List;


public record Order(String orderId, List<Product> products, String customerEmail) {
  
    public double getTotalPrice() {
        double sum = 0;
      
        
     
        for (Product p : products) {
            sum += p.price();
        }
    
        
        return sum;
    }
}
