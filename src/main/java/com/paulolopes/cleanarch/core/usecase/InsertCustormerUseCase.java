package com.paulolopes.cleanarch.core.usecase;

import com.paulolopes.cleanarch.core.domain.Customer;

public interface InsertCustormerUseCase {
	void insert(Customer customer, String zipCode);
}
