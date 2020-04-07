package com.beeu.userservice.service;

import com.beeu.userservice.database.entity.UserEntity;
import com.beeu.userservice.database.repository.UserRepository;
import com.beeu.userservice.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserLogicService {

    @Autowired
    private UserRepository repository;

    /**
     * Save new user
     *
     * @param user
     */
    public void saveUser(User user) {

        /**
         * Create entity
         */
        UserEntity userEntity = new UserEntity();
        userEntity.setBeeId(user.getId());
        userEntity.setActive(true);
        userEntity.setBirthdate(user.getBirthdate());
        userEntity.setCompany(user.getCompany());
        userEntity.setFiscalCode(user.getFiscalCode());
        userEntity.setNote(user.getNote());
        userEntity.setName(user.getName());
        userEntity.setMiddle_name(user.getMiddleName());
        userEntity.setSurname(user.getSurname());
        userEntity.setMarketing_accepted(user.getMarketing_accepted());
        userEntity.setService_accepted(user.getService_accepted());
        userEntity.setTitle(user.getTitle());
        userEntity.setRelation(user.getRelation());
        userEntity.setUrl(user.getUrl());
        userEntity.setCreation_date(new Date());
        userEntity.setLast_update_date(new Date());

        /**
         * Persists
         */
        repository.save(userEntity);
    }

    /**
     * Update new user
     *
     * @param user
     */
    public void updateUser(User user) {

    }

    /**
     * Activate user
     *
     * @param beeId
     */
    public void activateUser(String beeId) {

    }

    /**
     * Deactivate user
     *
     * @param beeId
     */
    public void deactivateUser(String beeId) {

    }
}
