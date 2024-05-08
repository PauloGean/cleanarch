package com.paulolopes.cleanarch.core.usecase;

import com.paulolopes.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {
	Customer find(String id);
}
