package br.com.phamtecnologia.domian.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.phamtecnologia.domian.entities.Fornecedor;
import br.com.phamtecnologia.dtos.FornecedorResponseDto;

public interface FornecedorService {

	void create(FornecedorResponseDto dto) throws Exception;
	void update(Fornecedor fornecedor) throws Exception;
	void delete(UUID id) throws Exception;
	
	List<Fornecedor> findAll() throws Exception;
	Fornecedor findById(UUID id) throws Exception;
}
