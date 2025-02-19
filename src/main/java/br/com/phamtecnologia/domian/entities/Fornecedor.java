package br.com.phamtecnologia.domian.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_fornecedor")
@Data
public class Fornecedor {

	@Id
	@Column(name = "id_pk")
	private UUID id;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "cnpj", length = 20, unique = true)
	private String cnpj;
}
