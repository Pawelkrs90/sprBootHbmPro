package com.project.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="DELEGATION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Delegation implements Serializable {

    @Column(name="DEL_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(fetch=FetchType.EAGER)                                        
    @JoinColumn(name="USER_ID")                                                
    private User user;
    
    
    @ManyToOne(fetch=FetchType.EAGER)                                        
    @JoinColumn(name="FLIGHT_ID")                                                
    private Flight flight;
     
        
 //   @ManyToOne(fetch=FetchType.EAGER)                                        
 //   @JoinColumn(name="ROOM_ID")                                                
 //   private Room room;
                        
    
 //   @ManyToMany(fetch=FetchType.LAZY)                                        
   // @JoinColumn(name="TRANS_ID")                                                
  //  private List<AdditionalTransport> additionalTransport;
    
    
  //  @ManyToMany(fetch=FetchType.LAZY)                                        
   // @JoinColumn(name="TRANS_ID")                                                
  //  private List<SpecialPlaces> specialPlaces;   
    
    
    
    
}
