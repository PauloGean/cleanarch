package com.paulolopes.cleanarch.entrypoint.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.paulolopes.cleanarch.core.domain.Customer;
import com.paulolopes.cleanarch.entrypoint.controller.reponse.CustomerResponse;
import com.paulolopes.cleanarch.entrypoint.controller.request.CustomerRequest;

@Mapper(componentModel ="spring")
public interface CustomerMapper {
	@Mapping(target = "id",ignore = true)
	@Mapping(target = "address",ignore = true)
	@Mapping(target = "isValidCpf",ignore = true)
	Customer toCustomer(CustomerRequest customerRequest);
	
	
	CustomerResponse toCustomerResponse(Customer customer);
}
