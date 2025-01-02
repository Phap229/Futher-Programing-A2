package com.rental.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tenant extends Customer {
    private List<String> paymentIds;

    public Tenant(String id, String fullName, LocalDate dateOfBirth, String contactInformation,
                  ArrayList<String> agreementIds, ArrayList<String> paymentIds) {
        super(id, fullName, dateOfBirth, contactInformation, agreementIds);
        this.paymentIds = paymentIds;
    }

    public List<String> getPaymentIds() {
        return (ArrayList<String>) paymentIds;
    }

    public void setPaymentIds(List<String> paymentIds) {
        this.paymentIds = paymentIds;
    }
}
