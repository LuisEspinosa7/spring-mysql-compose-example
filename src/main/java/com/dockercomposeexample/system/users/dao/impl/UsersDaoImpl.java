//Copyright 2024 Luis Hernan Espinosa
package com.dockercomposeexample.system.users.dao.impl;


import java.util.List;

import org.springframework.stereotype.Component;

import com.dockercomposeexample.system.users.dao.UsersDao;
import com.dockercomposeexample.system.users.entity.UserEntity;
import com.dockercomposeexample.system.users.repository.UsersRepository;

import lombok.extern.log4j.Log4j2;

/**
 * The Class UserDaoImpl.
 * 
 * @author luishernan.espinosa
 */
@Log4j2
@Component
public class UsersDaoImpl implements UsersDao {

	/** The repository. */
	private UsersRepository repository;

	/**
	 * Instantiates a new users dao impl.
	 *
	 * @param repository the repository
	 */
	public UsersDaoImpl(UsersRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserEntity saveUser(UserEntity user) {
		return repository.save(user);
	}

	public List<UserEntity> getUsers() {
		return repository.findAll();
	}

}
