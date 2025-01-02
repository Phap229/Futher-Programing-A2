package com.rental.models;

import java.time.LocalDate;
import java.util.List;

public class RentalAgreement {

    private String agreementId;
    private String ownerID;
    private List<String> hostIds;
    private String mainTenantId;
    private List<String> subTenantIds;
    private String propertyId;
    private RentalAgreementPeriod period;
    private LocalDate contractDate;
    private double rentingFee;
    private RentalAgreementStatus status;

    public RentalAgreement(String agreementId, String ownerID, List<String> hostIds, String mainTenantId,
                           List<String> subTenantIds, String propertyId, RentalAgreementPeriod period, LocalDate contractDate,
                           double rentingFee, RentalAgreementStatus status) {
        this.agreementId = agreementId;
        this.ownerID = ownerID;
        this.hostIds = hostIds;
        this.mainTenantId = mainTenantId;
        this.subTenantIds = subTenantIds;
        this.propertyId = propertyId;
        this.period = period;
        this.contractDate = contractDate;
        this.rentingFee = rentingFee;
        this.status = status;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    public String getMainTenantId() {
        return mainTenantId;
    }

    public void setMainTenantId(String mainTenantId) {
        this.mainTenantId = mainTenantId;
    }

    public List<String> getSubTenantIds() {
        return subTenantIds;
    }

    public void setSubTenantIds(List<String> subTenantIds) {
        this.subTenantIds = subTenantIds;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public RentalAgreementPeriod getPeriod() {
        return period;
    }

    public void setPeriod(RentalAgreementPeriod period) {
        this.period = period;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public double getRentingFee() {
        return rentingFee;
    }

    public void setRentingFee(double rentingFee) {
        this.rentingFee = rentingFee;
    }

    public RentalAgreementStatus getStatus() {
        return status;
    }

    public void setStatus(RentalAgreementStatus status) {
        this.status = status;
    }
}