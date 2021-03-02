package br.com.microservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.microservice.dto.InfoFornecedorDTO;

@FeignClient("fornecedor")
public interface FornecedorClient {
	
	@RequestMapping("/info/{estado}")
	public InfoFornecedorDTO  getInfoPorEstado(@PathVariable String estado) ;
}
