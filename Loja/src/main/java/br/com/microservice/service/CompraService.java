package br.com.microservice.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.microservice.dto.CompraDTO;
import br.com.microservice.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	public void realizaCompra(CompraDTO compra) { 
		
		RestTemplate  cliente  = new RestTemplate();
		
	 ResponseEntity<InfoFornecedorDTO> exchange = cliente.exchange("http://localhost:8081/info/" + 
				compra.getEndereco().getEstado(), HttpMethod.GET, 
				null, InfoFornecedorDTO.class);	
		
		System.out.println(exchange.getBody().getEndereco());
		
	}

	
	
	
}
