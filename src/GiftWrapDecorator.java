public class GiftWrapDecorator extends ShipmentDecorator {
    private static final double GIFT_WRAP_FEE = 50.0;

    public GiftWrapDecorator(Shipment wrappedShipment) {
        super(wrappedShipment);
    }

    @Override 
    public String getInfo() {
    
        
        /* ====== fill in here ====== */
        return wrappedShipment.getInfo() + " + Gift Wrapped";
        /* ========================== */
    }

    @Override 
    public double getCost() {
      
        
        /* ====== fill in here ====== */
        return wrappedShipment.getCost() + GIFT_WRAP_FEE;
        /* ========================== */
    }
}
