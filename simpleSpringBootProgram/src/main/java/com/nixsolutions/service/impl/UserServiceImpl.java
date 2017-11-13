package com.nixsolutions.service.impl;

import com.nixsolutions.domain.User;
import com.nixsolutions.repository.UserRepository;
import com.nixsolutions.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Володимир Майборода on 11.11.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public void createUpdateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.delete(id);
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findOne(id);
    }
}
