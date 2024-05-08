package com.paulolopes.cleanarch.dataprovider.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.paulolopes.cleanarch.dataprovider.client.response.AddressResponse;

@FeignClient(name = "FindAddressByZipCodeClient", url = "${paulolopes.client.address.url}")
public interface FindAddressByZipCodeClient {

	@GetMapping("/{zipCode}")
	AddressResponse find(@PathVariable("zipCode") String zipCode);

}