package com.rental.models;

import java.util.List;

public class ResidentialProperty extends Property {
    private int bedrooms;
    private boolean garden;
    private boolean petFriendly;

    public ResidentialProperty(String propertyId, String address, double pricing, PropertyStatus status,
                               String ownerId, List<String> hostIds,
                               int bedrooms, boolean garden, boolean petFriendly) {
        super(propertyId, address, pricing, status, ownerId, hostIds);
        this.bedrooms = bedrooms;
        this.garden = garden;
        this.petFriendly = petFriendly;
    }


    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public boolean hasGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }
}