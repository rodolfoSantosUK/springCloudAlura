package br.com.microservice.fornecedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FornecedorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FornecedorApplication.class, args);
	}

}
