//Copyright 2024 Luis Hernan Espinosa
package com.dockercomposeexample.system.users.api.response;

import java.util.List;

import com.dockercomposeexample.system.users.api.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class UsersResponse.
 * 
 * @author luishernan.espinosa
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsersResponse {
	
	List<User> users;
	
}
