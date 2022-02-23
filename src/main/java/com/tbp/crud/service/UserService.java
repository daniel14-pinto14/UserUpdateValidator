package com.tbp.crud.service;

import com.tbp.crud.dao.UserRepository;
import com.tbp.crud.entity.UserDetails;
import org.apache.commons.logging.Log;
import org.slf4j.ILoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    Logger logger = Logger.getLogger(String.valueOf(UserService.class));

    public UserDetails createUser(UserDetails user) {
        logger.info("Creating an User" );
        return userRepository.save(user);
    }

    public UserDetails getUserById(int id) {
        logger.info("Searching an User By id" );
        return userRepository.findById(id).orElse(null);
    }


    public UserDetails updateUser(UserDetails user) {
        logger.info("Updating an user" );
        UserDetails oldUser = null;
        Optional<UserDetails> optionaluser = userRepository.findById(user.getId());
        if (optionaluser.isPresent()) {
            oldUser = optionaluser.get();
            oldUser.setFirstName(user.getFirstName());
            oldUser.setLastName(user.getFirstName());
            oldUser.setTitle(user.getFirstName());
            oldUser.setAddress(user.getAddress());
            userRepository.save(oldUser);
            logger.info("Updating an user completed" );

        } else {
            return new UserDetails();
        }
        return oldUser;
    }
}
