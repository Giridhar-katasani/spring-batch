package com.customer.amex.config;

import org.springframework.batch.item.ItemProcessor;

import com.customer.amex.entity.Customer;


public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(com.customer.amex.entity.Customer item) throws Exception {
        // Your processing logic here
        return item;
    }
}

