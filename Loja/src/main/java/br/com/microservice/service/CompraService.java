package br.com.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.microservice.client.FornecedorClient;
import br.com.microservice.dto.CompraDTO;
import br.com.microservice.dto.InfoFornecedorDTO;

@Service
public class CompraService {
 
    @Autowired
    private FornecedorClient fornecedorClient;
    
    
    public void realizaCompra(CompraDTO compra) {
        
    	InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());
    	System.out.println(info.getEndereco());
    }
}
