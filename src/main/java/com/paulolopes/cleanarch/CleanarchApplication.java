package com.paulolopes.cleanarch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;


@EnableFeignClients("com.paulolopes")
//@ImportAutoConfiguration({FeignAutoConfiguration.class})
//@ImportAutoConfiguration({FeignAutoConfiguration.class, HttpClientConfiguration.class})
@SpringBootApplication
public class CleanarchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanarchApplication.class, args);
	}

}
