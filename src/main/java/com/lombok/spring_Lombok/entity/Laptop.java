package com.lombok.spring_Lombok.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Laptop {
//welcome to my world
	@Id
	@GeneratedValue
	private Integer lid;
	private String lname;
	private Double lprice;
}
