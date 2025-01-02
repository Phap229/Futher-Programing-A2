package com.rental.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Owner extends Customer {
    private ArrayList<String> ownedPropertyIdS;
    private ArrayList<String> hostIds;

    public Owner(String id, String fullName, LocalDate dateOfBirth,
                 String contactInformation, ArrayList<String> agreementIds,
                 ArrayList<String> ownedPropertyIdS, ArrayList<String> hostIds) {
        super(id, fullName, dateOfBirth, contactInformation, agreementIds);
        this.ownedPropertyIdS = ownedPropertyIdS;
        this.hostIds = hostIds;
    }


    public List<String> getOwnedPropertyId() {
        return ownedPropertyIdS;
    }

    public void setOwnedPropertyId(ArrayList<String> ownedPropertyIdS) {
        this.ownedPropertyIdS = ownedPropertyIdS;
    }

    public List<String> getOwnedPropertyIdS() {
        return ownedPropertyIdS;
    }

    public void setOwnedPropertyIdS(ArrayList<String> ownedPropertyIdS) {
        this.ownedPropertyIdS = ownedPropertyIdS;
    }

    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(ArrayList<String> hostIds) {
        this.hostIds = hostIds;
    }
}
