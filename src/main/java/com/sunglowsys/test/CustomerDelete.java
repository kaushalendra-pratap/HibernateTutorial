package com.sunglowsys.test;

import com.sunglowsys.service.CustomerServiceImpl;

public class CustomerDelete {
    public static void main(String[] args) {
        new CustomerServiceImpl().delete(1l);
    }
}
