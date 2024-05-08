package com.paulolopes.cleanarch.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paulolopes.cleanarch.core.dataprovider.InsertCustomer;
import com.paulolopes.cleanarch.core.domain.Customer;
import com.paulolopes.cleanarch.dataprovider.repository.CustomerRepository;
import com.paulolopes.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
@Component
public class InsertCustomerImpl implements InsertCustomer {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerEntityMapper customerEntityMapper;
	@Override
	public void insert(Customer customer) {
		var customerEntity=customerEntityMapper.toEntity(customer);
		customerRepository.save(customerEntity);
	}
	

}
