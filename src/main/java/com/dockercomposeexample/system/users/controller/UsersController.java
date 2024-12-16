//Copyright 2024 Luis Hernan Espinosa
package com.dockercomposeexample.system.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dockercomposeexample.system.users.api.request.UserRequest;
import com.dockercomposeexample.system.users.api.response.UsersResponse;
import com.dockercomposeexample.system.users.service.UsersService;

/**
 * The Class UsersController.
 * 
 * @author luishernan.espinosa
 */
@RestController
@RequestMapping("/v1/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping()
	public ResponseEntity<UsersResponse> getUsers(){
		return ResponseEntity.ok(usersService.getUsers());
	}
	
	@PostMapping()
	public ResponseEntity<Void> addUser(@RequestBody UserRequest request){
		usersService.addUser(request);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
}
