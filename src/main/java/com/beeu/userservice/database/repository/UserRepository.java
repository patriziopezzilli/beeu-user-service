package com.beeu.userservice.database.repository;

import com.beeu.userservice.database.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
