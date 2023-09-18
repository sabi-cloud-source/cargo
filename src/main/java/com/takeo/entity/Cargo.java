package com.takeo.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cargo{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cargoId;
    private String name;
    private String description;
    private double weight;
  @DateTimeFormat(pattern= "yyyy-MM-dd")
  @Temporal(TemporalType.DATE)
   private Date pickupDate;
  @DateTimeFormat(pattern= "yyyy-MM-dd")
  @Temporal(TemporalType.DATE)
    private Date deliveryDate;
	
	
	
	
	
	
}



  