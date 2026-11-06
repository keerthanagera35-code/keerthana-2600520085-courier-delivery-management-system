package Courierdelivery;

public class Tracking {

    private Parcel parcel;

    // Constructor
    public Tracking(Parcel parcel) {
        this.parcel = parcel;
    }

    // Track the parcel
    public void trackParcel() {
        System.out.println("\n--- Parcel Tracking ---");
        System.out.println("Parcel ID: " + parcel.getParcelId());
        System.out.println("Current Status: " + parcel.getStatus());
    }
}