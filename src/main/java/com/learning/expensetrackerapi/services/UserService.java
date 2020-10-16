package com.learning.expensetrackerapi.services;

import com.learning.expensetrackerapi.domain.User;
import com.learning.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registeruser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
