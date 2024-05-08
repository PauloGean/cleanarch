package com.paulolopes.cleanarch.entrypoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulolopes.cleanarch.core.usecase.DeleteCustomerUseCase;
import com.paulolopes.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.paulolopes.cleanarch.core.usecase.InsertCustormerUseCase;
import com.paulolopes.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.paulolopes.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.paulolopes.cleanarch.entrypoint.controller.reponse.CustomerResponse;
import com.paulolopes.cleanarch.entrypoint.controller.request.CustomerRequest;



@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
	@Autowired
	private InsertCustormerUseCase insertCustormerUseCase;
	@Autowired
	private FindCustomerByIdUseCase findCustomerByIdUseCase;
	@Autowired
	private UpdateCustomerUseCase updateCustomerUseCase;
	@Autowired
	private DeleteCustomerUseCase deleteCustomerUseCase;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody CustomerRequest  customerRequest){
		var customer =customerMapper.toCustomer(customerRequest);
		insertCustormerUseCase.insert(customer, customerRequest.getZipCode());
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
		var customer=findCustomerByIdUseCase.find(id);
		var customerResponse = customerMapper.toCustomerResponse(customer);
		return ResponseEntity.ok().body(customerResponse);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> update(@PathVariable final String id,@RequestBody CustomerRequest  customerRequest){
		var customer =customerMapper.toCustomer(customerRequest);
		customer.setId(id);
		updateCustomerUseCase.update(customer, customerRequest.getZipCode());
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable final String id){
		deleteCustomerUseCase.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}
