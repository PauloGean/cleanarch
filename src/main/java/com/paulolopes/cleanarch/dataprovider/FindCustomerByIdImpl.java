package com.paulolopes.cleanarch.dataprovider;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paulolopes.cleanarch.core.dataprovider.FindCustomerById;
import com.paulolopes.cleanarch.core.domain.Customer;
import com.paulolopes.cleanarch.dataprovider.repository.CustomerRepository;
import com.paulolopes.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
@Component
public class FindCustomerByIdImpl implements FindCustomerById {
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerEntityMapper customerEntityMapper;

	@Override
	public Optional<Customer> find(String id) {
		var customerEntity=customerRepository.findById(id);
		return customerEntity.map( entity -> customerEntityMapper.toCustomer(entity) );
	}

}
