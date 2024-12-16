//Copyright 2024 Luis Hernan Espinosa
package com.dockercomposeexample.system.users.dao;

import java.util.List;

import com.dockercomposeexample.system.users.entity.UserEntity;

/**
 * The Interface UsersDao.
 * 
 * @author luishernan.espinosa
 */
public interface UsersDao {
	
	UserEntity saveUser(UserEntity user);

	List<UserEntity> getUsers();
}
