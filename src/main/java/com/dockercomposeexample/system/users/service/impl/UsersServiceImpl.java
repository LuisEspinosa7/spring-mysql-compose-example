//Copyright 2024 Luis Hernan Espinosa
package com.dockercomposeexample.system.users.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.dockercomposeexample.system.users.api.User;
import com.dockercomposeexample.system.users.api.request.UserRequest;
import com.dockercomposeexample.system.users.api.response.UsersResponse;
import com.dockercomposeexample.system.users.dao.UsersDao;
import com.dockercomposeexample.system.users.entity.UserEntity;
import com.dockercomposeexample.system.users.service.UsersService;

/**
 * The Class UsersServiceImpl.
 * 
 * @author luishernan.espinosa
 */
@Service
public class UsersServiceImpl implements UsersService {
	
	private final ModelMapper modelMapper;
	private final UsersDao usersDao;

	public UsersServiceImpl(ModelMapper modelMapper, UsersDao usersDao) {
		this.modelMapper = modelMapper;
		this.usersDao = usersDao;
	}

	@Override
	public void addUser(UserRequest request) {
		UserEntity userEntity = modelMapper.map(request, UserEntity.class);
		usersDao.saveUser(userEntity);
	}

	@Override
	public UsersResponse getUsers() {
		UsersResponse response = new UsersResponse();
		
		List<UserEntity> userEntityList = usersDao.getUsers();
		
		List<User> userList = userEntityList.stream()
				.map(userItem -> {
					return modelMapper.map(userItem, User.class);
				}).collect(Collectors.toList());
		
		response.setUsers(userList);
		return response;
	}

}
