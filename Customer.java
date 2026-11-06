package Courierdelivery;

import java.util.ArrayList;

public class Customer {

    private int customerId;
    private String name;
    private String phoneNumber;
    private ArrayList<Parcel> customerParcels;

    // Constructor
    public Customer(int customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.customerParcels = new ArrayList<>();
    }

    // Getter methods
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Parcel> getCustomerParcels() {
        return customerParcels;
    }

    // Add parcel to customer
    public void addParcel(Parcel parcel) {
        this.customerParcels.add(parcel);
    }

    // Display customer details along with all associated parcels
    public void displayCustomer() {
        System.out.println("\n--- Customer Details ---");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        
        System.out.println("--- Associated Parcels (" + customerParcels.size() + ") ---");
        if (customerParcels.isEmpty()) {
            System.out.println("No parcels registered for this customer.");
        } else {
            for (Parcel p : customerParcels) {
                p.displayDetails();
            }
        }
    }
}