package com.cloud.service;

import com.cloud.model.UserAddress;

import java.util.List;

public interface OrderService {

    List<UserAddress> initOrder(String uid);
}
