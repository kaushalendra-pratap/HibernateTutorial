package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import com.sunglowsys.service.CustomerServiceImpl;

public class SaveCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("govind","singh","govind4you531@gmail","24456677");
        new CustomerRepositoryImpl().save(customer);
    }
}
