package edu.pitt.dbmi.ohdsiv5.db;

import java.sql.Timestamp;

import edu.pitt.dbmi.ohdsiv5.db.DrugStrength;

/**
 * DrugExposure generated by hbm2java
 */

public class ExtendedDrugExposure extends DrugExposure {

    // Constructors
    /** default constructor */
    public ExtendedDrugExposure() {
    }
    /** full constructor */
    public ExtendedDrugExposure (Long drugExposureId,
            // Timestamp drugExposureStartDateCal,
            // Timestamp drugExposureEndDateCal,
            Timestamp drugExposureStartDate,
            Timestamp drugExposureEndDate,
            Long personId,
            Integer drugConceptId,
            Integer drugTypeConceptId,
            String stopReason,
            Short refills,
            Integer drugQuantity,
            Short daysSupply,
            String sig,
            Integer sigExpected,
            Integer sigMin,
            Integer sigMax,  
            Integer routeConceptId,
            String lotNumber,
            Integer providerId,
            Long visitOccurrenceId,
            String drugSourceValue,
            Integer drugSourceConceptId,
            String routeSourceValue,
            String doseUnitSourceValue,
            Integer ingredientConceptId,
            Double amountValue,
            Integer amountUnitConceptId,
            Double numeratorValue,
            Integer numeratorUnitConceptId,
            Double denominatorValue,
            Integer denominatorUnitConceptId,
            Double dailyDosage,
            Integer indicationConceptId,
            String conceptName
            ) {
        this.drugExposureId = drugExposureId;
        this.drugExposureStartDateCal = drugExposureStartDateCal;
        this.drugExposureEndDateCal = drugExposureEndDateCal;
        this.drugExposureStartDate = drugExposureStartDate;
        this.drugExposureEndDate = drugExposureEndDate;
        this.personId = personId;
        this.drugConceptId = drugConceptId;
        this.drugTypeConceptId = drugTypeConceptId;
        this.stopReason = stopReason;
        this.refills = refills;
        this.drugQuantity = drugQuantity;
        this.daysSupply = daysSupply;
        this.sig = sig;
        this.sigExpected = sigExpected;
        this.sigMin = sigMin;
        this.sigMax = sigMax;
        this.routeConceptId = routeConceptId;
        this.lotNumber = lotNumber;
        this.providerId = providerId;
        this.visitOccurrenceId = visitOccurrenceId;
        this.drugSourceValue = drugSourceValue;
        this.drugSourceConceptId = drugSourceConceptId;
        this.routeSourceValue = routeSourceValue;
        this.doseUnitSourceValue = doseUnitSourceValue;
        this.ingredientConceptId = ingredientConceptId;
        this.amountValue = amountValue;
        this.amountUnitConceptId = amountUnitConceptId;
        this.numeratorValue = numeratorValue;
        this.numeratorUnitConceptId = numeratorUnitConceptId;
        this.denominatorValue = denominatorValue;
        this.denominatorUnitConceptId = denominatorUnitConceptId;
        this.dailyDosage = dailyDosage;
        this.indicationConceptId = indicationConceptId;
        this.drugConceptName = conceptName;
    }

    public String getLogInfo() {
        String s = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s", 
            this.getDrugConceptId(),
            this.getDrugConceptName(),
            this.routeSourceValue,
            this.getAmountValue(),
            this.getSigExpected(),
            this.getDailyDosage(),    
            this.getDrugExposureStartDate().toString(),
            this.getDrugExposureEndDate().toString()
        );
        return s;
    }

    String drugConceptName;
    public String getDrugConceptName() {
        return this.drugConceptName;
    }
    public void setDrugConceptName(String drugConceptName) {
        this.drugConceptName = drugConceptName;
    }

    Timestamp drugExposureStartDateCal;
    public Timestamp getDrugExposureStartDateCal() {
        return this.drugExposureStartDateCal;
    }
    public void setDrugExposureStartDateCal(Timestamp drugExposureStartDateCal) {
        this.drugExposureStartDateCal = drugExposureStartDateCal;
    }
    
    Timestamp drugExposureEndDateCal;
    public Timestamp getDrugExposureEndDateCal() {
        return this.drugExposureEndDateCal;
    }
    public void setDrugExposureEndDateCal(Timestamp drugExposureEndDateCal) {
        this.drugExposureEndDateCal = drugExposureEndDateCal;
    }

    public Double getDateDiffFromStartInMillis(Timestamp otherDate) {
        if (this.drugExposureStartDate != null) {
            double diff = (otherDate.getTime() - this.drugExposureStartDate.getTime());
            return diff;
        }
        else return null;
    }
    

        Integer sigExpected;
    public Integer getSigExpected() {
        return this.sigExpected;
    }
    public void setSigExpected(Integer sigExpected) {
        this.sigExpected = sigExpected;
    }

        Integer sigMin;
    public Integer getSigMin() {
        return this.sigMin;
    }
    public void setSigMin(Integer sigMin) {
        this.sigMin = sigMin;
    }

        Integer sigMax;
    public Integer getSigMax() {
        return this.sigMax;
    }
    public void setSigMax(Integer sigMax) {
        this.sigMax = sigMax;
    }


        Integer ingredientConceptId;
    public Integer getIngredientConceptId() {
    return this.ingredientConceptId;
    }
    public void setIngredientConceptId(Integer ingredientConceptId) {
    this.ingredientConceptId = ingredientConceptId;
    }
    
        Double amountValue;
    public Double getAmountValue() {
        return this.amountValue;
    }    
    public void setAmountValue(Double amountValue) {
        this.amountValue = amountValue;
    }
       
        Integer amountUnitConceptId;
    public Integer getAmountUnitConceptId() {
    return this.amountUnitConceptId;
    }
    public void setAmountUnitConceptId(Integer amountUnitConceptId) {
    this.amountUnitConceptId = amountUnitConceptId;
    }

        Double numeratorValue;
    public Double getNumeratorValue() {
    return this.numeratorValue;
    }
    public void setNumeratorValue(Double numeratorValue) {
    this.numeratorValue = numeratorValue;
    }

        Integer numeratorUnitConceptId;
    public Integer getNumeratorUnitConceptId() {
    return this.numeratorUnitConceptId;
    }
    public void setNumeratorUnitConceptId(Integer numeratorUnitConceptId) {
    this.numeratorUnitConceptId = numeratorUnitConceptId;
    }

        Double denominatorValue;
    public Double getDenominatorValue() {
    return this.denominatorValue;
    }
    public void setDenominatorValue(Double denominatorValue) {
    this.denominatorValue = denominatorValue;
    }
    
        Integer denominatorUnitConceptId;
    public Integer getDenominatorUnitConceptId() {
    return this.denominatorUnitConceptId;
    }
    public void setDenominatorUnitConceptId(Integer denominatorUnitConceptId) {
    this.denominatorUnitConceptId = denominatorUnitConceptId;
    }

        Double dailyDosage;
    public Double getDailyDosage() {
        return this.dailyDosage;
    }    
    public void setNullDailyDosage(Double amountValue) {
    this.dailyDosage = amountValue;
    }
    public void setRegDailyDosage(Integer drugQuantity, Short daysSupply, Double amountValue) {
    dailyDosage = ((drugQuantity * amountValue) / daysSupply);
    this.dailyDosage = dailyDosage;               
    }  
    public void setComplexDailyDosage(Integer drugQuantity, Short daysSupply, Double numeratorValue){
    dailyDosage = ((drugQuantity * numeratorValue) / daysSupply);
    this.dailyDosage = dailyDosage;
    }
    public void setSigDailyDosage(Double amountValue, Double sigExpected) {
        dailyDosage = amountValue * sigExpected;
        this.dailyDosage = dailyDosage;
    }
}
 
