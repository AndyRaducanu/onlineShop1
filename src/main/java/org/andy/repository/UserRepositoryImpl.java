package org.andy.repository;

import org.andy.model.User;
import org.andy.repository.base.BaseRepositoryImpl;

public class UserRepositoryImpl extends BaseRepositoryImpl<User> implements UserRepository {
    public UserRepositoryImpl() {
        super(User.class);
    }
}
