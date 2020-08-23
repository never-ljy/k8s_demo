package com.fh.address.service;

import com.fh.address.model.Address;
import com.fh.common.ServerResponse;

public interface AddressService {




    ServerResponse queryAddressList();

    void del(Integer id);

    void upd(Address address);

    void updStatus(Integer id);

    Address selectOne(Integer addressId);
}
