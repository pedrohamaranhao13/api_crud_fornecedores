package br.com.phamtecnologia.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class FornecedorResponseDto {
	
	@Size(min = 8 , max = 100, message = "Nome do fornecedor deve conter de 8 a 100 caracteres.")
	@NotBlank(message = "Nome do fornecedor deve ser preenchido.")
	private String nome;
	
	@Size(min = 18, max = 18, message = "CNPJ deve conter 18 caracteres")
	@NotBlank(message = "CNPJ deve ser preenchido.")
	private String cnpj;

}
