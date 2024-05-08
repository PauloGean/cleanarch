package com.paulolopes.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paulolopes.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.paulolopes.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.paulolopes.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.paulolopes.cleanarch.dataprovider.UpdateCustomerImpl;

@Configuration
public class UpdateCustomerConfig {
	@Bean
	public UpdateCustomerUseCaseImpl updateCustomerUseCaseConfig(FindAddressByZipCode findAddressByZipCode,
			FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, UpdateCustomerImpl updateCustomer) {
		return new UpdateCustomerUseCaseImpl(findAddressByZipCode,findCustomerByIdUseCase,updateCustomer);
	}

}
