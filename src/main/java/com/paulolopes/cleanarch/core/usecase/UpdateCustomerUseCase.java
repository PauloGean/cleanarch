package com.paulolopes.cleanarch.core.usecase;

import com.paulolopes.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {
	void update(Customer customer, String zipCode);

}
