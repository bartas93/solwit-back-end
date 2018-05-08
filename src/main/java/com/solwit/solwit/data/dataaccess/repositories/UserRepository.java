package com.solwit.solwit.data.dataaccess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solwit.solwit.data.dataaccess.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
