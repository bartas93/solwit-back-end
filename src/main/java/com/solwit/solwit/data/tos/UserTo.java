package com.solwit.solwit.data.tos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTo {

	private Long id;
	private String name;
	private String surname;
	private int birthYear;
	private boolean isActive;
}
