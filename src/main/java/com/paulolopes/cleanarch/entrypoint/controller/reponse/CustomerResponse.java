package com.paulolopes.cleanarch.entrypoint.controller.reponse;

import lombok.Data;

@Data
public class CustomerResponse {
	private String name;
	private String cpf;
	private AddressResponse address;
	
	private Boolean isValidCpf;
}
