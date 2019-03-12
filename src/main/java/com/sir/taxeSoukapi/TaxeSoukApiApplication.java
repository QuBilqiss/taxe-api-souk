package com.sir.taxeSoukapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients("com.sir.taxeSoukapi.rest")
public class TaxeSoukApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxeSoukApiApplication.class, args);
	}

}

