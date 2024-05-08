package com.paulolopes.cleanarch.core.dataprovider;

import java.util.Optional;

import com.paulolopes.cleanarch.core.domain.Customer;

public interface FindCustomerById {
	Optional<Customer> find(String id);
}
