package com.learning.expensetrackerapi.services;

import com.learning.expensetrackerapi.domain.User;
import com.learning.expensetrackerapi.exceptions.EtAuthException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registeruser(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }
}
