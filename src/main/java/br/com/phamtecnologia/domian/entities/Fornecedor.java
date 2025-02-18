package br.com.phamtecnologia.domian.entities;

import java.util.UUID;

import lombok.Data;

@Data
public class Fornecedor {

	private UUID id;
	private String nome;
	private String cnpj;
}
