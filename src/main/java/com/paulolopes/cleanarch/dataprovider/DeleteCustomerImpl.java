package com.paulolopes.cleanarch.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paulolopes.cleanarch.core.dataprovider.DeleteCustomer;
import com.paulolopes.cleanarch.dataprovider.repository.CustomerRepository;
@Component
public class DeleteCustomerImpl implements DeleteCustomer {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void delete(String id) {
		customerRepository.deleteById(id);
	}
}
