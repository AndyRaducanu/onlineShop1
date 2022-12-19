package org.andy.repository;

import org.andy.model.Address;
import org.andy.repository.base.BaseRepositoryImpl;

public class AddressRepositoryImpl extends BaseRepositoryImpl<Address> implements AddressRepository {
    public AddressRepositoryImpl() {
        super(Address.class);
    }
}
