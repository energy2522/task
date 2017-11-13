package com.nixsolutions.repository;

import com.nixsolutions.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Володимир Майборода on 11.11.2017.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
