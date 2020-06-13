package com.spdata.site.dtosTipoContato;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoContatoRequestDto {
	
	@NotNull
	@NotEmpty
	private String					descricao; 	
	private char					ativo;
 	private String					email;
	
	
}
