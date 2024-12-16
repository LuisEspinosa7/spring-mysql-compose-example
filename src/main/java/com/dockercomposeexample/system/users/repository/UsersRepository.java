//Copyright 2024 Luis Hernan Espinosa
package com.dockercomposeexample.system.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dockercomposeexample.system.users.entity.UserEntity;

/**
 * The Interface UsersRepository.
 * 
 * @author luishernan.espinosa
 */
@Repository
public interface UsersRepository extends JpaRepository<UserEntity, Integer>{
	
}
