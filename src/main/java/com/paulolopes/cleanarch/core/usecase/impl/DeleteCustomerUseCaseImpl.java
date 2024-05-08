package com.paulolopes.cleanarch.core.usecase.impl;

import com.paulolopes.cleanarch.core.dataprovider.DeleteCustomer;
import com.paulolopes.cleanarch.core.usecase.DeleteCustomerUseCase;
import com.paulolopes.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerUseCaseImpl implements DeleteCustomerUseCase{
	private final FindCustomerByIdUseCase findCustomerByIdUseCase;
	private final DeleteCustomer deleteCustomer;
	
	

	public DeleteCustomerUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomer deleteCustomer) {
		super();
		this.findCustomerByIdUseCase = findCustomerByIdUseCase;
		this.deleteCustomer = deleteCustomer;
	}



	@Override
	public void delete(String id) {
		findCustomerByIdUseCase.find(id);
		deleteCustomer.delete(id);
	}

}
