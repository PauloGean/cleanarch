package com.paulolopes.cleanarch.dataprovider.repository.mapper;

import org.mapstruct.Mapper;

import com.paulolopes.cleanarch.core.domain.Customer;
import com.paulolopes.cleanarch.dataprovider.repository.entity.CustomerEntity;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
	CustomerEntity toEntity(Customer customer);
	
	Customer toCustomer(CustomerEntity customerEntity);
}
