package com.solwit.solwit.data.mappers;

import java.util.ArrayList;
import java.util.List;

import com.solwit.solwit.data.dataaccess.entities.UserEntity;
import com.solwit.solwit.data.tos.UserTo;

public class UserMapper {

	public static List<UserTo> map(List<UserEntity> userEntities) {
		List<UserTo> userTos = new ArrayList<>();
		if (!userEntities.isEmpty() && userEntities != null) {
			userEntities.forEach(u -> {
				userTos.add(map(u));
			});
		}
		return userTos;
	}

	public static UserTo map(UserEntity userEntity) {
		if (userEntity != null) {
			return new UserTo(userEntity.getId(), userEntity.getName(), userEntity.getSurname(),
					userEntity.getBirthYear(), userEntity.isActive());
		}
		return null;
	}

	public static UserEntity map(UserTo userTo) {
		if (userTo != null) {
			return new UserEntity(userTo.getId(), userTo.getName(), userTo.getSurname(), userTo.getBirthYear(),
					userTo.isActive());
		}
		return null;
	}

}
