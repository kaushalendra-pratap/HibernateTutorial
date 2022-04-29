package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class CustomerFindById {
    public static void main(String[] args) {
        Customer customer = new CustomerServiceImpl().findById(1L);
        System.out.println("customer");
    }
}
