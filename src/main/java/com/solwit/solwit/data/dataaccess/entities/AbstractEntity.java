package com.solwit.solwit.data.dataaccess.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Version;

import lombok.Data;

@Data
public class AbstractEntity {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	@Column(columnDefinition = "bigint DEFAULT 0")
	private long version;
	private LocalDateTime creationDateTime;

	@PrePersist
	public void createCreationDate() {
		this.creationDateTime = LocalDateTime.now();
	}
}
