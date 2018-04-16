package com.project.model;

import com.project.model.enums.FlightClass;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.*;

/**
 *
 * @author Pmalek
 */

@Entity
@Table(name="FLIGTS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Flight implements Serializable {
    
    @Column(name="FLT_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="FLT_COMPANY", nullable=false, length=25)
    private String company;    //DICTIONARY ?
    
    @Column(name="FLT_ORIGIN", nullable=false, length=3)
    private String origin;    //DICTIONARY ?
    
    @Column(name="FLT_DESTINATION", nullable=false, length=3)
    private String destination;    //DICTIONARY ?
  
    @Column(name="FLT_DAPARTURE_DATE", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date departureDate;
    
    @Column(name="FLT_CLASS", nullable=false, length=1)
    @Enumerated(EnumType.STRING)
    private FlightClass TravelClass;
    
    @Column(name="FLT_PRICE", nullable=false,  precision=10, scale=2)          //10 znakow, w tym 2 po przecinku
    private double price;
    
    @ManyToOne(fetch=FetchType.EAGER)                                           //1 do wielu
    @JoinColumn(name="CUS_ID")                                                 //jeden customer moze miec kilka lotow w bazie
    private User user;
    
}
