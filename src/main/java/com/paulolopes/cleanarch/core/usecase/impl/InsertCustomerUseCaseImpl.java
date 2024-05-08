package com.paulolopes.cleanarch.core.usecase.impl;

import com.paulolopes.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.paulolopes.cleanarch.core.dataprovider.InsertCustomer;
import com.paulolopes.cleanarch.core.dataprovider.SendCpfForValidation;
import com.paulolopes.cleanarch.core.domain.Customer;
import com.paulolopes.cleanarch.core.usecase.InsertCustormerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustormerUseCase {
	private final FindAddressByZipCode findAddressByZipCode ;
	private final InsertCustomer insertCustomer ;
	private final SendCpfForValidation cpfForValidation;



	public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer,SendCpfForValidation cpfForValidation) {
		this.findAddressByZipCode = findAddressByZipCode;
		this.insertCustomer = insertCustomer;
		this.cpfForValidation=cpfForValidation;
	}


	@Override
	public void insert(Customer customer, String zipCode) {
		var address = findAddressByZipCode.find(zipCode);
		customer.setAddress(address);
		insertCustomer.insert(customer);
		this.cpfForValidation.send(customer.getCpf());
	}

}
