package com.solwit.solwit.services;

import java.util.List;

import com.solwit.solwit.data.tos.UserTo;

public interface UserService {
	UserTo updateUser(UserTo userTo);

	UserTo addUser(UserTo userTo);

	UserTo getUser(Long id);

	List<UserTo> getAllUsers();

	void removeUser(Long id);

}
