package Courierdelivery;

public class DeliveryAgent {

    private int agentId;
    private String name;
    private String phoneNumber;
    private String area;

    // Constructor
    public DeliveryAgent(int agentId, String name, String phoneNumber, String area) {
        this.agentId = agentId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.area = area;
    }

    public int getAgentId() {
        return agentId;
    }

    public String getName() {
        return name;
    }

    // Display delivery agent details
    public void displayAgent() {
        System.out.println("\n--- Delivery Agent Details ---");
        System.out.println("Agent ID: " + agentId);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Delivery Area: " + area);
    }
}