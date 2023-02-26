package com.example.accessingdatamysql;

import jakarta.persistence.*;

import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

	private String email;

	@ElementCollection
	private List<Double> cornerCoords;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public List<Double> getCornerCoords() {
		return cornerCoords;
	}


}

