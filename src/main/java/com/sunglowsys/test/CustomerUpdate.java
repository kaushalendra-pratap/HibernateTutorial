package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class CustomerUpdate {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setEmail("mohit@gmail.com");
        new CustomerServiceImpl().update(customer,1L);
    }
}
