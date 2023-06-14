package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;



@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	@JsonProperty
    private String ename;

}
