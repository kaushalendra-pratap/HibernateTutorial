package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

import java.util.List;

public class CustomerFindAll {
    public static void main(String[] args){
        List<Customer> customerList = new CustomerServiceImpl().findAll();
        for (Customer customer  : customerList){
            System.out.println("done");

        }
    }
}
