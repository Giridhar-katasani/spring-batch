package com.customer.amex.repo;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.amex.entity.Customer;

@Repository
public interface CustomerRepositary extends JpaRepository<Customer, Serializable> {

}
