package com.paulolopes.cleanarch.dataprovider.client.mapper;

import org.mapstruct.Mapper;

import com.paulolopes.cleanarch.core.domain.Address;
import com.paulolopes.cleanarch.dataprovider.client.response.AddressResponse;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
	Address toAddress(AddressResponse addressResponse);
}
