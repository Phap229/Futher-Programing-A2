package com.rental.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Host extends Customer {
    private ArrayList<String> propertyIds;
    private ArrayList<String> coopOwnerIds;

    public Host(String id, String fullName, LocalDate dateOfBirth, String contactInformation,
                ArrayList<String> propertyIds, ArrayList<String> coopOwnerIds, ArrayList<String> agreementIds) {
        super(id, fullName, dateOfBirth, contactInformation, agreementIds);
        this.propertyIds = propertyIds;
        this.coopOwnerIds = coopOwnerIds;

    }

    public ArrayList<String> getPropertyIds() {
        return propertyIds;
    }

    public void setPropertyIds(ArrayList<String> propertyIds) {
        this.propertyIds = propertyIds;
    }

    public List<String> getCoopOwnerIds() {
        return coopOwnerIds;
    }

    public void setCoopOwnerIds(ArrayList<String> coopOwnerIds) {
        this.coopOwnerIds = coopOwnerIds;
    }
}
