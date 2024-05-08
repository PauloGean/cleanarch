package com.paulolopes.cleanarch.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paulolopes.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.paulolopes.cleanarch.core.domain.Address;
import com.paulolopes.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.paulolopes.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {
	@Autowired
	private FindAddressByZipCodeClient addressByZipCodeClient;
	@Autowired
	private AddressResponseMapper addressResponseMapper;
	
	@Override
	public Address find(String zipCode) {
		var addressResponse= addressByZipCodeClient.find(zipCode);
		return addressResponseMapper.toAddress(addressResponse);
	}

}
