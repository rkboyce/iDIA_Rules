package edu.pitt.dbmi.ohdsiv5.db;
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlinesimport java.util.Calendar;
               # Replace Windows newlines with Unix newlinesimport java.sql.Timestamp;
               # Replace Windows newlines with Unix newlinesimport javax.persistence.Column;
               # Replace Windows newlines with Unix newlinesimport javax.persistence.Entity;
               # Replace Windows newlines with Unix newlinesimport javax.persistence.GeneratedValue;
               # Replace Windows newlines with Unix newlinesimport javax.persistence.GenerationType;
               # Replace Windows newlines with Unix newlinesimport javax.persistence.Id;
               # Replace Windows newlines with Unix newlinesimport javax.persistence.SequenceGenerator;
               # Replace Windows newlines with Unix newlinesimport javax.persistence.Table;
               # Replace Windows newlines with Unix newlinesimport javax.persistence.Transient;
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines/**
               # Replace Windows newlines with Unix newlines * DrugExposure generated by hbm2java
               # Replace Windows newlines with Unix newlines */
               # Replace Windows newlines with Unix newlines@Entity
               # Replace Windows newlines with Unix newlines@Table(name="DRUG_EXPOSURE")
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlinespublic class DrugExposure  implements java.io.Serializable {
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    // Constructors
               # Replace Windows newlines with Unix newlines    /** default constructor */
               # Replace Windows newlines with Unix newlines    public DrugExposure() {
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    /** full constructor */
               # Replace Windows newlines with Unix newlines    public DrugExposure(Long drugExposureId,
               # Replace Windows newlines with Unix newlines            // Calendar drugExposureStartDate,
               # Replace Windows newlines with Unix newlines            // Calendar drugExposureEndDate,
               # Replace Windows newlines with Unix newlines            Timestamp drugExposureStartDate,
               # Replace Windows newlines with Unix newlines            Timestamp drugExposureEndDate,
               # Replace Windows newlines with Unix newlines            Long personId,
               # Replace Windows newlines with Unix newlines            Integer drugConceptId,
               # Replace Windows newlines with Unix newlines            Integer drugTypeConceptId,
               # Replace Windows newlines with Unix newlines            String stopReason,
               # Replace Windows newlines with Unix newlines            Short refills,
               # Replace Windows newlines with Unix newlines            Integer drugQuantity,
               # Replace Windows newlines with Unix newlines            Short daysSupply,
               # Replace Windows newlines with Unix newlines            String sig,
               # Replace Windows newlines with Unix newlines            Integer routeConceptId,
               # Replace Windows newlines with Unix newlines            String lotNumber,
               # Replace Windows newlines with Unix newlines            Integer providerId,
               # Replace Windows newlines with Unix newlines            Long visitOccurrenceId,
               # Replace Windows newlines with Unix newlines            String drugSourceValue,
               # Replace Windows newlines with Unix newlines            Integer drugSourceConceptId,
               # Replace Windows newlines with Unix newlines            String routeSourceValue,
               # Replace Windows newlines with Unix newlines            String doseUnitSourceValue
               # Replace Windows newlines with Unix newlines            ) {
               # Replace Windows newlines with Unix newlines    this.drugExposureId = drugExposureId;
               # Replace Windows newlines with Unix newlines        this.drugExposureStartDate = drugExposureStartDate;
               # Replace Windows newlines with Unix newlines        this.drugExposureEndDate = drugExposureEndDate;
               # Replace Windows newlines with Unix newlines        this.personId = personId;
               # Replace Windows newlines with Unix newlines        this.drugConceptId = drugConceptId;
               # Replace Windows newlines with Unix newlines        this.drugTypeConceptId = drugTypeConceptId;
               # Replace Windows newlines with Unix newlines        this.stopReason = stopReason;
               # Replace Windows newlines with Unix newlines        this.refills = refills;
               # Replace Windows newlines with Unix newlines        this.drugQuantity = drugQuantity;
               # Replace Windows newlines with Unix newlines        this.daysSupply = daysSupply;
               # Replace Windows newlines with Unix newlines    this.sig = sig;
               # Replace Windows newlines with Unix newlines    
               # Replace Windows newlines with Unix newlines    // v5 additions
               # Replace Windows newlines with Unix newlines    this.routeConceptId = routeConceptId;
               # Replace Windows newlines with Unix newlines    this.lotNumber = lotNumber;
               # Replace Windows newlines with Unix newlines    this.providerId = providerId;
               # Replace Windows newlines with Unix newlines    this.visitOccurrenceId = visitOccurrenceId;
               # Replace Windows newlines with Unix newlines    this.drugSourceValue = drugSourceValue;
               # Replace Windows newlines with Unix newlines    this.drugSourceConceptId = drugSourceConceptId;
               # Replace Windows newlines with Unix newlines    this.routeSourceValue = routeSourceValue;
               # Replace Windows newlines with Unix newlines    this.doseUnitSourceValue = doseUnitSourceValue;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines     
               # Replace Windows newlines with Unix newlines    // Property accessors
               # Replace Windows newlines with Unix newlines    @Id
               # Replace Windows newlines with Unix newlines    @Column(name="DRUG_EXPOSURE_ID", unique=true, nullable=false, insertable=false, updatable=false, precision=15, scale=0)
               # Replace Windows newlines with Unix newlines    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HIBERNATE_SEQUENCE_GENERATOR")
               # Replace Windows newlines with Unix newlines    @SequenceGenerator(name="HIBERNATE_SEQUENCE_GENERATOR", sequenceName="HIBERNATE_SEQUENCE", initialValue = 1, allocationSize = 1)
               # Replace Windows newlines with Unix newlines    Long drugExposureId;
               # Replace Windows newlines with Unix newlines    public Long getDrugExposureId() {
               # Replace Windows newlines with Unix newlines        return this.drugExposureId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    
               # Replace Windows newlines with Unix newlines    public void setDrugExposureId(Long drugExposureId) {
               # Replace Windows newlines with Unix newlines        this.drugExposureId = drugExposureId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    //@Column(name="DRUG_EXPOSURE_START_DATE", unique=false, nullable=true, insertable=true, updatable=true, length=7)
               # Replace Windows newlines with Unix newlines    // Calendar drugExposureStartDate;
               # Replace Windows newlines with Unix newlines    // public Calendar getDrugExposureStartDate() {
               # Replace Windows newlines with Unix newlines    //     return this.drugExposureStartDate;
               # Replace Windows newlines with Unix newlines    // }    
               # Replace Windows newlines with Unix newlines    // public void setDrugExposureStartDate(Calendar drugExposureStartDate) {
               # Replace Windows newlines with Unix newlines    //     this.drugExposureStartDate = drugExposureStartDate;
               # Replace Windows newlines with Unix newlines    // }
               # Replace Windows newlines with Unix newlines    @Column(name="DRUG_EXPOSURE_START_DATETIME", unique=false, nullable=true, insertable=true, updatable=true, length=7)
               # Replace Windows newlines with Unix newlines    Timestamp drugExposureStartDate;
               # Replace Windows newlines with Unix newlines    public Timestamp getDrugExposureStartDate() {
               # Replace Windows newlines with Unix newlines        return this.drugExposureStartDate;
               # Replace Windows newlines with Unix newlines    }    
               # Replace Windows newlines with Unix newlines    public void setDrugExposureStartDate(Timestamp drugExposureStartDate) {
               # Replace Windows newlines with Unix newlines        this.drugExposureStartDate = drugExposureStartDate;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    
               # Replace Windows newlines with Unix newlines    //@Column(name="DRUG_EXPOSURE_END_DATE", unique=false, nullable=true, insertable=true, updatable=true, length=7)
               # Replace Windows newlines with Unix newlines    // Calendar drugExposureEndDate;
               # Replace Windows newlines with Unix newlines    // public Calendar getDrugExposureEndDate() {
               # Replace Windows newlines with Unix newlines    //     return this.drugExposureEndDate;
               # Replace Windows newlines with Unix newlines    // }
               # Replace Windows newlines with Unix newlines    // public void setDrugExposureEndDate(Calendar drugExposureEndDate) {
               # Replace Windows newlines with Unix newlines    //     this.drugExposureEndDate = drugExposureEndDate;
               # Replace Windows newlines with Unix newlines    // }
               # Replace Windows newlines with Unix newlines    @Column(name="DRUG_EXPOSURE_END_DATETIME", unique=false, nullable=true, insertable=true, updatable=true, length=7)
               # Replace Windows newlines with Unix newlines    Timestamp drugExposureEndDate;
               # Replace Windows newlines with Unix newlines    public Timestamp getDrugExposureEndDate() {
               # Replace Windows newlines with Unix newlines        return this.drugExposureEndDate;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setDrugExposureEndDate(Timestamp drugExposureEndDate) {
               # Replace Windows newlines with Unix newlines        this.drugExposureEndDate = drugExposureEndDate;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="PERSON_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=12, scale=0)
               # Replace Windows newlines with Unix newlines    Long personId;
               # Replace Windows newlines with Unix newlines    public Long getPersonId() {
               # Replace Windows newlines with Unix newlines        return this.personId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setPersonId(Long personId) {
               # Replace Windows newlines with Unix newlines        this.personId = personId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="DRUG_CONCEPT_ID", unique=false, nullable=true, insertable=true, updatable=true, precision=8, scale=0)
               # Replace Windows newlines with Unix newlines    Integer drugConceptId;
               # Replace Windows newlines with Unix newlines    public Integer getDrugConceptId() {
               # Replace Windows newlines with Unix newlines        return this.drugConceptId;
               # Replace Windows newlines with Unix newlines    }    
               # Replace Windows newlines with Unix newlines    public void setDrugConceptId(Integer drugConceptId) {
               # Replace Windows newlines with Unix newlines        this.drugConceptId = drugConceptId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="DRUG_TYPE_CONCEPT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=8, scale=0)
               # Replace Windows newlines with Unix newlines    Integer drugTypeConceptId;
               # Replace Windows newlines with Unix newlines    public Integer getDrugTypeConceptId() {
               # Replace Windows newlines with Unix newlines        return this.drugTypeConceptId;
               # Replace Windows newlines with Unix newlines    } 
               # Replace Windows newlines with Unix newlines    public void setDrugTypeConceptId(Integer drugTypeConceptId) {
               # Replace Windows newlines with Unix newlines        this.drugTypeConceptId = drugTypeConceptId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="STOP_REASON", unique=false, nullable=true, insertable=true, updatable=true, length=20)
               # Replace Windows newlines with Unix newlines    String stopReason;
               # Replace Windows newlines with Unix newlines    public String getStopReason() {
               # Replace Windows newlines with Unix newlines        return this.stopReason;
               # Replace Windows newlines with Unix newlines    }    
               # Replace Windows newlines with Unix newlines    public void setStopReason(String stopReason) {
               # Replace Windows newlines with Unix newlines        this.stopReason = stopReason;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="REFILLS", unique=false, nullable=true, insertable=true, updatable=true, precision=3, scale=0)
               # Replace Windows newlines with Unix newlines    Short refills;
               # Replace Windows newlines with Unix newlines    public Short getRefills() {
               # Replace Windows newlines with Unix newlines        return this.refills;
               # Replace Windows newlines with Unix newlines    }    
               # Replace Windows newlines with Unix newlines    public void setRefills(Short refills) {
               # Replace Windows newlines with Unix newlines        this.refills = refills;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="QUANTITY", unique=false, nullable=true, insertable=true, updatable=true, precision=4, scale=0)
               # Replace Windows newlines with Unix newlines    Integer drugQuantity;
               # Replace Windows newlines with Unix newlines    public Integer getDrugQuantity() {
               # Replace Windows newlines with Unix newlines        return this.drugQuantity;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setDrugQuantity(Integer drugQuantity) {
               # Replace Windows newlines with Unix newlines        this.drugQuantity = drugQuantity;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="DAYS_SUPPLY", unique=false, nullable=true, insertable=true, updatable=true, precision=4, scale=0)
               # Replace Windows newlines with Unix newlines    Short daysSupply;
               # Replace Windows newlines with Unix newlines    public Short getDaysSupply() {
               # Replace Windows newlines with Unix newlines        return this.daysSupply;
               # Replace Windows newlines with Unix newlines    }    
               # Replace Windows newlines with Unix newlines    public void setDaysSupply(Short daysSupply) {
               # Replace Windows newlines with Unix newlines        this.daysSupply = daysSupply;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="SIG", unique=false, nullable=true, insertable=true, updatable=true, length=500)
               # Replace Windows newlines with Unix newlines    String sig;
               # Replace Windows newlines with Unix newlines    public String getSig() {
               # Replace Windows newlines with Unix newlines        return this.sig;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setSig(String sig) {
               # Replace Windows newlines with Unix newlines        this.sig = sig;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    
               # Replace Windows newlines with Unix newlines    @Column(name="ROUTE_CONCEPT_ID", unique=false, nullable=true, insertable=true, updatable=true, precision=8, scale=0)
               # Replace Windows newlines with Unix newlines    Integer routeConceptId;
               # Replace Windows newlines with Unix newlines    public Integer getRouteConceptId() {
               # Replace Windows newlines with Unix newlines    return this.routeConceptId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setRouteConceptId(Integer routeConceptId) {
               # Replace Windows newlines with Unix newlines    this.routeConceptId = routeConceptId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="LOT_NUMBER", unique=false, nullable=true, insertable=true, updatable=true, length=50)
               # Replace Windows newlines with Unix newlines    String lotNumber;
               # Replace Windows newlines with Unix newlines    public String getLotNumber() {
               # Replace Windows newlines with Unix newlines    return this.lotNumber;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setLotNumber(String lotNumber) {
               # Replace Windows newlines with Unix newlines    this.lotNumber = lotNumber;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="PROVIDER_ID", unique=false, nullable=true, insertable=true, updatable=true, precision=8, scale=0)
               # Replace Windows newlines with Unix newlines    Integer providerId;
               # Replace Windows newlines with Unix newlines    public Integer getProviderId() {
               # Replace Windows newlines with Unix newlines    return this.providerId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setProviderId(Integer providerId) {
               # Replace Windows newlines with Unix newlines    this.providerId = providerId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="VISIT_OCCURRENCE_ID", unique=false, nullable=true, insertable=true, updatable=true, precision=8, scale=0)
               # Replace Windows newlines with Unix newlines    Long visitOccurrenceId;
               # Replace Windows newlines with Unix newlines    public Long getVisitOccurrenceId() {
               # Replace Windows newlines with Unix newlines    return this.visitOccurrenceId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setVisitOccurrenceId(Long visitOccurrenceId) {
               # Replace Windows newlines with Unix newlines    this.visitOccurrenceId = visitOccurrenceId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="DRUG_SOURCE_VALUE", unique=false, nullable=true, insertable=true, updatable=true, length=50)
               # Replace Windows newlines with Unix newlines    String drugSourceValue;
               # Replace Windows newlines with Unix newlines    public String getDrugSourceValue() {
               # Replace Windows newlines with Unix newlines    return this.drugSourceValue;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setDrugSourceValue(String drugSourceValue) {
               # Replace Windows newlines with Unix newlines    this.drugSourceValue = drugSourceValue;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="DRUG_SOURCE_CONCEPT_ID", unique=false, nullable=true, insertable=true, updatable=true, precision=8, scale=0)
               # Replace Windows newlines with Unix newlines    Integer drugSourceConceptId;
               # Replace Windows newlines with Unix newlines    public Integer getDrugSourceConceptId() {
               # Replace Windows newlines with Unix newlines    return this.drugSourceConceptId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setDrugSourceConceptId(Integer drugSourceConceptId) {
               # Replace Windows newlines with Unix newlines    this.drugSourceConceptId = drugSourceConceptId;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="ROUTE_SOURCE_VALUE", unique=false, nullable=true, insertable=true, updatable=true, length=50)
               # Replace Windows newlines with Unix newlines    String routeSourceValue;
               # Replace Windows newlines with Unix newlines    public String getRouteSourceValue() {
               # Replace Windows newlines with Unix newlines    return this.routeSourceValue;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setRouteSourceValue(String routeSourceValue) {
               # Replace Windows newlines with Unix newlines    this.routeSourceValue = routeSourceValue;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines    @Column(name="DOSE_UNIT_SOURCE_VALUE", unique=false, nullable=true, insertable=true, updatable=true, length=50)
               # Replace Windows newlines with Unix newlines    String doseUnitSourceValue;
               # Replace Windows newlines with Unix newlines    public String getDoseUnitSourceValue() {
               # Replace Windows newlines with Unix newlines    return this.doseUnitSourceValue;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines    public void setDoseUnitSourceValue(String doseUnitSourceValue) {
               # Replace Windows newlines with Unix newlines    this.doseUnitSourceValue = doseUnitSourceValue;
               # Replace Windows newlines with Unix newlines    }
               # Replace Windows newlines with Unix newlines
               # Replace Windows newlines with Unix newlines}
               # Replace Windows newlines with Unix newlines