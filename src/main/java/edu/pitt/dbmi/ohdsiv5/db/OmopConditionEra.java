package edu.pitt.dbmi.ohdsiv5.db;
// Generated Jun 15, 2010 5:43:59 PM by Hibernate Tools 3.1.0.beta4

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * OmopConditionEra generated by hbm2java
 */
@Entity
@Table(name="OMOP_CONDITION_ERA")

public class OmopConditionEra  implements java.io.Serializable {


    // Fields    

     private Long id;


    // Constructors

    /** default constructor */
    public OmopConditionEra() {
    }

    
    /** full constructor */
    public OmopConditionEra(Long id) {
        this.id = id;
    }
    

   
    // Property accessors
    @EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="conditionEraId", column=@Column(name="CONDITION_ERA_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=15, scale=0) ), 
        @AttributeOverride(name="conditionEraStartDate", column=@Column(name="CONDITION_ERA_START_DATE", unique=false, nullable=true, insertable=true, updatable=true, length=7) ), 
        @AttributeOverride(name="personId", column=@Column(name="PERSON_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=15, scale=0) ), 
        @AttributeOverride(name="confidence", column=@Column(name="CONFIDENCE", unique=false, nullable=true, insertable=true, updatable=true, precision=22, scale=0) ), 
        @AttributeOverride(name="conditionEraEndDate", column=@Column(name="CONDITION_ERA_END_DATE", unique=false, nullable=true, insertable=true, updatable=true, length=7) ), 
        @AttributeOverride(name="conditionConceptId", column=@Column(name="CONDITION_CONCEPT_ID", unique=false, nullable=true, insertable=true, updatable=true, precision=15, scale=0) ), 
        @AttributeOverride(name="conditionOccurrenceType", column=@Column(name="CONDITION_OCCURRENCE_TYPE", unique=false, nullable=false, insertable=true, updatable=true, length=3) ), 
        @AttributeOverride(name="conditionOccurrenceCount", column=@Column(name="CONDITION_OCCURRENCE_COUNT", unique=false, nullable=true, insertable=true, updatable=true, precision=15, scale=0) ) } )

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
   








}