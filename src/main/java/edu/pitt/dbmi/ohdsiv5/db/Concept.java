package edu.pitt.dbmi.ohdsiv5.db;
// Generated Aug 25, 2010 7:28:02 AM by Hibernate Tools 3.1.0.beta4

import java.sql.Timestamp;

/**
 * Concept generated by hbm2java
 */

public class Concept  {

    // Fields    
    private Integer conceptId;
    private String conceptName;
    private String domainId;
    private String vocabularyId;
    private String conceptClassId;
    private String standardConcept;
    private String conceptCode;
    private Timestamp validStartDate;
    private Timestamp validEndDate;
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
    public Integer getConceptId() {
	return conceptId;
    }
    public void setConceptId(Integer conceptId) {
	this.conceptId = conceptId;
    }
    
        public String getConceptName() {
	return conceptName;
    }
    public void setConceptName(String conceptName) {
	this.conceptName = conceptName;
    }
   
        public String getDomainId() {
	return domainId;
    }
    public void setDomainId(String domainId) {
	this.domainId = domainId;
    }
    
        public String getVocabularyId() {
	return vocabularyId;
    }
    public void setVocabularyId(String vocabularyId) {
	this.vocabularyId = vocabularyId;
    }

        public String getConceptClassId() {
	return conceptClassId;
    }
    public void setConceptClassId(String conceptClassId) {
	this.conceptClassId = conceptClassId;
    }

        public String getStandardConcept() {
	return standardConcept;
    }
    public void setStandardConcept(String standardConcept) {
	this.standardConcept = standardConcept;
    }

        public String getConceptCode() {
	return conceptCode;
    }
    public void setConceptCode(String conceptCode) {
	this.conceptCode = conceptCode;
    }

        public Timestamp getValidStartDate() {
	return validStartDate;
    }
    public void setValidStartDate(Timestamp validStartDate) {
	this.validStartDate = validStartDate;
    }

        public Timestamp getValidEndDate() {
	return validEndDate;
    }
    public void setValidEndDate(Timestamp validEndDate) {
	this.validEndDate = validEndDate;
    }

        public String getInvalidReason() {
	return invalidReason;
    }
    public void setInvalidReason(String invalidReason) {
	this.invalidReason = invalidReason;
    }
}
