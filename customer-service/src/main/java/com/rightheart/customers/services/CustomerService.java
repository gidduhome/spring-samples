package com.rightheart.customers.services;

import com.rightheart.customers.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {

    public Customer getCustomer(String customerId){
        return new Customer()
                .withId(customerId)
                .withCustomerName("Venkat G");
    }

    public void saveCustomer(Customer customer){

    }

    public void updateCustomer(Customer customer){

    }

    public void deleteCustomer(Customer customer){

    }

}
