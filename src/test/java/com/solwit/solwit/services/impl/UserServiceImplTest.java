package com.solwit.solwit.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.solwit.solwit.data.tos.UserTo;
import com.solwit.solwit.services.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@AutoConfigureDataJpa
public class UserServiceImplTest {

	@Autowired
	private UserService userService;

	@Test
	public void shouldMapUserEntityToUserTo() {
		// given
		// when
		UserTo userTo = userService.getUser(1L);
		// then
		Assert.assertEquals("Alvera", userTo.getName());
		Assert.assertEquals("Ackred", userTo.getSurname());
		Assert.assertEquals(1991, userTo.getBirthYear());
		Assert.assertEquals(false, userTo.isActive());
	}

	@Test
	public void shouldMapUserEntitiesToUserTos() {
		// given
		// when
		List<UserTo> userTos = userService.getAllUsers();
		// then
		Assert.assertEquals(200, userTos.size());
	}

}
