package com.solwit.solwit.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.solwit.solwit.data.tos.UserTo;
import com.solwit.solwit.services.UserService;

@RestController
@RequestMapping("/users")
public class UserRestController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public List<UserTo> getAllUsers() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserTo getUser(@PathVariable("id") Long id) {
		return userService.getUser(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public UserTo addUser(@RequestBody UserTo userTo) {
		return userService.addUser(userTo);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public UserTo updateUser(@RequestBody UserTo userTo) {
		return userService.updateUser(userTo);
	}

}
