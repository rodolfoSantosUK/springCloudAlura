package br.com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.dto.CompraDTO;
import br.com.microservice.service.CompraService;

@RestController
@RequestMapping("/compra")
public class LojaController {	
	
	@Autowired
	private CompraService compraService;
		
	
	@RequestMapping(method = RequestMethod.POST)
	public void realizaCompra(@RequestBody CompraDTO compraDto) {
			compraService.realizaCompra(compraDto);
	}

	
	
}
