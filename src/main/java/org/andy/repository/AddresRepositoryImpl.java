package org.andy.repository;

import org.andy.model.Address;
import org.andy.repository.base.BaseRepositoryImpl;

public class AddresRepositoryImpl extends BaseRepositoryImpl<Address> implements AddresRepository{
    public AddresRepositoryImpl() {
        super(Address.class);
    }
}
