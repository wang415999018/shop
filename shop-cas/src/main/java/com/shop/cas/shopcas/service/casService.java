package com.shop.cas.shopcas.service;

import com.shop.cas.shopcas.entity.User;

public interface casService {

    public String logined(String userName,String password);

    public boolean register(User user);

}
