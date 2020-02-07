package com.cloud.service;

import com.cloud.model.UserAddress;

import java.util.List;

public interface UserAddressService {

    List<UserAddress>  getUserAddressList(String uid);
}
