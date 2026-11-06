
package Courierdelivery;

public class Parcel {

    private String parcelId;
    private String senderName;
    private String senderPhone;
    private String receiverName;
    private String receiverPhone;
    private String fromCity;
    private String toCity;
    private double weight;
    private double price;
    private String status;

    // Constructor
    public Parcel(String parcelId, String senderName,
                  String senderPhone, String receiverName,
                  String receiverPhone, String fromCity,
                  String toCity, double weight,
                  double price, String status) {

        this.parcelId = parcelId;
        this.senderName = senderName;
        this.senderPhone = senderPhone;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.weight = weight;
        this.price = price;
        this.status = status;
    }

    // Getter methods
    public String getParcelId() {
        return parcelId;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Display complete parcel details
    public void displayDetails() {

        System.out.println("\n-------- PARCEL FULL DETAILS --------");

        System.out.println("Parcel ID       : " + parcelId);
        System.out.println("Sender Name     : " + senderName);
        System.out.println("Sender Phone    : " + senderPhone);
        System.out.println("Receiver Name   : " + receiverName);
        System.out.println("Receiver Phone  : " + receiverPhone);
        System.out.println("From City       : " + fromCity);
        System.out.println("To City         : " + toCity);
        System.out.println("Weight          : " + weight + " kg");
        System.out.println("Price           : " + price);
        System.out.println("Status          : " + status);

        System.out.println("-------------------------------------");
    }
}
