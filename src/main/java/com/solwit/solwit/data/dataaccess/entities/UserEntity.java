package com.solwit.solwit.data.dataaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class UserEntity extends AbstractEntity {

	@Column(length = 50)
	private String name;
	@Column(length = 100)
	private String nazwisko;
	@Column(length = 4, nullable = false)
	private int birthYear;
	private boolean isActive;

}
