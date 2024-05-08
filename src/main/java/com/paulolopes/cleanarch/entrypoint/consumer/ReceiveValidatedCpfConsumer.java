package com.paulolopes.cleanarch.entrypoint.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.paulolopes.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.paulolopes.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.paulolopes.cleanarch.entrypoint.consumer.message.CustomerMessage;

@Component
public class ReceiveValidatedCpfConsumer {
	@Autowired
	private UpdateCustomerUseCase updateCustomerUseCase;
	@Autowired
	private CustomerMessageMapper customerMessageMapper;

	@KafkaListener(topics = "tp-cpf-validated", groupId = "lopes")
	public void receive(CustomerMessage customerMessage) {
		var customer = customerMessageMapper.toCustomer(customerMessage);
		updateCustomerUseCase.update(customer, customerMessage.getZipCode());
	}
}
