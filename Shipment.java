package Courierdelivery;

public class Shipment {

    private int shipmentId;
    private Parcel parcel;
    private DeliveryAgent agent;

    // Constructor
    public Shipment(int shipmentId, Parcel parcel, DeliveryAgent agent) {
        this.shipmentId = shipmentId;
        this.parcel = parcel;
        this.agent = agent;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public Parcel getParcel() {
        return parcel;
    }

    public DeliveryAgent getAgent() {
        return agent;
    }

    // Display shipment information
    public void displayShipment() {
        System.out.println("\n--- Shipment Details ---");
        System.out.println("Shipment ID: " + shipmentId);
        System.out.println("Parcel ID: " + parcel.getParcelId());
        System.out.println("Assigned Agent: " + agent.getName() + " (ID: " + agent.getAgentId() + ")");
    }
}