package com.bwing.service.impl;

import com.bwing.bean.UserAddress;
import com.bwing.service.OrderService;
import com.bwing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;


    @Override
    public void initOrder(int userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        userAddressList.forEach(userAddress -> {
            System.out.println(userAddress.getAddressName());
        });
    }
}
