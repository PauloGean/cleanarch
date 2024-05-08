package com.paulolopes.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paulolopes.cleanarch.core.usecase.impl.DeleteCustomerUseCaseImpl;
import com.paulolopes.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.paulolopes.cleanarch.dataprovider.DeleteCustomerImpl;
@Configuration
public class DeleteCustomerByIdConfig {
	
	@Bean
	public DeleteCustomerUseCaseImpl deleteCustomerUseCaseConfig(FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, DeleteCustomerImpl deleteCustomer) {
		return new DeleteCustomerUseCaseImpl(findCustomerByIdUseCase,deleteCustomer);
	}

}
