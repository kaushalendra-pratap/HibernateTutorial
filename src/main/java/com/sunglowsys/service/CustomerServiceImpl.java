package com.sunglowsys.service;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepository;
import com.sunglowsys.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository =  new  CustomerRepositoryImpl();

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void update(Customer customer, long id) {
        customerRepository.update(customer,id);

    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = customerRepository.findAll();
        if (customerList==null){
            System.out.println("data is not available for id");
        }
        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {
        customerRepository.delete(id);

    }
}
