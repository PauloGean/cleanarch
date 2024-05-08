package com.paulolopes.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paulolopes.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.paulolopes.cleanarch.dataprovider.FindCustomerByIdImpl;

@Configuration
public class FindCustomerByIdConfig {
	
	@Bean
	public FindCustomerByIdUseCaseImpl findCustomerConfig(FindCustomerByIdImpl findCustomerByIdImpl ) {
			return new FindCustomerByIdUseCaseImpl(findCustomerByIdImpl);
	}

}
