public class InsuranceDecorator extends ShipmentDecorator {
    private final Order order;

    public InsuranceDecorator(Shipment wrappedShipment, Order order) {
        super(wrappedShipment);
        if (order == null) throw new IllegalArgumentException("order must not be null");
        this.order = order;
    }

    @Override 
    public String getInfo() {
       
        
        /* ====== fill in here ====== */
        return wrappedShipment.getInfo() + " + Insurance";
        /* ========================== */
    }

    @Override 
    public double getCost() {
        
        
        /* ====== fill in here ====== */
        return wrappedShipment.getCost() + order.getTotalPrice() * 0.10;
        /* ========================== */
    }
}
