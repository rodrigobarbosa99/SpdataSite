package com.spdata.site.dtos.contato;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContatoRequestDto {
	
	
	@NotNull
	@NotEmpty
	private String					nome;
	
	@NotNull
	private String					email;
	
	@NotNull
	private String					telefone;
	
	@NotNull
	private String					nomeEmpresa;
	
	@NotNull
	private String					cargo;
	
	@NotNull
	private String					cidade;
	
	@NotNull
	private String					estado;
		
	@NotNull
	private String					mensagem;

}
