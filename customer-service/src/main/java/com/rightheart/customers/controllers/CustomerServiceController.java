package com.rightheart.customers.controllers;

import com.rightheart.customers.model.Customer;
import com.rightheart.customers.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value="v1/customers")
public class CustomerServiceController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/{customerId}",method = RequestMethod.GET)
    public Customer getCustomers( @PathVariable("customerId") String customerId) {

        return new Customer()
            .withId(customerId)
            .withCustomerName("Venkat");
    }

    @RequestMapping(value="{customerId}",method = RequestMethod.PUT)
    public String updateCustomers( @PathVariable("customerId") String customerId) {
        return String.format("This is the put");
    }

    @RequestMapping(value="{customerId}",method = RequestMethod.POST)
    public String saveCustomers( @PathVariable("customerId") String customerId) {
        return String.format("This is the post");
    }

    @RequestMapping(value="{customerId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteCustomers( @PathVariable("customerId") String customerId) {
        return String.format("This is the Delete");
    }
}
