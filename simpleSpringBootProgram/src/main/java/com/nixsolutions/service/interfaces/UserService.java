package com.nixsolutions.service.interfaces;

import com.nixsolutions.domain.User;

import java.util.List;

/**
 * Created by Володимир Майборода on 11.11.2017.
 */
public interface UserService {

    List<User> getAllUser();

    void createUpdateUser(User user);

    void deleteUser(Integer id);

    User findById(Integer id);
}
