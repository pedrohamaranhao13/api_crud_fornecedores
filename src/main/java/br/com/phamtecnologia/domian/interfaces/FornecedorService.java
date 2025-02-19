package br.com.phamtecnologia.domian.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.phamtecnologia.domian.entities.Fornecedor;

public interface FornecedorService {

	void create(Fornecedor fornecedor) throws Exception;
	void update(Fornecedor fornecedor) throws Exception;
	void delete(UUID id) throws Exception;
	
	List<Fornecedor> findAll() throws Exception;
	Fornecedor findById(UUID id) throws Exception;
}
