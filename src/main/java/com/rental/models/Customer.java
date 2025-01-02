package com.rental.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends User{
    protected LocalDate dateOfBirth;
    protected String contactInformation;
    protected ArrayList<String> agreementIds;


    public Customer(String id, String fullName, LocalDate dateOfBirth, String contactInformation, ArrayList<String> agreementIds) {
        super(id, fullName);
        this.dateOfBirth = dateOfBirth;
        this.contactInformation = contactInformation;
        this.agreementIds = agreementIds;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public ArrayList<String> getAgreementIds() {
        return agreementIds;
    }

    public void setAgreementIds(ArrayList<String> agreementIds) {
        this.agreementIds = agreementIds;
    }
}
