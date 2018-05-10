package com.solwit.solwit.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solwit.solwit.data.dataaccess.entities.UserEntity;
import com.solwit.solwit.data.dataaccess.repositories.UserRepository;
import com.solwit.solwit.data.mappers.UserMapper;
import com.solwit.solwit.data.tos.UserTo;
import com.solwit.solwit.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserTo updateUser(UserTo userTo) {
		UserEntity userEntity = UserMapper.map(userTo);
		return UserMapper.map(userRepository.save(userEntity));
	}

	@Override
	public UserTo addUser(UserTo userTo) {
		UserEntity userEntity = UserMapper.map(userTo);
		userEntity.setId(null);
		return UserMapper.map(userRepository.save(userEntity));
	}

	@Override
	public UserTo getUser(Long id) {
		return UserMapper.map(userRepository.findOne(id));
	}

	@Override
	public List<UserTo> getAllUsers() {
		return UserMapper.map(userRepository.findAll());
	}

	@Override
	public void removeUser(Long id) {
		userRepository.delete(id);
	}

}
