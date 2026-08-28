public class ShipmentFactory {
   
    public Shipment createShipment(String type) {
        if (type == null) throw new IllegalArgumentException("type must not be null");
        return switch (type.toUpperCase()) {
         
            /* ====== fill in the two cases here ====== */
            case "STANDARD" -> new StandardShipment();
            case "EXPRESS" -> new ExpressShipment();
            /* ======================================== */
            
           
            default -> /* ====== replace this ====== */ throw new IllegalArgumentException("unknown shipment type: " + type);
        };
    }
}
