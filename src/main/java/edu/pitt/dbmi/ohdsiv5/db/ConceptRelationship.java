package edu.pitt.dbmi.ohdsiv5.db;
// Generated Aug 25, 2010 7:48:41 AM by Hibernate Tools 3.1.0.beta4

import java.sql.Timestamp;

/**
 * ConceptRelationship generated by hbm2java
 */

public class ConceptRelationship  {


    // Fields    

    private String relationshipId;
    private Integer conceptId1;
    private Integer conceptId2;
    private Timestamp validStartDate;
    private Timestamp validEndDate;
    private String invalidReason;


    // Constructors

    /** default constructor */
    public ConceptRelationship() {
    }

    
    /** full constructor */
    public ConceptRelationship(String relationshipId, Integer conceptId1, Integer conceptId2) {
        this.relationshipId = relationshipId;
        this.conceptId1 = conceptId1;
        this.conceptId2 = conceptId2;	
    }
    

   
    // Property accessors
        
    public String getRelationshipId() {
        return this.relationshipId;
    }
    
    public void setRelationshipId(String relationshipId) {
        this.relationshipId = relationshipId;
    }
    
    public Integer getConceptId1() {
        return this.conceptId1;
    }
    
    public void setConceptId1(Integer conceptId1) {
        this.conceptId1 = conceptId1;
    }
    
    public Integer getConceptId2() {
        return this.conceptId2;
    }
    
    public void setConceptId2(Integer conceptId2) {
        this.conceptId2 = conceptId2;
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
