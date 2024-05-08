package com.paulolopes.cleanarch.entrypoint.consumer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.paulolopes.cleanarch.core.domain.Customer;
import com.paulolopes.cleanarch.entrypoint.consumer.message.CustomerMessage;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {
	@Mapping(target = "address" , ignore = true)
	Customer toCustomer(CustomerMessage customerMessage);
}
