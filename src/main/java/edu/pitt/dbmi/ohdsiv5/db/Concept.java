package edu.pitt.dbmi.ohdsiv5.db;
// Generated Aug 25, 2010 7:28:02 AM by Hibernate Tools 3.1.0.beta4

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Calendar;

/**
 * Concept generated by hbm2java
 */
@Entity
@Table(name="CONCEPT", uniqueConstraints = {  })

public class Concept  implements java.io.Serializable {

    // Fields    
    private Integer conceptId;
    private String conceptName;
    private String domainId;
    private String vocabularyId;
    private String conceptClassId;
    private String standardConcept;
    private String conceptCode;
    private Calendar validStartDate;
    private Calendar validEndDate;
    private String invalidReason;

    // Constructors
    /** default constructor */
    public Concept() {
    }

    /** minimal constructor */
    public Concept(Integer conceptId, String conceptName, String vocabularyId, String conceptCode) {
	this.conceptId = conceptId;
	this.conceptName = conceptName;
	this.vocabularyId = vocabularyId;
	this.conceptCode = conceptCode;
    }
    
    /** full constructor */
    public Concept(Integer conceptId, String conceptName, String vocabularyId, String conceptCode, String conceptClassId) {
	this.conceptId = conceptId;
	this.conceptName = conceptName;
	this.vocabularyId = vocabularyId;
	this.conceptCode = conceptCode;
	this.conceptClassId = conceptClassId;
    }
   
    // Property accessors
    @Id
    @Column(name="CONCEPT_ID", unique=true, nullable=false, insertable=true, updatable=true, precision=22, scale=0)
    //@OneToMany (  mappedBy="targetConceptId", fetch=FetchType.EAGER, targetEntity=SourceToConceptMap.class, cascade=CascadeType.ALL)
    public Integer getConceptId() {
	return conceptId;
    }
    public void setConceptId(Integer conceptId) {
	this.conceptId = conceptId;
    }
    
    @Column(name="CONCEPT_NAME", unique=true, nullable=false, insertable=true, updatable=true, length=255, scale=0)
    public String getConceptName() {
	return conceptName;
    }
    public void setConceptName(String conceptName) {
	this.conceptName = conceptName;
    }
   
    @Column(name="DOMAIN_ID", unique=true, nullable=false, insertable=true, updatable=true, length=20, scale=0)
    public String getDomainId() {
	return domainId;
    }
    public void setDomainId(String domainId) {
	this.domainId = domainId;
    }
    
    @Column(name="VOCABULARY_ID", unique=true, nullable=false, insertable=true, updatable=true, length=20, scale=0)
    public String getVocabularyId() {
	return vocabularyId;
    }
    public void setVocabularyId(String vocabularyId) {
	this.vocabularyId = vocabularyId;
    }

    @Column(name="CONCEPT_CLASS_ID", unique=true, nullable=false, insertable=true, updatable=true, length=20, scale=0)
    public String getConceptClassId() {
	return conceptClassId;
    }
    public void setConceptClassId(String conceptClassId) {
	this.conceptClassId = conceptClassId;
    }

    @Column(name="STANDARD_CONCEPT", unique=true, nullable=true, insertable=true, updatable=true, length=1, scale=0)
    public String getStandardConcept() {
	return standardConcept;
    }
    public void setStandardConcept(String standardConcept) {
	this.standardConcept = standardConcept;
    }

    @Column(name="CONCEPT_CODE", unique=true, nullable=false, insertable=true, updatable=true, length=50, scale=0)
    public String getConceptCode() {
	return conceptCode;
    }
    public void setConceptCode(String conceptCode) {
	this.conceptCode = conceptCode;
    }

    @Column(name="VALID_START_DATE", unique=true, nullable=false, insertable=true, updatable=true, length=7)
    public Calendar getValidStartDate() {
	return validStartDate;
    }
    public void setValidStartDate(Calendar validStartDate) {
	this.validStartDate = validStartDate;
    }

    @Column(name="VALID_END_DATE", unique=true, nullable=false, insertable=true, updatable=true, length=7)
    public Calendar getValidEndDate() {
	return validEndDate;
    }
    public void setValidEndDate(Calendar validEndDate) {
	this.validEndDate = validEndDate;
    }

    @Column(name="INVALID_REASON", unique=true, nullable=true, insertable=true, updatable=true, length=1, scale=0)
    public String getInvalidReason() {
	return invalidReason;
    }
    public void setInvalidReason(String invalidReason) {
	this.invalidReason = invalidReason;
    }
}