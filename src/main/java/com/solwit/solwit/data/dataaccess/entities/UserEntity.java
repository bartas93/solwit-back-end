package com.solwit.solwit.data.dataaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
public class UserEntity extends AbstractEntity {

	@Column(length = 50)
	private String name;
	@Column(length = 100)
	private String surname;
	@Column(length = 4, nullable = false)
	private int birthYear;
	private boolean isActive;

	@Builder
	public UserEntity(Long id, String name, String surname, int birthYear, boolean isActive) {
		super(id);
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.isActive = isActive;
	}

}
