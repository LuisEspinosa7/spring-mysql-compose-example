//Copyright 2024 Luis Hernan Espinosa
package com.dockercomposeexample.system.users.service;

import com.dockercomposeexample.system.users.api.request.UserRequest;
import com.dockercomposeexample.system.users.api.response.UsersResponse;

/**
 * The Interface UsersService.
 * 
 * @author luishernan.espinosa
 */
public interface UsersService {
	
	void addUser(UserRequest request);
	
	UsersResponse getUsers();
	
}
