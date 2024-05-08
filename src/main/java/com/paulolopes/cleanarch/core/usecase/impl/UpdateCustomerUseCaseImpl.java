package com.paulolopes.cleanarch.core.usecase.impl;

import com.paulolopes.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.paulolopes.cleanarch.core.dataprovider.UpdateCustomer;
import com.paulolopes.cleanarch.core.domain.Customer;
import com.paulolopes.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.paulolopes.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase{
	private final FindAddressByZipCode findAddressByZipCode ;
	private final FindCustomerByIdUseCase findCustomerByIdUseCase;
	private final UpdateCustomer updateCustomer;
	
	


	public UpdateCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode,
			FindCustomerByIdUseCase findCustomerByIdUseCase, UpdateCustomer updateCustomer) {
		this.findAddressByZipCode = findAddressByZipCode;
		this.findCustomerByIdUseCase = findCustomerByIdUseCase;
		this.updateCustomer = updateCustomer;
	}




	@Override
	public void update(Customer customer, String zipCode) {
		findCustomerByIdUseCase.find(customer.getId());
		var address = this.findAddressByZipCode.find(zipCode);
		customer.setAddress(address);
		updateCustomer.update(customer);
	}

}
