package br.com.phamtecnologia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phamtecnologia.domian.entities.Fornecedor;
import br.com.phamtecnologia.domian.interfaces.FornecedorService;

@RestController
@RequestMapping(value = "/api/fornecedores")
public class FornecedoresController {
	
	@Autowired
	FornecedorService fornecedorService;

	@PostMapping
	public void post() {
		// TODO
	}
	
	@PutMapping
	public void put() {
		// TODO
	}
	
	@DeleteMapping
	public void delete() {
		// TODO
	}
	
	@GetMapping
	public List<Fornecedor> getAll() {
		try {
			return fornecedorService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
