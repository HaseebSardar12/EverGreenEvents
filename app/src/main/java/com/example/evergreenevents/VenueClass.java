package com.example.evergreenevents;

public class VenueClass {
    private int imageResId;
    private String venueName;
    private String venueDescription;
    private String ownerName;
    private String yearsInBusiness;
    private String ownerContact;

    public VenueClass() {
    }

    public VenueClass(int imageResId, String venueName, String venueDescription, String ownerName, String yearsInBusiness, String ownerContact) {
        this.imageResId = imageResId;
        this.venueName = venueName;
        this.venueDescription = venueDescription;
        this.ownerName = ownerName;
        this.yearsInBusiness = yearsInBusiness;
        this.ownerContact = ownerContact;
    }

    public int getImage() {
        return imageResId;
    }

    public void setImage(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueDescription() {
        return venueDescription;
    }

    public void setVenueDescription(String venueDescription) {
        this.venueDescription = venueDescription;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getYearsInBusiness() {
        return yearsInBusiness;
    }

    public void setYearsInBusiness(String yearsInBusiness) {
        this.yearsInBusiness = yearsInBusiness;
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }
}
