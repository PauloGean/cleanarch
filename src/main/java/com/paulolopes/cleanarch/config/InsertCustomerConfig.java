package com.paulolopes.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paulolopes.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.paulolopes.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.paulolopes.cleanarch.dataprovider.InsertCustomerImpl;
import com.paulolopes.cleanarch.dataprovider.SendCpfForValidationImpl;

@Configuration
public class InsertCustomerConfig {

	@Bean
	public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCodeImpl, InsertCustomerImpl insertCustomerImpl,
			SendCpfForValidationImpl cpfForValidation) {
			return new InsertCustomerUseCaseImpl(findAddressByZipCodeImpl,insertCustomerImpl,cpfForValidation);
	}

}
